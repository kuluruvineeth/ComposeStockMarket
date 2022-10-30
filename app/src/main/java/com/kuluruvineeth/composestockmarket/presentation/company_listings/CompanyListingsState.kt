package com.kuluruvineeth.composestockmarket.presentation.company_listings

import com.kuluruvineeth.composestockmarket.domain.models.CompanyListing

data class CompanyListingsState(
    val companies: List<CompanyListing> = emptyList(),
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val searchQuery: String = ""
)
