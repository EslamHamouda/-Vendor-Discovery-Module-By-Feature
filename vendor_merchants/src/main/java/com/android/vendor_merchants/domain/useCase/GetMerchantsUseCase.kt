package com.android.vendor_merchants.domain.useCase

import com.android.vendor_merchants.domain.model.MerchantDomainModel
import com.android.vendor_merchants.domain.repo.DetailsRepository

class GetMerchantsUseCase (private val repository: DetailsRepository) {
    suspend operator fun invoke(vendorId:String): List<MerchantDomainModel> {
            return repository.getMerchants(vendorId)
    }
}