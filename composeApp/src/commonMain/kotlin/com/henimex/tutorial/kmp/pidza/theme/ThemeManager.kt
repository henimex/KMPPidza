package com.henimex.tutorial.kmp.pidza.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun ThemeManager(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
){
    val colors = if (darkTheme) {
        AppColors(
            background = DarkColors.background,
            mainColor = DarkColors.mainColor,
            typePrimary = DarkColors.typePrimary,
            typeSecondary = DarkColors.typeSecondary,
        )
    } else {
        AppColors(
            background = LightColors.background,
            mainColor = LightColors.mainColor,
            typePrimary = LightColors.typePrimary,
            typeSecondary = LightColors.typeSecondary,
        )
    }

    CompositionLocalProvider(LocalAppColors provides colors) {
        content()
    }
}