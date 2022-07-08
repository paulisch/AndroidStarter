package com.psdev.androidstarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.ui.res.stringResource
import com.psdev.core.R
import com.psdev.androidstarter.ui.theme.AppStarterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppStarterTheme {
                Text(text = stringResource(id = R.string.welcome_text))
            }
        }
    }
}