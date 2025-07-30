package com.henimex.tutorial.kmp.pidza.components

import androidx.compose.foundation.border
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.henimex.tutorial.kmp.pidza.designFiles.MainColor
import com.henimex.tutorial.kmp.pidza.designFiles.TypeColor1
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun ChipButton(data: String){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MainColor,
            contentColor = TypeColor1,
        )
    ) {
        Text(text = data)
    }
}