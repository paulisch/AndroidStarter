package com.psdev.androidstarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.psdev.core.R
import com.psdev.androidstarter.ui.theme.AppStarterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppStarterTheme {
                MainActivityContent()
            }
        }
    }
}

@Composable
fun MainActivityContent() {
    Text(
        text = stringResource(id = R.string.welcome_text)
    )
}

@Preview
@Composable
fun ComposablePreview() {
    MainActivityContent()
}