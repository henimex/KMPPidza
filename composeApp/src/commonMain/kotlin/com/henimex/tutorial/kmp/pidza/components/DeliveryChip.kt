package com.henimex.tutorial.kmp.pidza.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.henimex.tutorial.kmp.pidza.designFiles.MainColor
import kmppidza.composeapp.generated.resources.Res
import kmppidza.composeapp.generated.resources.timer
import org.jetbrains.compose.resources.painterResource


@Composable
fun DeliveryChip(specText:String, timerText:String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.Gray,
                shape = RoundedCornerShape(50)
            )
            .background(Color.White, shape = RoundedCornerShape(50))
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        Image(
            painterResource(Res.drawable.timer),
            contentDescription = "",
            modifier = Modifier.size(22.dp)
        )

        Spacer(modifier = Modifier.width(6.dp))
        Text(
            text = timerText,
            color = Color.Black,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = specText,
            color = MainColor,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    }

}