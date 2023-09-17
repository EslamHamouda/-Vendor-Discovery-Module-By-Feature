package com.android.vendor_merchants.presentation.viewmodel

import com.android.vendor_merchants.domain.model.MerchantDomainModel

sealed class DetailsStates {
    data class Success(val value: List<MerchantDomainModel>) : DetailsStates()
    data class Failure(val throwable: Throwable) : DetailsStates()
    data class Loading(val isLoading: Boolean) : DetailsStates()
}