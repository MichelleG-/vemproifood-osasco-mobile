package teste.ifood.service.api

import retrofit2.Call
import retrofit2.http.GET
import teste.ifood.model.DishesModel

interface PratosServiceApi {
    @GET("")
    fun getDetalhes(): Call<ArrayList<DishesModel>>
}