package teste.ifood.service.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import teste.ifood.model.Restaurante

interface PratosServiceApi
{
    @GET("")
    fun getDetalhes(): Call<List<Restaurante>>
}