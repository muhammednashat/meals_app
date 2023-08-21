package mnshat.dev.data.remote

import mnshat.dev.domain.entity.CategoryResponse
import retrofit2.http.GET
import java.net.CacheResponse

interface ApiService {
    @GET("categories.php")
     fun getMeals():CategoryResponse

}