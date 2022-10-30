package com.kuluruvineeth.composestockmarket.domain.repository

import com.kuluruvineeth.composestockmarket.domain.models.CompanyInfo
import com.kuluruvineeth.composestockmarket.domain.models.CompanyListing
import com.kuluruvineeth.composestockmarket.domain.models.IntradayInfo
import com.kuluruvineeth.composestockmarket.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ) : Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ) : Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}