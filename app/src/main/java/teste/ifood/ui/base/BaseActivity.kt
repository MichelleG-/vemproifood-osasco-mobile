package teste.ifood.ui.base

import android.support.v7.app.AppCompatActivity
import teste.ifood.model.Restaurante
import teste.ifood.to.ResponseTO

open class BaseActivity : AppCompatActivity(){

    fun onFailure(result: ResponseTO<Restaurante>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}