package com.example.actividad

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad.ui.theme.Yellow2


@Composable
fun Main(){
    Box(modifier = Modifier.fillMaxSize() ){
        Content()
    }
}
@Composable
fun Content(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround){
        Filas(R.drawable.img, descripcion ="##")

        Text(text = "Please use the link below to verify your\n"+
            "email and start your journey", modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
            textAlign = TextAlign.Center,
            fontSize= 16.sp,
            fontFamily = FontFamily.SansSerif

        )
        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
            colors = ButtonDefaults.buttonColors(Yellow2)
        ) {
            Text(text = "Ingresar")

        }
    }
}


@Composable
fun Filas(
    img:Int,
    descripcion:String,
    modifier: Modifier=Modifier.fillMaxWidth(),
    imgModifier : Modifier = Modifier
        .width(450.dp)
        .height(550.dp)
){
    Row(modifier = modifier, horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = img ), contentDescription = descripcion, modifier = imgModifier )
    }

}



@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain(){
    Main()
}