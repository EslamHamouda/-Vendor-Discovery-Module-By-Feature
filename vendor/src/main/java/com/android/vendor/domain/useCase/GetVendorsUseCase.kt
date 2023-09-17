package com.android.vendor.domain.useCase

import androidx.paging.PagingData
import com.android.vendor.domain.model.VendorsDomainModel
import com.android.vendor.domain.repo.VendorsRepository
import kotlinx.coroutines.flow.Flow


class GetVendorsUseCase (private val repository: VendorsRepository) {
    suspend operator fun invoke(
        vendorId: String? = null,
        searchKey: String? = null
    ): Flow<PagingData<VendorsDomainModel>> {
        return repository.getVendors(vendorId, searchKey)
    }
}