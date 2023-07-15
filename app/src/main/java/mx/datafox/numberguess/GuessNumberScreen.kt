package mx.datafox.numberguess

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.datafox.numberguess.ui.theme.BlueDark
import mx.datafox.numberguess.ui.theme.DarkYellow
import mx.datafox.numberguess.ui.theme.NumberGuessTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GuessNumberScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BlueDark)
            .padding(24.dp)
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.White)) {
                    append("5")
                }
                append(" intentos restantes")
            },
            color = DarkYellow,
            fontSize = 18.sp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            listOf(25, 36, 96, 46).forEach { number ->
                Text(
                    text = "$number",
                    color = DarkYellow,
                    fontSize = 42.sp,
                    modifier = Modifier.padding(end = 20.dp)
                )
            }
        }
        Text(
            text = "Pista \n Tu número es mayor que el número oculto",
            color = Color.White,
            fontSize = 22.sp,
            textAlign = TextAlign.Center,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            lineHeight = 30.sp,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(40.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            value = "",
            onValueChange = {},
            textStyle = TextStyle(
                textAlign = TextAlign.Center,
                fontSize = 48.sp
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color.White,
                focusedBorderColor = Color.Transparent
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .align(Alignment.End)
                .padding(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = DarkYellow,
                contentColor = Color.Black
            )
        ) {
            Text("Aceptar", fontSize = 18.sp)
        }
    }
}

@Preview
@Composable
fun GuessNumberScreenPreview() {
    NumberGuessTheme {
        GuessNumberScreen()
    }
}