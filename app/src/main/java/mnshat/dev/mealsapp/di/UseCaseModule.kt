package mnshat.dev.mealsapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mnshat.dev.data.remote.ApiService
import mnshat.dev.data.repo.MealsRepoImpl
import mnshat.dev.domain.repo.MealsRepo
import mnshat.dev.domain.usecase.GetMeals


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetMeals(repo: MealsRepo):GetMeals{
        return GetMeals(repo)
    }

}