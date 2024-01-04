package com.example.mviapp.sealedclass

import androidx.compose.runtime.Composable
import com.example.mviapp.Greeting
import com.example.mviapp.R

typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object Info : TabItem(R.drawable.ic_info_yellow, "Info", { Greeting("Music A") })
    object InfoLinked : TabItem(R.drawable.gopay_linked, "Linked", { Greeting("Music B") })
    object InfoNotLinked : TabItem(R.drawable.gopay_not_linked, "Not Linked", { Greeting("Music C") })
}