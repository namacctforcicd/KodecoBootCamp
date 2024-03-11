package com.kodeco.android.coordplot.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun LabelText(){
    Text(text = "Coord Plotter",
        color = Color.Black,
        style = TextStyle(
            fontSize = 20.sp
            // for label text
        ) )
}
