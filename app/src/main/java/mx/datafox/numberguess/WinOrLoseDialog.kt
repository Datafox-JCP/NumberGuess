package mx.datafox.numberguess

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import mx.datafox.numberguess.ui.theme.BlueDark
import mx.datafox.numberguess.ui.theme.DarkYellow

@Composable
fun WinOrLoseDialog(
    text: String,
    buttonText: String,
    hiddenNumber: Int,
    image: Painter,
    resetGame: () -> Unit
) {
    Dialog(onDismissRequest = { /*TODO*/ }) {
        Column(
            modifier = Modifier
                .size(300.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(DarkYellow),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "⭐️Felicidades,\n¡Ganaste! ⭐️",
                fontSize = 32.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "El número oculto es 32",
                fontSize = 26.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            )
            Image(
                modifier = Modifier.size(80.dp),
                painter = painterResource(id = R.drawable.ic_trophy),
                contentDescription = "Icon"
            )
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = BlueDark,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Jugar de nuevo", fontSize = 18.sp)
            }
        }
    }
}

@Preview
@Composable
fun WinOrLoseDialogPreview() {
    WinOrLoseDialog(
        text = "⭐️Felicidades,\n" +
                "¡Ganaste! ⭐",
        buttonText = "Jugar de nuevo",
        hiddenNumber = 32,
        image = painterResource(id = R.drawable.ic_trophy),
        resetGame = {}
    )
}