package com.android.vendor.data.mapper

import com.android.vendor.domain.model.VendorsDomainModel
import com.android.vendor.data.model.response.VendorRemoteModel

object VendorsDomainMapper{
    fun toDomain(from: VendorRemoteModel) = VendorsDomainModel(
        id = from.id,
        nameEn = from.nameEn,
        nameAr = from.nameAr,
        address = from.address
    )
}