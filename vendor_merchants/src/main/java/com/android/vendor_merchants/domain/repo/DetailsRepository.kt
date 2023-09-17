package com.android.vendor_merchants.domain.repo

import com.android.vendor_merchants.domain.model.MerchantDomainModel

interface DetailsRepository {
    suspend fun getMerchants(vendorId:String): List<MerchantDomainModel>
}