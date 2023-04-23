package com.maary.happybirthday

import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class QuadrantActivity : ComponentActivity() {
}

@Composable
fun RantLayout(header: String, content: String, modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(
            text = header,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun QuadrantPreview(){
    Row (modifier = Modifier.fillMaxHeight()){
        Column(modifier = Modifier.weight(1f)) {
            RantLayout(header = "1", content = "1", modifier = Modifier
                .weight(1f)
                .background(
                    colorResource(id = R.color.teal_200)
                ))
            RantLayout(header = "3", content = "3", modifier = Modifier
                .weight(1f)
                .background(
                    colorResource(id = R.color.purple_200)
                ))
        }
        Column(modifier = Modifier.weight(1f)) {
            RantLayout(header = "2", content = "2", modifier = Modifier
                .weight(1f)
                .background(
                    colorResource(id = R.color.purple_700)
                ))
            RantLayout(header = "4", content = "4", modifier = Modifier
                .weight(1f)
                .background(
                    colorResource(id = R.color.teal_700)
                ))
        }
    }
}