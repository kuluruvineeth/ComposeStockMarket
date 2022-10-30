package com.kuluruvineeth.composestockmarket.data.mapper

import com.kuluruvineeth.composestockmarket.data.local.CompanyListingEntity
import com.kuluruvineeth.composestockmarket.data.remote.dto.CompanyInfoDto
import com.kuluruvineeth.composestockmarket.domain.models.CompanyInfo
import com.kuluruvineeth.composestockmarket.domain.models.CompanyListing


fun CompanyListingEntity.toCompanyListing(): CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}


fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity{
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo{
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}