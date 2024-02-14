package com.kodeco.android.coordplot.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kodeco.android.coordplot.R

@Composable
fun Map(xPercent: Float, yPercent: Float, modifier: Modifier = Modifier) {
    // TODO fill out the square map here.
    //  Create a Box composable with a size of 300.dp
    //  and then create an inner Box composable
    //  with a clip shape of CircleShape.
    val image = painterResource(id = R.drawable.heli_pic )
    Box(

        modifier = Modifier
            .size(300.dp)
            .background(Color.Gray)
            .fillMaxWidth(),

        contentAlignment = Alignment.Center

    ){
        Image(painter =image , contentDescription ="Helicopter",
            modifier = Modifier
                .offset((xPercent * 300 - 150).dp, (yPercent * 300 - 150).dp)
                .size(36.dp)

        )


//        Box(
//            modifier = Modifier
//                .offset((xPercent * 300 - 150).dp, (yPercent * 300 - 150).dp)
//
//                .background(Color.Red)
//                .size(12.dp),
//
//            //contentAlignment = Alignment.Center
//            ) {
//
//
//        }

    }
}