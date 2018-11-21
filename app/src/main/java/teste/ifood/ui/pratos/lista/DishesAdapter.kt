package teste.ifood.ui.pratos.lista

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.adapter_dishes.view.*
import teste.ifood.R
import teste.ifood.model.DishesModel

/**
 * Created by Gabriel Marcos on 21/11/2018
 */
class DishesAdapter (private val context: Context,
                     private val listener: DishesListAdapterListener,
                     private val dishes: DishesModel ): RecyclerView.Adapter<DishesAdapter.ViewHolder>() {

    interface DishesListAdapterListener {
        fun onCardClicked(string: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_dishes, parent, false)
        return ViewHolder(view, listener, context)
    }

    override fun getItemCount(): Int {
        return dishes.dishes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(dishes.dishes[position])
    }

    class ViewHolder(itemView: View, val listener: DishesListAdapterListener, val context: Context) : RecyclerView.ViewHolder(itemView) {

        fun bindView(dishe: String){

            itemView.dishesAdapterTitle.text = dishe

            itemView.dishesCell.setOnClickListener {
                listener.onCardClicked(dishe)
            }
        }
    }
}