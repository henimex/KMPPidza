package com.henimex.tutorial.kmp.pidza.designFiles

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import kmppidza.composeapp.generated.resources.Res
import kmppidza.composeapp.generated.resources.lecklerli
import kmppidza.composeapp.generated.resources.noto
import kmppidza.composeapp.generated.resources.notoi
import org.jetbrains.compose.resources.Font

@Composable
fun getMainFontFamily() = FontFamily(Font(Res.font.lecklerli))

@Composable
fun getSecondFontFamily() = FontFamily(Font(Res.font.lecklerli))

@Composable
fun getRegularFontFamily() = FontFamily(Font(Res.font.noto))

@Composable
fun getItalicFontFamily() = FontFamily(Font(Res.font.notoi))