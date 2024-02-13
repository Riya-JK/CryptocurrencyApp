package com.riya.cryptocurrencyapp.domain.repository

import com.riya.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.riya.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}