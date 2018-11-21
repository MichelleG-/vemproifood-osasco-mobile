package teste.ifood.service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import teste.ifood.constant.ServiceConstant
import java.util.concurrent.TimeUnit

class ServiceApiLocator {
    private val serviceAPILocator: ServiceApiLocator? = null

    fun getInstance(): ServiceApiLocator
    {
        return if (serviceAPILocator == null)
        {
            ServiceApiLocator()
        }
        else serviceAPILocator
    }

    fun <T> lookup(serviceAPI: Class<T>): T
    {
        return this.lookup(serviceAPI, ServiceConstant.URL_DEFAULT)
    }

    fun <T> lookup(serviceAPI: Class<T>, url: String): T {
        val builder = OkHttpClient.Builder()
        builder.connectTimeout(60, TimeUnit.SECONDS)
        builder.readTimeout(60, TimeUnit.SECONDS)
        builder.writeTimeout(60, TimeUnit.SECONDS)

        val okHttpClient = builder.build()
        //this.allowAllCertificate(builder);
        //this.addCertificate(builder);

        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

        return retrofit.create(serviceAPI)
    }
}