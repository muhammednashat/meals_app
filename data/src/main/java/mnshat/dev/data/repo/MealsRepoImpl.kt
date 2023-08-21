package mnshat.dev.data.repo

import mnshat.dev.data.remote.ApiService
import mnshat.dev.domain.entity.Category
import mnshat.dev.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService):MealsRepo {

    override suspend fun getMealsFromRemotely(): List<Category> = apiService.getMeals().categories

}