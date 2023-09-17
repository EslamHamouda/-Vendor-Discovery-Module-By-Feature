package com.android.vendor.data.model.response

import com.android.vendor.data.model.response.VendorRemoteModel

data class VendorsResponse(
    var vendors: ArrayList<VendorRemoteModel>?,
    var count: Int?
)
