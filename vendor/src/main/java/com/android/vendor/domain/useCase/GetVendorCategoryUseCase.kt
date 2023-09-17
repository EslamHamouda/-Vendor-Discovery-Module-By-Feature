package com.android.vendor.domain.useCase

import com.android.vendor.domain.model.VendorCategoryDomainModel
import com.android.vendor.domain.repo.VendorsRepository

class GetVendorCategoryUseCase (private val repository: VendorsRepository) {
    suspend operator fun invoke(): List<VendorCategoryDomainModel> {
            return repository.getVendorCategory()
    }
}