package mnshat.dev.mealsapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mnshat.dev.data.remote.ApiService
import mnshat.dev.data.repo.MealsRepoImpl
import mnshat.dev.domain.repo.MealsRepo


@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService):MealsRepo{
        return MealsRepoImpl(apiService)
    }

}