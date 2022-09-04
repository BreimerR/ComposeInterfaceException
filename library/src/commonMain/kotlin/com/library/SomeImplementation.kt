package com.library

import androidx.compose.runtime.Composable
import com.library.interfaces.SomeSubScope

class SomeImplementation(var current: Int = 0, override val composables: MutableList<@Composable () -> Unit> = mutableListOf()) :
    SomeSubScope {

    val currentComposable
        get() = try {
            composables[current]
        } catch (e: IndexOutOfBoundsException) {
            null
        }

    @Composable
    fun compose() = when (val composable = currentComposable) {
        null -> throw RuntimeException()
        else -> composable()
    }

}