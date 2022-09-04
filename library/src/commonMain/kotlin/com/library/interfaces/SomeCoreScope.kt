package com.library.interfaces

import androidx.compose.runtime.Composable

interface SomeCoreScope {
    val composables: MutableList<@Composable () -> Unit>
    fun add(composable: @Composable () -> Unit) {
        composables.add(
            composable
        )
    }
}