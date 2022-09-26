package com.example.composecampapp

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecampapp.ui.theme.ComposeCampAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Column(modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxSize()
                .padding(50.dp)
                .border(10.dp , Color.Blue )
                .padding(10.dp)
                .border(10.dp, Color.Gray)
                .padding(10.dp)
                .border(10.dp, Color.Magenta)
                .background(Color.Green),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text("Hello", modifier = Modifier.clickable {  })
                Text("World")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello my name is $name and this is my 1st Android app :)", fontSize = 24.sp)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeCampAppTheme {
        Greeting("Android")
    }
}