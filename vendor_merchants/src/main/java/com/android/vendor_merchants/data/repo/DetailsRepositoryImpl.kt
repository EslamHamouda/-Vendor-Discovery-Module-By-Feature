package com.android.vendor_merchants.data.repo

import com.android.vendor_merchants.data.mapper.MerchantRemoteDomainMapper
import com.android.vendor_merchants.data.service.DetailsService
import com.android.vendor_merchants.domain.model.MerchantDomainModel
import com.android.vendor_merchants.domain.repo.DetailsRepository


class DetailsRepositoryImpl (private val service: DetailsService):
    DetailsRepository {
    override suspend fun getMerchants(vendorId: String): List<MerchantDomainModel> {
        val merchantsResponse = service.getMerchants(vendorId)
        return merchantsResponse.data?.merchants?.map { dto -> MerchantRemoteDomainMapper.toDomain(dto) }
            .orEmpty()
    }
}