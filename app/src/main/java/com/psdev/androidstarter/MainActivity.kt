package com.psdev.androidstarter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = stringResource(id = R.string.welcome_text),
            style = MaterialTheme.typography.h1,
            color = MaterialTheme.colors.primary
        )
    }
}

@Preview
@Composable
fun ComposablePreview() {
    MainActivityContent()
}