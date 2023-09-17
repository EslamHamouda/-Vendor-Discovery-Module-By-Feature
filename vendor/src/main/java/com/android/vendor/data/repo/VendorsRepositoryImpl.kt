package com.android.vendor.data.repo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.android.vendor.data.mapper.VendorCategoryDomainMapper
import com.android.vendor.domain.model.VendorCategoryDomainModel
import com.android.vendor.domain.repo.VendorsRepository
import com.android.vendor.data.service.VendorsService


class VendorsRepositoryImpl (private val service: VendorsService) :
    VendorsRepository {

    override suspend fun getVendorCategory(): List<VendorCategoryDomainModel> {
        val vendorsResponse = service.getVendorCategory()
        return vendorsResponse.data?.map { dto -> VendorCategoryDomainMapper.toDomain(dto) }
            .orEmpty()
    }

    override suspend fun getVendors(
        vendorId: String?,
        searchKey: String?
    ) =
        Pager(
            config = PagingConfig(
                pageSize = 20,
                enablePlaceholders = false,
                initialLoadSize = 2
            ),
            pagingSourceFactory = {
                VendorsPagingSource(vendorId, searchKey, service)
            }, initialKey = 0
        ).flow
}