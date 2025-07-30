package com.henimex.tutorial.kmp.pidza

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform