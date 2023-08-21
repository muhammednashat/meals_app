package mnshat.dev.domain.usecase

import mnshat.dev.domain.repo.MealsRepo

class GetMeals(private val mealsRepo: MealsRepo) {

    suspend operator fun invoke() = mealsRepo.getMealsFromRemotely()

}