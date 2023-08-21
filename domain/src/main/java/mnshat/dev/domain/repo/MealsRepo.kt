package mnshat.dev.domain.repo

import mnshat.dev.domain.entity.Category

interface MealsRepo {
   suspend fun getMealsFromRemotely(): List<Category>
}
