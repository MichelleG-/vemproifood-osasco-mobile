package teste.ifood.ui.pratos.lista

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import teste.ifood.R
import teste.ifood.model.DishesModel

class MainActivity : AppCompatActivity(), DishesAdapter.DishesListAdapterListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupAdapter()

    }

    private fun setupAdapter() {
        dishesListRecycler.adapter = DishesAdapter(this, this, createArrayListDishes())
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        dishesListRecycler.layoutManager = layoutManager
    }

    private fun createArrayListDishes(): DishesModel {
        return DishesModel(arrayListOf("Macarronada",
            "Sopa de bicho da seda",
            "lamen",
            "esfiha",
            "lanches",
            "hamburguer",
            "Sopa de bicho da seda",
            "lamen",
            "esfiha",
            "lanches",
            "hamburguer"))
    }

    override fun onCardClicked(string: String) {
    }
}
