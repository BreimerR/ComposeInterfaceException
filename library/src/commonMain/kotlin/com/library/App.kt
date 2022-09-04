package com.library

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember



@Composable
fun App() {

    val state = remember { mutableStateOf(0) }

    val m = state.value
    val someImpl = SomeImplementation(m)
    someImpl.add {
        Text("Home")
    }

    someImpl.add {
        Text("Next")
    }

    someImpl.compose()

}