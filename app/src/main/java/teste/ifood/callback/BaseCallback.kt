package teste.ifood.callback

import android.os.Parcel
import android.os.Parcelable
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import teste.ifood.CallbackSync
import teste.ifood.enums.ErrorEnum
import teste.ifood.to.ResponseTO

class BaseCallback<T>(callbackSync: CallbackSync<T>) : Callback<T>
{
    var callback :  CallbackSync<T>? = null;

    init
    {
        callback = callbackSync
    }
    override fun onFailure(call: Call<T>, t: Throwable)
    {
    }

    override fun onResponse(call: Call<T>, response: Response<T>)
    {
    }

    fun onSucessResponse(responseTO: ResponseTO<T>)
    {
        this.callback?.onSuccess(responseTO)
    }

    fun onFailureResponse(responseTO: ResponseTO<T>)
    {
        this.callback?.onFailure(responseTO)
    }

    fun checkResponse(response: Response<*>?, error: ErrorEnum)
    {
        if (response == null || response.code() != 200 || response.raw().code() != 200)
        {
           // throw ServiceBusinessException(error)
        }
    }
}