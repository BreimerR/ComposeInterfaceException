package com.library.interfaces

import androidx.compose.runtime.Composable

interface SomeCoreScope {
    val someComposables: MutableList<@Composable () -> Unit>
    fun add(composable: @Composable () -> Unit) {
        someComposables.add(composable)
    }
}