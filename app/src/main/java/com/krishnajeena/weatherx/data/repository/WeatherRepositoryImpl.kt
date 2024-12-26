package com.krishnajeena.weatherx.data.repository

import com.krishnajeena.weatherx.data.mappers.toWeatherInfo
import com.krishnajeena.weatherx.data.remote.WeatherXApi
import com.krishnajeena.weatherx.domain.repository.WeatherRepository
import com.krishnajeena.weatherx.domain.util.Resource
import com.krishnajeena.weatherx.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherXApi
): WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try{
Resource.Success(
    data = api.getWeatherData(
        lat = lat,
        long = long
    ).toWeatherInfo()
)
        } catch (e: Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")

        }
    }
}