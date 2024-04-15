package com.loc.newsapp.presentation.onboarding

import android.icu.text.CaseMap.Title
import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "ABC",
        description = "abc",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "ABC",
        description = "abc",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "ABC",
        description = "abc",
        image = R.drawable.onboarding3
    )
)