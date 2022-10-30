package com.kuluruvineeth.composestockmarket.di

import com.kuluruvineeth.composestockmarket.data.csv.CSVParser
import com.kuluruvineeth.composestockmarket.data.csv.CompanyListingParser
import com.kuluruvineeth.composestockmarket.data.csv.IntradayInfoParser
import com.kuluruvineeth.composestockmarket.data.repository.StockRepositoryImpl
import com.kuluruvineeth.composestockmarket.domain.models.CompanyInfo
import com.kuluruvineeth.composestockmarket.domain.models.CompanyListing
import com.kuluruvineeth.composestockmarket.domain.models.IntradayInfo
import com.kuluruvineeth.composestockmarket.domain.repository.StockRepository
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
    abstract fun bindCompanyListingsParser(
        companyListingParser: CompanyListingParser
    ): CSVParser<CompanyListing>


    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}