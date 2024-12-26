package com.krishnajeena.weatherx.di

import com.krishnajeena.weatherx.data.location.DefaultLocationTracker
import com.krishnajeena.weatherx.data.repository.WeatherRepositoryImpl
import com.krishnajeena.weatherx.domain.location.LocationTracker
import com.krishnajeena.weatherx.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository

}