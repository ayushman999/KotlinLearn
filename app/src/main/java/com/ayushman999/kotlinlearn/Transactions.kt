package com.ayushman999.kotlinlearn

data class Transactions(
    val title: String,
    val date : String,
    val time : String,
    val amt : Double,
    val paid : String?,
    val borrowed : Double?,
    val bucket : String
)