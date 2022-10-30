package com.kuluruvineeth.composestockmarket.presentation.company_info

import com.kuluruvineeth.composestockmarket.domain.models.CompanyInfo
import com.kuluruvineeth.composestockmarket.domain.models.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
