package com.example.kittens.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Kitten(
    @DrawableRes val imageId: Int,
    @StringRes val nameId: Int,
    @StringRes val ageId: Int,
    @StringRes val descriptionId: Int,
)
