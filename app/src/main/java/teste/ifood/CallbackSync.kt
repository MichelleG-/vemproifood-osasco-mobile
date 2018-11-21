package teste.ifood

import teste.ifood.to.ResponseTO

interface CallbackSync<T>
{
    fun onSuccess(result: ResponseTO<T>)
    fun onFailure(result: ResponseTO<T>)
}
