package teste.ifood.callback

import android.os.Parcel
import android.os.Parcelable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import teste.ifood.CallbackSync
import teste.ifood.enums.ErrorEnum
import teste.ifood.to.ResponseTO

/*class BaseCallback<T>(private val callbackSync: CallbackSync) : Callback<T>
    override fun onResponse(call: Call<T>, response: Response<T>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onFailure(call: Call<T>, t: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun onSucessResponse(responseTO: ResponseTO) {
        this.callbackSync.onSuccess(responseTO)
    }

    fun onFailureResponse(responseTO: ResponseTO) {
        this.callbackSync.onFailure(responseTO)
    }

    fun checkResponse(response: Response<*>?, error: ErrorEnum) {
        if (response == null || response.code() != 200 || response.raw().code() != 200)
        {
           // throw ServiceBusinessException(error)
        }
    }
}*/