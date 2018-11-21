package teste.ifood.service.api

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Gabriel Marcos on 21/11/2018
 */

class RetrofitHelper {
    companion object {
        fun getRetrofit(context: Context): Retrofit {
            val retrofit = Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
        }
    }
}