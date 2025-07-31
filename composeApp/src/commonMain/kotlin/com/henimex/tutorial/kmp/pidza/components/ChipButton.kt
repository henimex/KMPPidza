package com.henimex.tutorial.kmp.pidza.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.henimex.tutorial.kmp.pidza.theme.LocalAppColors
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun ChipButton(data: String){
    val colors = LocalAppColors.current
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = colors.mainColor,
            contentColor = colors.typePrimary,
        ),
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 4.dp, // subtle shadow
            pressedElevation = 6.dp
        ),
    ) {
        Text(text = data)
    }
}