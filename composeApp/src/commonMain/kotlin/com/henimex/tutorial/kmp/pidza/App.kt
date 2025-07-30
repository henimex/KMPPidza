package com.henimex.tutorial.kmp.pidza

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.henimex.tutorial.kmp.pidza.components.ChipButton
import com.henimex.tutorial.kmp.pidza.components.PrimaryButton
import com.henimex.tutorial.kmp.pidza.components.SecondaryButton
import com.henimex.tutorial.kmp.pidza.designFiles.MainColor
import com.henimex.tutorial.kmp.pidza.designFiles.TypeColor2
import com.henimex.tutorial.kmp.pidza.designFiles.getItalicFontFamily
import com.henimex.tutorial.kmp.pidza.designFiles.getMainFontFamily
import kmppidza.composeapp.generated.resources.Res
import kmppidza.composeapp.generated.resources.pizza_third
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview()
fun App() {
    MaterialTheme {
        Column(
            modifier = Modifier
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Pizza",
                color = MainColor,
                fontSize = 46.sp,
                fontFamily = getMainFontFamily()
            )

            Image(painter = painterResource(Res.drawable.pizza_third), "")

            val options = listOf(
                "Margherita",
                "Pepperoni",
                "Four Cheese",
                "Hawaiian",
                "Veggie",
                "Sucuklu Turkish",
                "BBQ Chicken",
                "Meat Lovers",
                "Mushroom",
                "Buffalo Chicken",
                "Supreme",
                "Spinach & Feta",
                "Tuna & Onion",
                "Sausage",
                "Cheese",
                "Olive")

            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(options.size){ item ->
                    ChipButton(options[item])
                }
            }

            Text(
                text = "20 min",
                color = TypeColor2,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Delivery",
                color = MainColor,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Meat lover, get ready to meet your pizza!",
                color = TypeColor2,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = getItalicFontFamily(),
                textAlign = TextAlign.Center
            )

            HorizontalDivider(thickness = 1.dp, color = Color.Black)
            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                SecondaryButton("$ 5.99")
                PrimaryButton("Add to Card")
            }

        }
    }
}