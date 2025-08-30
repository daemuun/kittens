package com.example.kittens.data

import com.example.kittens.R
import com.example.kittens.model.Kitten

object Datasource {
    fun getKittensList(): List<Kitten> {
        return listOf(
            Kitten(R.drawable.kitten1, R.string.kitten_name1, R.string.kitten_age1, R.string.kitten_description1),
            Kitten(R.drawable.kitten2, R.string.kitten_name2, R.string.kitten_age2, R.string.kitten_description2),
            Kitten(R.drawable.kitten3, R.string.kitten_name3, R.string.kitten_age3, R.string.kitten_description3),
            Kitten(R.drawable.kitten4, R.string.kitten_name4, R.string.kitten_age4, R.string.kitten_description4),
            Kitten(R.drawable.kitten5, R.string.kitten_name5, R.string.kitten_age5, R.string.kitten_description5),
            Kitten(R.drawable.kitten6, R.string.kitten_name6, R.string.kitten_age6, R.string.kitten_description6),
            Kitten(R.drawable.kitten7, R.string.kitten_name7, R.string.kitten_age7, R.string.kitten_description7),
            Kitten(R.drawable.kitten8, R.string.kitten_name8, R.string.kitten_age8, R.string.kitten_description8),
        )
    }
}