package com.android.vendor.data.model

data class BaseResponse<T>(
    var status: Int,
    var message: String?,
    var data: T?
)
