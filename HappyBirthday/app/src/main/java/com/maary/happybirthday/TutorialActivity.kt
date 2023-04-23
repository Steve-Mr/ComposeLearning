package com.maary.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maary.happybirthday.ui.theme.HappyBirthdayTheme

class TutorialActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun BannerImage(id: Int, modifier: Modifier = Modifier){
    val banner = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = banner,
        contentDescription = stringResource(id = id),
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun HeaderText(content: String, modifier: Modifier = Modifier) {
    Text(
        text = content,
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun ContentText(content1: String, content2: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = content1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = content2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ActivityPreview(){
    HappyBirthdayTheme {
        Column() {
            BannerImage(id = R.drawable.bg_compose_background)
            HeaderText(content = stringResource(id = R.string.header))
            ContentText(content1 = stringResource(id = R.string.para1), content2 = stringResource(id = R.string.para2))

        }

    }
}