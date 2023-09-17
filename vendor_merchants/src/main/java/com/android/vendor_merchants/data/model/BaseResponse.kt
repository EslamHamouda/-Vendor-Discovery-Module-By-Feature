package com.android.vendor_merchants.data.model

data class BaseResponse<T>(
    var status: Int,
    var message: String?,
    var data: T?
)
