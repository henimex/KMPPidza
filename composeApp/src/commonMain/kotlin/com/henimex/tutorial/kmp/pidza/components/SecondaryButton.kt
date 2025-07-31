package com.henimex.tutorial.kmp.pidza.components

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.henimex.tutorial.kmp.pidza.theme.LocalAppColors
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun SecondaryButton(data: String){
    val colors = LocalAppColors.current
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = colors.background,
            contentColor = colors.mainColor
        ),
        modifier = Modifier.border(
            width = 1.dp,
            color = colors.mainColor,
            shape = RoundedCornerShape(24.dp)
        )
    ) {
        Text(text = data, fontSize = 24.sp, fontWeight = FontWeight.Bold)
    }
}