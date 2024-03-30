package com.example.ecommerce.data

data class User(
    val completeName: String,
    val email: String,
    val imagePath: String = ""
){
    constructor(): this("","","")
}
