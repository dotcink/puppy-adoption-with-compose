package com.example.androiddevchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.getPuppyList
import com.example.androiddevchallenge.ui.theme.MyTheme

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val puppy = intent.getSerializableExtra("puppy") as Puppy
        setContent {
            MyTheme {
                DetailPage(puppy = puppy)
            }
        }
    }
}


// Start building your app here!
@Composable
private fun DetailPage(puppy: Puppy) {
    val context = LocalContext.current
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(id = puppy.image),
                contentDescription = puppy.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(Dp(196f))
                    .fillMaxWidth()
            )
            Column(
                Modifier.padding(all = Dp(8f))
            ) {
                Text(text = puppy.name, fontSize = 36.sp)
                Box(Modifier.height(Dp(12f)))
                Text(
                    text = puppy.desc,
                    fontSize = 12.sp,
                )
                Box(Modifier.height(Dp(12f)))
                Button(onClick = {
                    Toast.makeText(context, "Adopted", Toast.LENGTH_LONG).show()
                }) {
                    Text(text = "Adopt")
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun DetailLightPreview() {
    MyTheme {
        DetailPage(getPuppyList()[0])
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DetailDarkPreview() {
    MyTheme(darkTheme = true) {
        DetailPage(getPuppyList()[0])
    }
}
