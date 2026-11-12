package com.example.butarqueapp

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun ButtonComposable(){
    Button(onClick = { }) {
        Text(text = "Ver Puntos", fontFamily = FontFamily.SansSerif)
    }
}
