package com.henimex.tutorial.kmp.pidza.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class AppColors(
    val mainColor: Color,
    val typePrimary: Color,
    val typeSecondary: Color,
    val background: Color,
)

val LocalAppColors = staticCompositionLocalOf<AppColors> {
    error("Renk Teması Bulunamadı")
}
