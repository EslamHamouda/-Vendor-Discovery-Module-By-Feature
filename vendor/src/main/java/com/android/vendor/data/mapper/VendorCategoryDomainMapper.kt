package com.android.vendor.data.mapper

import com.android.vendor.domain.model.VendorCategoryDomainModel
import com.android.vendor.data.model.response.VendorCategoryResponse

object VendorCategoryDomainMapper{
    fun toDomain(from: VendorCategoryResponse) = VendorCategoryDomainModel(
        id = from.id,
        name = from.name,
        arabicName = from.arabicName,
    )
}