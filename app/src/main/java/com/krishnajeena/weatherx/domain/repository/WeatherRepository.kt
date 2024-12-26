package com.krishnajeena.weatherx.domain.repository

import com.krishnajeena.weatherx.domain.util.Resource
import com.krishnajeena.weatherx.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}