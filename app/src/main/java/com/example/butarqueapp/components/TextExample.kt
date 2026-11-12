package com.example.butarqueapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun TextExample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White.copy(alpha = 0.95f), shape = RoundedCornerShape(12.dp))
            .padding(12.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Vida Vecinal",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Movimientos vecinales y vida en el barrio",
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Aquí va tu frase sobre la capa",
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Italic,
            fontSize = 11.sp,
            color = Color(0xFF757575),
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "3 puntos en el mapa",
            fontWeight = FontWeight.Bold,
            fontSize = 11.sp,
            color = Color(0xFFFF5722)
        )
    }
}


