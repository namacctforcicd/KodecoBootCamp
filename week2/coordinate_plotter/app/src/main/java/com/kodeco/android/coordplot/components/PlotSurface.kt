package com.kodeco.android.coordplot.components

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kodeco.android.coordplot.R

@Composable
fun PlotSurface() {
    var xPercentage: Float by rememberSaveable { mutableFloatStateOf(0.5f) } // .05f
    var yPercentage: Float by rememberSaveable { mutableFloatStateOf(0.5f) }
    val scrollState = rememberScrollState()
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        // TODO Build out the plot surface
        //  This should include a Column composable that
        //  includes a Map, and two MapSlider composables
        //  (one slider for each axis).
        Column(
            modifier = Modifier
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,


            ) {

            LabelText()
            Spacer(
                modifier = Modifier
                    .size(20.dp) // size to be adjusted
            )

            Map(xPercent = xPercentage, yPercent = yPercentage)

            Row() {

                Text(
                    text = stringResource(R.string.X_axis),
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Black,
                    fontSize = 24.sp,
                    modifier = Modifier.padding(start = 3.dp)
                )
                Text(text = "${(xPercentage * 100).toInt()}%",
                    fontSize = 23.sp,)

                Slider(
                    modifier = Modifier,
                    value = xPercentage,

                    // slider added for spacing
                    onValueChange = { xPercentage = it },


                    )
            }

            Row() {

                Text(
                    text = stringResource(R.string.Y_axis),
                    textAlign = TextAlign.Left,
                    fontWeight = FontWeight.Black,
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(start = 3.dp)


                )
                Text(
                    text = "${(yPercentage * 100).toInt()}%",
                    fontSize = 23.sp,
                )
                Slider(
                    modifier = Modifier,
                    value = yPercentage,
                    // onValueChange =   { 1.0f .. 100.0f }
                    onValueChange = { yPercentage = it },
                    // valueRange = 0.0f .. 1.0f
                )

            }
        }
    }
}

