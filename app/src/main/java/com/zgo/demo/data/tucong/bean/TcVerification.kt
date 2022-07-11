package com.zgo.demo.data.tucong.bean


import com.google.gson.annotations.SerializedName

data class TcVerification(
    @SerializedName("verification_reason")
    var verificationReason: String = "", // 资深风光摄影师
    @SerializedName("verification_type")
    var verificationType: Int = 0 // 13
)