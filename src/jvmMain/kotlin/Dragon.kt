import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

val defaultStyle = Stroke(3f)
val defaultColor = Color.Black
val defaultcolor = Color.Black
@Composable
fun dragon(modifier: Modifier){
    var width by remember { mutableStateOf(800f) }
    var height by remember { mutableStateOf(800f) }
    val xUnit = width / 206
    val yUnit = height / 133
    val centerX = width / 2
    val centerY = height / 2
    val leftEyeBowP1 = Path().apply {
        moveTo(centerX * 5 / 8 - 5 * xUnit, centerY * 4 / 5 - 5)
        quadraticBezierTo(
            centerX * 5 / 8 - 8 * xUnit, centerY * 4 / 5 + 5 * yUnit,
            centerX * 5 / 8 - 14 * xUnit, centerY * 4 / 5 - 8 * yUnit
        )
    }
    val leftEyeBowP2 = Path().apply {
        moveTo(centerX * 5 / 8 - 14 * xUnit, centerY * 4 / 5 - 8 * yUnit)
        quadraticBezierTo(
            centerX * 5 / 8 - 10 * xUnit, centerY * 4 / 5 - 8 * yUnit,
            centerX * 5 / 8 - 8 * xUnit, centerY * 4 / 5 - 5 * yUnit
        )
    }
    val leftEyeBowP3 = Path().apply {
        moveTo(centerX * 5 / 8 - 8 * xUnit, centerY * 4 / 5 - 5 * yUnit)
        quadraticBezierTo(
            centerX * 5 / 8 - 10 * xUnit, centerY * 4 / 5 - 9 * yUnit,
            centerX * 5 / 8 - 8 * xUnit, centerY * 4 / 5 - 14 * yUnit
        )
    }
    val leftEyeBowP4 = Path().apply {
        moveTo(centerX * 5 / 8 - 8 * xUnit, centerY * 4 / 5 - 14 * yUnit)
        quadraticBezierTo(
            centerX * 5 / 8 - 6 * xUnit, centerY * 4 / 5 - 13 * yUnit,
            centerX * 5 / 8 - 5 * xUnit, centerY * 4 / 5 - 9 * yUnit
        )
    }

    val leftEyeBowP5 = Path().apply {
        moveTo(centerX * 5 / 8 - 5 * xUnit, centerY * 4 / 5 - 9 * yUnit)
        quadraticBezierTo(
            centerX * 5 / 8 - 5 * xUnit, centerY * 4 / 5 - 13 * yUnit,
            centerX * 5 / 8 - 2 * xUnit, centerY * 4 / 5 - 16 * yUnit
        )
    }
    val leftEyeBowP6 = Path().apply {
        moveTo(centerX * 5 / 8 - 2 * xUnit, centerY * 4 / 5 - 16 * yUnit)
        quadraticBezierTo(
            centerX * 5 / 8 - 2 * xUnit, centerY * 4 / 5 - 12 * yUnit,
            centerX * 5 / 8 + 1 * xUnit, centerY * 4 / 5 - 10 * yUnit
        )
    }


    val rightEyeP1 = Path().apply {
        moveTo(centerX * 4 / 5 - 4 * xUnit, centerY * 4 / 5)
        quadraticBezierTo(
            centerX * 4 / 5 - 14 * xUnit, centerY * 4 / 5 - 3 * yUnit,
            centerX * 4 / 5, centerY * 4 / 5 - 16 * yUnit
        )
    }
    val rightEyeP2 = Path().apply {
        moveTo(centerX * 4 / 5, centerY * 4 / 5 - 16 * yUnit)
        quadraticBezierTo(
            centerX * 4 / 5 + 2 * xUnit, centerY * 4 / 5 - 13 * yUnit,
            centerX * 4 / 5, centerY * 4 / 5 - 10 * yUnit
        )
    }
    val rightEyeP3 = Path().apply {
        moveTo(centerX * 4 / 5, centerY * 4 / 5 - 10 * yUnit)
        cubicTo(
            centerX * 4 / 5 + 3 * xUnit, centerY * 4 / 5 - 10 * yUnit,
            centerX * 4 / 5 + 4 * xUnit, centerY * 4 / 5 - 16 * yUnit,
            centerX * 4 / 5 + 9 * xUnit, centerY * 4 / 5 - 16 * yUnit
        )
    }
    val rightEyeP4 = Path().apply {
        moveTo(centerX * 4 / 5 + 9 * xUnit, centerY * 4 / 5 - 16 * yUnit)
        cubicTo(
            centerX * 4 / 5 + 1 * xUnit, centerY * 4 / 5 - 6 * yUnit,
            centerX * 4 / 5 + 14 * xUnit, centerY * 4 / 5 - 15 * yUnit,
            centerX * 4 / 5 + 16 * xUnit, centerY * 4 / 5 - 13 * yUnit
        )
    }
    val rightEyeP5 = Path().apply {
        moveTo(centerX * 4 / 5 + 16 * xUnit, centerY * 4 / 5 - 13 * yUnit)
        quadraticBezierTo(
            centerX * 4 / 5 + 8 * xUnit, centerY * 4 / 5 - 10 * yUnit,
            centerX * 4 / 5 + 18 * xUnit, centerY * 4 / 5 - 7 * yUnit
        )
    }
    val rightEyeP6 = Path().apply {
        moveTo(centerX * 4 / 5 + 18 * xUnit, centerY * 4 / 5 - 7 * yUnit)
        quadraticBezierTo(
            centerX * 4 / 5 + 16 * xUnit, centerY * 4 / 5 - 7 * yUnit,
            centerX * 4 / 5 + 14 * xUnit, centerY * 4 / 5 - 4 * yUnit
        )
    }
    val rightEyeP7 = Path().apply {
        moveTo(centerX * 4 / 5 + 14 * xUnit, centerY * 4 / 5 - 4 * yUnit)
        quadraticBezierTo(
            centerX * 4 / 5 + 16 * xUnit, centerY * 4 / 5 - 3 * yUnit,
            centerX * 4 / 5 + 18 * xUnit, centerY * 4 / 5 - 2 * yUnit
        )
    }
    val rightEyeP8 = Path().apply {
        moveTo(centerX * 4 / 5 + 18 * xUnit, centerY * 4 / 5 - 2 * yUnit)
        quadraticBezierTo(
            centerX * 4 / 5 + 14 * xUnit, centerY * 4 / 5 + 1 * yUnit,
            centerX * 4 / 5 + 10 * xUnit, centerY * 4 / 5
        )
    }

    val beardp1 = Path().apply {
        moveTo(centerX / 2 - 18 * xUnit, centerY + 22 * yUnit)
        cubicTo(
            centerX / 2 - 21 * xUnit, centerY + 21 * yUnit,
            centerX / 2 - 25 * xUnit, centerY + 23 * yUnit,
            centerX / 2 - 32 * xUnit, centerY + 20 * yUnit
        )
    }
    val beardp2 = Path().apply {
        moveTo(centerX / 2 - 32 * xUnit, centerY + 21 * yUnit)
        quadraticBezierTo(
            centerX / 2 - 28 * xUnit, centerY + 26 * yUnit,
            centerX / 2 - 24 * xUnit, centerY + 26 * yUnit
        )
    }
    val beardp3 = Path().apply {
        moveTo(centerX / 2 - 25 * xUnit, centerY + 26 * yUnit)
        quadraticBezierTo(
            centerX / 2 - 30 * xUnit, centerY + 30 * yUnit,
            centerX / 2 - 32 * xUnit, centerY + 29 * yUnit
        )
    }
    val beardp4 = Path().apply {
        moveTo(centerX / 2 - 30 * xUnit, centerY + 31 * yUnit)
        quadraticBezierTo(
            centerX / 2 - 28 * xUnit, centerY + 31 * yUnit,
            centerX / 2 - 23 * xUnit, centerY + 29 * yUnit
        )
    }
    val beardp5 = Path().apply {
        moveTo(centerX / 2 - 30 * xUnit, centerY + 31 * yUnit)
        quadraticBezierTo(
            centerX / 2 - 27 * xUnit, centerY + 33 * yUnit,
            centerX / 2 - 16 * xUnit, centerY + 28 * yUnit
        )
    }
    val beardp6 = Path().apply {
        moveTo(centerX / 2 - 16 * xUnit, centerY + 28 * yUnit)
        cubicTo(
            centerX / 2 - 15 * xUnit, centerY + 30 * yUnit,
            centerX / 2 - 19 * xUnit, centerY + 33 * yUnit,
            centerX / 2 - 19 * xUnit, centerY + 35 * yUnit
        )
    }
    val beardp7 = Path().apply {
        moveTo(centerX / 2 - 19 * xUnit, centerY + 35 * yUnit)
        cubicTo(
            centerX / 2 - 17 * xUnit, centerY + 33 * yUnit,
            centerX / 2 - 13 * xUnit, centerY + 32 * yUnit,
            centerX / 2 - 12 * xUnit, centerY + 29 * yUnit
        )
    }
    val beardp8 = Path().apply {
        moveTo(centerX / 2 - 19 * xUnit, centerY + 35 * yUnit)
        cubicTo(
            centerX / 2 - 16 * xUnit, centerY + 34 * yUnit,
            centerX / 2 - 11 * xUnit, centerY + 33 * yUnit,
            centerX / 2 - 9 * xUnit, centerY + 31 * yUnit
        )
    }
    val beardp9 = Path().apply {
        moveTo(centerX / 2 - 15 * xUnit, centerY + 34 * yUnit)
        quadraticBezierTo(
            centerX / 2 - 10 * xUnit, centerY + 34 * yUnit,
            centerX / 2 - 6 * xUnit, centerY + 30 * yUnit,
        )
    }
    val beardp10 = Path().apply {
        moveTo(centerX / 2 - 6 * xUnit, centerY + 30 * yUnit)
        quadraticBezierTo(
            centerX / 2 - 6 * xUnit, centerY + 33 * yUnit,
            centerX / 2 - 0 * xUnit, centerY + 35 * yUnit,
        )
    }
    val beardp11 = Path().apply {
        moveTo(centerX / 2 - 2 * xUnit, centerY + 31 * yUnit)
        quadraticBezierTo(
            centerX / 2 - 0 * xUnit, centerY + 35 * yUnit,
            centerX / 2 + 2 * xUnit, centerY + 36 * yUnit,
        )
    }
    val beardp12 = Path().apply {
        moveTo(centerX / 2 + 2 * xUnit, centerY + 36 * yUnit)
        cubicTo(
            centerX / 2 + 3 * xUnit, centerY + 34 * yUnit,
            centerX / 2 + 2 * xUnit, centerY + 32 * yUnit,
            centerX / 2 + 2 * xUnit, centerY + 30 * yUnit,
        )
    }
    val beardp13 = Path().apply {
        moveTo(centerX / 2 + 2 * xUnit, centerY + 30 * yUnit)
        quadraticBezierTo(
            centerX / 2 + 7 * xUnit, centerY + 35 * yUnit,
            centerX / 2 + 14 * xUnit, centerY + 34 * yUnit,
        )
    }
    val beardp14 = Path().apply {
        moveTo(centerX / 2 + 7 * xUnit, centerY + 30 * yUnit)
        quadraticBezierTo(
            centerX / 2 + 9 * xUnit, centerY + 33 * yUnit,
            centerX / 2 + 15 * xUnit, centerY + 34 * yUnit,
        )
    }
    val beardp15 = Path().apply {
        moveTo(centerX / 2 + 10 * xUnit, centerY + 28 * yUnit)
        quadraticBezierTo(
            centerX / 2 + 13 * xUnit, centerY + 30 * yUnit,
            centerX / 2 + 15 * xUnit, centerY + 34 * yUnit,
        )
    }
    val beardp16 = Path().apply {
        moveTo(centerX / 2 + 10 * xUnit, centerY + 28 * yUnit)
        cubicTo(
            centerX / 2 + 17 * xUnit, centerY + 30 * yUnit,
            centerX / 2 + 20 * xUnit, centerY + 28 * yUnit,
            centerX / 2 + 25 * xUnit, centerY + 25 * yUnit
        )
    }
    val beardp17 = Path().apply {
        moveTo(centerX / 2 + 25 * xUnit, centerY + 25 * yUnit)
        cubicTo(
            centerX / 2 + 21 * xUnit, centerY + 22 * yUnit,
            centerX / 2 + 16 * xUnit, centerY + 23 * yUnit,
            centerX / 2 + 10 * xUnit, centerY + 22 * yUnit
        )
    }
    //龙角
    val hornp1 = Path().apply {
        moveTo(centerX * 5 / 8 - xUnit, centerY * 4 / 5 - 14 * yUnit)
        quadraticBezierTo(
                centerX * 5 / 8 - 2 * xUnit, centerY * 3 / 5 - 8 * yUnit,
                centerX * 5 / 8 + 12 * xUnit, centerY * 3 / 5 - 10 * yUnit, )
    }
    val hornp2 = Path().apply {
        moveTo(centerX * 11 / 16, centerY * 4 / 5 - 5)
        quadraticBezierTo(
                centerX * 5 / 8 - 5 * xUnit, centerY * 4 / 5 - 10 * yUnit,
                centerX * 3 / 4 + 4 * xUnit, centerY * 3 / 5 - 8 * yUnit, )
    }
    val hornp3 = Path().apply {
        moveTo(centerX * 3 / 4 + 1 * xUnit, centerY * 3 / 5 - 7 * yUnit)
        quadraticBezierTo(
                centerX * 3 / 4 + 8 * xUnit, centerY * 3 / 5 - 17 * yUnit,
                centerX * 3 / 4 + 24 * xUnit, centerY * 3 / 5 - 14 * yUnit, )
    }
    val hornp4 = Path().apply {
        moveTo(centerX * 3 / 4 + 20 * xUnit, centerY * 3 / 5 - 15 * yUnit)
        quadraticBezierTo(
                centerX + 2 * xUnit, centerY * 3 / 5 - 18 * yUnit,
                centerX + 8 * xUnit, centerY * 3 / 5 - 14 * yUnit, )
    }
    val hornp5 = Path().apply {
        moveTo(centerX + 4 * xUnit, centerY * 3 / 5 - 16 * yUnit)
        quadraticBezierTo(
                centerX + 10 * xUnit, centerY * 3 / 5 - 18 * yUnit,
                centerX + 16 * xUnit, centerY * 3 / 5 - 14 * yUnit, )
    }
    val hornp6 = Path().apply {
        moveTo(centerX - 3 * xUnit, centerY * 3 / 5 - 16 * yUnit)
        cubicTo(centerX - xUnit, centerY * 3 / 5 - 20 * yUnit,
                centerX - 2 * xUnit, centerY * 3 / 5 - 23 * yUnit,
                centerX, centerY * 3 / 5 - 26 * yUnit)
        cubicTo(centerX + 2 * xUnit, centerY * 3 / 5 - 26 * yUnit,
                centerX + 5 * xUnit, centerY * 3 / 5 - 23 * yUnit,
                centerX + 4 * xUnit, centerY * 3 / 5 - 16 * yUnit)
    }

    val hornp7 = Path().apply {
        moveTo(centerX + 14 * xUnit, centerY * 3 / 5 - 15 * yUnit)
        cubicTo(centerX + 13 * xUnit, centerY * 3 / 5 - 23 * yUnit,
                centerX + 21 * xUnit, centerY * 3 / 5 - 28 * yUnit,
                centerX + 32 * xUnit, centerY * 3 / 5 - 23 * yUnit)
        quadraticBezierTo(centerX + 34 * xUnit, centerY * 3 / 5 - 15 * yUnit,
                centerX + 26 * xUnit, centerY * 3 / 5 - 9 * yUnit)
    }
    val hornp8 = Path().apply {
        moveTo(centerX + 4 * xUnit, centerY * 3 / 5 - 16 * yUnit)
        quadraticBezierTo(centerX + 11 * xUnit, centerY * 3 / 5 - 18 * yUnit,
                centerX + 14 * xUnit, centerY * 3 / 5 - 20 * yUnit)
    }
    val hornp9 = Path().apply {
        moveTo(centerX + 24 * xUnit, centerY * 3 / 5 - 25 * yUnit)
        quadraticBezierTo(
                centerX + 33 * xUnit, centerY * 3 / 5 - 28 * yUnit,
                centerX + 37 * xUnit, centerY * 3 / 5 - 33 * yUnit)
    }
    val hornp10 = Path().apply {
        moveTo(centerX + 37 * xUnit, centerY * 3 / 5 - 33 * yUnit)
        quadraticBezierTo(
                centerX + 41 * xUnit, centerY * 3 / 5 - 39 * yUnit,
                centerX + 48 * xUnit, centerY * 3 / 5 - 37 * yUnit)
        quadraticBezierTo(
                centerX + 43 * xUnit, centerY * 3 / 5 - 28 * yUnit,
                centerX + 33 * xUnit, centerY * 3 / 5 - 22 * yUnit)
    }
    val hornp11 = Path().apply {
        moveTo(centerX * 4 / 5 + 3 * xUnit, centerY * 4 / 5 - 16 * yUnit)
        cubicTo(
                centerX * 3 / 4 + 24 * xUnit, centerY * 3 / 5 - 10 * yUnit,
                centerX + 8 * xUnit, centerY * 3 / 5 - 12 * yUnit,
                centerX + 16 * xUnit, centerY * 3 / 5 - 10 * yUnit)
        cubicTo(centerX + 26 * xUnit, centerY * 3 / 5 - 8 * yUnit,
                centerX + 36 * xUnit, centerY * 3 / 5 - 10 * yUnit,
                centerX + 40 * xUnit, centerY * 3 / 5 - 18 * yUnit)
    }
    val hornp12 = Path().apply {
        moveTo(centerX + 40 * xUnit, centerY * 3 / 5 - 18 * yUnit)
        cubicTo(centerX + 38 * xUnit, centerY * 3 / 5 - 25 * yUnit,
                centerX + 44 * xUnit, centerY * 3 / 5 - 27 * yUnit,
                centerX + 50 * xUnit, centerY * 3 / 5 - 25 * yUnit)
        quadraticBezierTo(
                centerX + 49 * xUnit, centerY * 3 / 5 - 18 * yUnit,
                centerX + 48 * xUnit, centerY * 3 / 5 - 14 * yUnit)
    }
    val hornp13 = Path().apply {
        moveTo(centerX + 48 * xUnit, centerY * 3 / 5 - 14 * yUnit)
        cubicTo(centerX + 64 * xUnit, centerY * 3 / 5 - 18 * yUnit,
                centerX + 70 * xUnit, centerY * 3 / 5 - 28 * yUnit,
                centerX + 69 * xUnit, centerY * 3 / 5 - 33 * yUnit
        )
        cubicTo(centerX + 75 * xUnit, centerY * 3 / 5 - 35 * yUnit,
                centerX + 80 * xUnit, centerY * 3 / 5 - 32 * yUnit,
                centerX + 80 * xUnit, centerY * 3 / 5 - 28 * yUnit)
        quadraticBezierTo(centerX + 77 * xUnit, centerY * 3 / 5 - 20 * yUnit,
                centerX + 65 * xUnit, centerY * 3 / 5 - 8 * yUnit)
        cubicTo(centerX + 55 * xUnit, centerY * 3 / 5 - 1 * yUnit,
                centerX + 35 * xUnit, centerY * 3 / 5 + 5 * yUnit,
                centerX * 4 / 5 + 20 * xUnit, centerY * 4 / 5 - 2 * yUnit)
    }
    //上颚
    val mouthHair1 = Path().apply {
        moveTo(centerX / 2 + 17 * xUnit, centerY + 20 * yUnit)
        cubicTo(centerX / 2 + 21 * xUnit, centerY + 18 * yUnit,
                centerX / 2 + 23 * xUnit, centerY + 12 * yUnit,
                centerX / 2 + 27 * xUnit, centerY + 11 * yUnit) }

    val mouthHair2 = Path().apply {
        moveTo(centerX / 2 + 27 * xUnit, centerY +11 * yUnit)
        cubicTo(centerX / 2 + 26 * xUnit, centerY +17 * yUnit,
                centerX / 2 + 28 * xUnit, centerY +18 * yUnit,
                centerX / 2 + 30 * xUnit, centerY +17 * yUnit)
        cubicTo(centerX / 2 + 32 * xUnit, centerY +11 * yUnit,
                centerX / 2 + 35 * xUnit, centerY +8 * yUnit,
                centerX / 2 + 39 * xUnit, centerY +7 * yUnit) }
    val mouthHair3 = Path().apply {
        moveTo(centerX / 2 + 39 * xUnit, centerY +7 * yUnit)
        cubicTo(centerX / 2 + 36 * xUnit, centerY +10 * yUnit,
                centerX / 2 + 38 * xUnit, centerY +12 * yUnit,
                centerX / 2 + 41 * xUnit, centerY +12 * yUnit)
        cubicTo(centerX / 2 + 43 * xUnit, centerY +8 * yUnit,
                centerX / 2 + 45 * xUnit, centerY +5 * yUnit,
                centerX / 2 + 47 * xUnit, centerY +4 * yUnit) }

    val mouthHair4 = Path().apply {
        moveTo(centerX / 2 + 47 * xUnit, centerY +4 * yUnit)
        cubicTo(centerX / 2 + 46 * xUnit, centerY +8 * yUnit,
                centerX / 2 + 48 * xUnit, centerY +10 * yUnit,
                centerX / 2 + 50 * xUnit, centerY +9 * yUnit)
        cubicTo(centerX / 2 + 50 * xUnit, centerY +3 * yUnit,
                centerX / 2 + 52 * xUnit, centerY +1 * yUnit,
                centerX / 2 + 53 * xUnit, centerY - 1* yUnit) }
    val mouthHair5 = Path().apply {
        moveTo(centerX / 2 + 53 * xUnit, centerY - 1* yUnit)
        cubicTo(centerX / 2 + 53 * xUnit, centerY + 1* yUnit,
                centerX / 2 + 54 * xUnit, centerY + 3* yUnit,
                centerX / 2 + 56 * xUnit, centerY + 1* yUnit)
        cubicTo(centerX / 2 + 56 * xUnit, centerY - 4* yUnit,
                centerX / 2 + 58 * xUnit, centerY - 5* yUnit,
                centerX + 8 * xUnit, centerY - 5* yUnit) }
    val mouthHair6 = Path().apply {
        moveTo(centerX + 8 * xUnit, centerY - 5* yUnit)
        cubicTo(centerX  + 6 * xUnit, centerY + 1* yUnit,
                centerX  + 8 * xUnit, centerY + 3* yUnit,
                centerX  + 10 * xUnit, centerY + 1* yUnit)
        cubicTo(centerX  + 11 * xUnit, centerY - 2* yUnit,
                centerX  + 13 * xUnit, centerY - 4* yUnit,
                centerX  + 15 * xUnit, centerY - 4* yUnit) }

    val mouthHair7 = Path().apply {
        moveTo(centerX  + 15 * xUnit, centerY - 4* yUnit)
        cubicTo(centerX  + 13 * xUnit, centerY - 2* yUnit,
                centerX  + 13 * xUnit, centerY + 1* yUnit,
                centerX  + 15 * xUnit, centerY + 1* yUnit)
        cubicTo(centerX  + 17 * xUnit, centerY - 0* yUnit,
                centerX  + 20 * xUnit, centerY - 1* yUnit,
                centerX  + 22 * xUnit, centerY - 1* yUnit) }
    val mouthHair8 = Path().apply {
        moveTo(centerX  + 22 * xUnit, centerY - 1* yUnit)
        cubicTo(centerX  + 15 * xUnit, centerY + 4* yUnit,
                centerX  + 8 * xUnit, centerY + 6* yUnit,
                centerX  + 1 * xUnit, centerY + 9* yUnit)
        cubicTo(centerX/2  + 40 * xUnit, centerY + 18* yUnit,
                centerX/2  + 29 * xUnit, centerY + 18* yUnit,
                centerX / 2 + 22 * xUnit, centerY + 22 * yUnit) }
    val mouthHair9 = Path().apply {
        moveTo(centerX  + 18 * xUnit, centerY + 2* yUnit)
        quadraticBezierTo(centerX  + 18 * xUnit, centerY + 4* yUnit,
                centerX  + 17 * xUnit, centerY + 7* yUnit) }
    val mouthHair10 = Path().apply {
        moveTo(centerX  + 13 * xUnit, centerY + 10* yUnit)
        cubicTo(centerX  + 12 * xUnit, centerY + 12* yUnit,
                centerX  + 10 * xUnit, centerY + 14* yUnit,
                centerX  + 9 * xUnit, centerY + 16* yUnit) }
    val mouthHair11 = Path().apply {
        moveTo(centerX  + 9 * xUnit, centerY + 14* yUnit)
        cubicTo(centerX  + 7 * xUnit, centerY + 17* yUnit,
                centerX  + 6 * xUnit, centerY + 20* yUnit,
                centerX  + 5 * xUnit, centerY + 21* yUnit) }
    val mouthHair12 = Path().apply {
        moveTo(centerX  + 9 * xUnit, centerY + 13* yUnit)
        quadraticBezierTo(centerX  + 5 * xUnit, centerY + 15* yUnit,
                centerX  + 1 * xUnit, centerY + 23* yUnit) }

    //牙齿
    val toothTop = Path().apply {
        moveTo(centerX  - 2 * xUnit, centerY + 13* yUnit)
        quadraticBezierTo(centerX  - 3 * xUnit, centerY + 18* yUnit,centerX  - 5 * xUnit, centerY + 15* yUnit)
        quadraticBezierTo(centerX  - 6 * xUnit, centerY + 21* yUnit,centerX  - 8 * xUnit, centerY + 16* yUnit)
        quadraticBezierTo(centerX  - 9 * xUnit, centerY + 22* yUnit,centerX  - 11 * xUnit, centerY + 17* yUnit)
        quadraticBezierTo(centerX  - 12 * xUnit, centerY + 23* yUnit,centerX  - 15 * xUnit, centerY + 19* yUnit)
        quadraticBezierTo(centerX  - 16 * xUnit, centerY + 24* yUnit,centerX  - 19 * xUnit, centerY + 20* yUnit)
        quadraticBezierTo(centerX  - 20 * xUnit, centerY + 25* yUnit,centerX  - 22 * xUnit, centerY + 21* yUnit)
        quadraticBezierTo(centerX  - 23 * xUnit, centerY + 26* yUnit,centerX  - 25 * xUnit, centerY + 22* yUnit)
    }
    val toothTop1 = Path().apply {
        moveTo(centerX  + 14 * xUnit, centerY + 4* yUnit)
        quadraticBezierTo(centerX  + 17 * xUnit, centerY + 7* yUnit,centerX  + 21 * xUnit, centerY + 10* yUnit)
    }
    val toothTop2 = Path().apply {
        moveTo(centerX  + 10 * xUnit, centerY + 6* yUnit)
        quadraticBezierTo(centerX  + 12 * xUnit, centerY + 11* yUnit,centerX  + 21 * xUnit, centerY + 10* yUnit)
    }
    val toothBottom = Path().apply {
        moveTo(centerX  - 2 * xUnit, centerY + 26* yUnit)
        quadraticBezierTo(centerX  - 6 * xUnit, centerY + 22* yUnit,centerX  - 5 * xUnit, centerY + 28* yUnit)
        quadraticBezierTo(centerX  - 8 * xUnit, centerY + 23* yUnit,centerX  - 8 * xUnit, centerY + 30* yUnit)
        quadraticBezierTo(centerX  - 11 * xUnit, centerY + 24* yUnit,centerX  - 11 * xUnit, centerY + 32* yUnit)
        quadraticBezierTo(centerX  - 14 * xUnit, centerY + 26* yUnit,centerX  - 14 * xUnit, centerY + 35* yUnit)
        quadraticBezierTo(centerX  - 18 * xUnit, centerY + 29* yUnit,centerX  - 17 * xUnit, centerY + 38* yUnit)
        quadraticBezierTo(centerX  - 21 * xUnit, centerY + 32* yUnit,centerX  - 19 * xUnit, centerY + 40* yUnit)
        quadraticBezierTo(centerX  - 24 * xUnit, centerY + 35* yUnit,centerX  - 21 * xUnit, centerY + 42* yUnit)
        quadraticBezierTo(centerX  - 28 * xUnit, centerY + 38* yUnit,centerX  - 25 * xUnit, centerY + 44* yUnit)
        quadraticBezierTo(centerX  - 32 * xUnit, centerY + 40* yUnit,centerX  - 29 * xUnit, centerY + 46* yUnit)
        quadraticBezierTo(centerX  - 36 * xUnit, centerY + 41* yUnit,centerX  - 33 * xUnit, centerY + 48* yUnit)
    }
    val toothBottom1 = Path().apply {
        moveTo(centerX  - 33 * xUnit, centerY + 48* yUnit)
        quadraticBezierTo(centerX  - 36 * xUnit, centerY + 40* yUnit,centerX  - 37 * xUnit, centerY + 50* yUnit)
    }
    val toothBottom2 = Path().apply {
        moveTo(centerX  - 37 * xUnit, centerY + 50* yUnit)
        quadraticBezierTo(centerX  - 39 * xUnit, centerY + 43* yUnit,centerX  - 42 * xUnit, centerY + 50* yUnit)
        quadraticBezierTo(centerX  - 43 * xUnit, centerY + 43* yUnit,centerX  - 45 * xUnit, centerY + 49* yUnit)
        quadraticBezierTo(centerX  - 46 * xUnit, centerY + 43* yUnit,centerX  - 48 * xUnit, centerY + 49* yUnit)
        quadraticBezierTo(centerX  - 50 * xUnit, centerY + 43* yUnit,centerX  - 52 * xUnit, centerY + 48* yUnit)
    }

    val toothBottom3 = Path().apply {
        moveTo(centerX  - 52 * xUnit, centerY + 46* yUnit)
        quadraticBezierTo(centerX  - 53 * xUnit, centerY + 38* yUnit,centerX  - 55 * xUnit, centerY + 46* yUnit)
    }

    //舌头
    val tounghPath = Path().apply {
        moveTo(centerX / 2 + 2 * xUnit, centerY + 36 * yUnit)
        cubicTo(centerX / 2 + 7 * xUnit, centerY + 35 * yUnit,centerX / 2 + 13 * xUnit, centerY + 34 * yUnit,
                centerX  - 31 * xUnit, centerY + 38* yUnit)
    }
    val tounghPath2 = Path().apply {
        moveTo(centerX / 2 + 2 * xUnit, centerY + 36 * yUnit)
        cubicTo(centerX / 2 + 4 * xUnit, centerY + 37 * yUnit,centerX / 2 + 6 * xUnit, centerY + 37 * yUnit,
                centerX / 2 + 7 * xUnit, centerY + 38 * yUnit)
    }
    val tounghPath3 = Path().apply {
        moveTo(centerX / 2 + 2 * xUnit, centerY + 36 * yUnit)
        cubicTo(centerX / 2 + 0 * xUnit, centerY + 38 * yUnit,centerX / 2 + 0 * xUnit, centerY + 40 * yUnit,
                centerX / 2 + 2 * xUnit, centerY + 42 * yUnit)
        cubicTo(centerX / 2 + 4 * xUnit, centerY + 43 * yUnit,centerX / 2 + 6 * xUnit, centerY + 42 * yUnit,
                centerX / 2 + 8 * xUnit, centerY + 42 * yUnit)
        cubicTo(centerX / 2 + 13 * xUnit, centerY + 42 * yUnit,centerX / 2 + 18 * xUnit, centerY + 41 * yUnit,
                centerX / 2 + 26 * xUnit, centerY + 37 * yUnit)
        cubicTo(centerX / 2 + 29 * xUnit, centerY + 35 * yUnit,centerX / 2 +32 * xUnit, centerY + 32 * yUnit,
                centerX / 2 +35 * xUnit, centerY + 29 * yUnit)
        cubicTo(centerX / 2 + 38 * xUnit, centerY + 26 * yUnit,centerX / 2 +41 * xUnit, centerY + 23 * yUnit,
                centerX / 2 +45 * xUnit, centerY + 22 * yUnit) }

    val tounghPath4 = Path().apply {
        moveTo(centerX / 2 + 17 * xUnit, centerY + 34 * yUnit)
        cubicTo(centerX / 2 + 19 * xUnit, centerY + 33 * yUnit,centerX / 2 + 20 * xUnit, centerY + 30 * yUnit,
                centerX / 2 + 28 * xUnit, centerY + 26 * yUnit) }

    val tounghPath5 = Path().apply {
        moveTo(centerX  - 31 * xUnit, centerY + 38* yUnit)
        cubicTo(centerX  - 25 * xUnit, centerY + 35* yUnit,centerX  - 22 * xUnit, centerY + 32* yUnit,
                centerX  - 17 * xUnit, centerY + 27* yUnit) }

    //耳朵
    val ear1 = Path().apply {
        moveTo(centerX * 4 / 5 + 32 * xUnit, centerY * 4 / 5 + 8 * yUnit)
        cubicTo(centerX * 4 / 5 + 30 * xUnit, centerY * 4 / 5 + 1 * yUnit,
            centerX * 4 / 5 + 33 * xUnit, centerY * 4 / 5 - 1 * yUnit,
            centerX * 4 / 5 + 37 * xUnit, centerY * 4 / 5 - 3 * yUnit)
        cubicTo(centerX * 4 / 5 + 42 * xUnit, centerY * 4 / 5 - 4 * yUnit,
            centerX * 4 / 5 + 45 * xUnit, centerY * 4 / 5 - 3 * yUnit,
            centerX * 4 / 5 + 49 * xUnit, centerY * 4 / 5 - 4 * yUnit)
        cubicTo(centerX * 4 / 5 + 53 * xUnit, centerY * 4 / 5 - 4 * yUnit,
            centerX * 4 / 5 + 57 * xUnit, centerY * 4 / 5 - 5 * yUnit,
            centerX * 4 / 5 + 61 * xUnit, centerY * 4 / 5 - 8 * yUnit)
    }

    val ear2 = Path().apply {
        moveTo(centerX * 4 / 5 + 36 * xUnit, centerY * 4 / 5 + 7 * yUnit)
        cubicTo(centerX * 4 / 5 + 38 * xUnit, centerY * 4 / 5 - 1 * yUnit,
            centerX * 4 / 5 + 47 * xUnit, centerY * 4 / 5 + 0 * yUnit,
            centerX * 4 / 5 + 61 * xUnit, centerY * 4 / 5 - 8 * yUnit)
    }

    val ear3 = Path().apply {
        moveTo(centerX * 4 / 5 + 45 * xUnit, centerY * 4 / 5 + 10 * yUnit)
        quadraticBezierTo(centerX * 4 / 5 + 55 * xUnit, centerY * 4 / 5 + 9 * yUnit,
            centerX * 4 / 5 + 61 * xUnit, centerY * 4 / 5 - 8 * yUnit)
    }

    //脸
    val jawPath = Path().apply {
        moveTo(centerX * 4 / 5 + 45 * xUnit, centerY * 4 / 5 + 10 * yUnit)
        cubicTo(centerX * 4 / 5 + 52 * xUnit, centerY * 4 / 5 + 13 * yUnit,
            centerX * 4 / 5 + 55 * xUnit, centerY * 4 / 5 + 16 * yUnit,
            centerX * 4 / 5 + 56 * xUnit, centerY * 4 / 5 + 21 * yUnit)
        cubicTo(centerX * 4 / 5 + 57 * xUnit, centerY * 4 / 5 + 26 * yUnit,
            centerX * 4 / 5 + 55 * xUnit, centerY * 4 / 5 + 29 * yUnit,
            centerX * 4 / 5 + 52 * xUnit, centerY * 4 / 5 + 32 * yUnit)
        cubicTo(centerX * 4 / 5 + 46 * xUnit, centerY * 4 / 5 + 35 * yUnit,
            centerX * 4 / 5 + 46 * xUnit, centerY * 4 / 5 + 42 * yUnit,
            centerX * 4 / 5 + 36 * xUnit, centerY * 4 / 5 + 46 * yUnit)
        quadraticBezierTo(centerX * 4 / 5 + 34 * xUnit, centerY * 4 / 5 + 52 * yUnit,
            centerX * 4 / 5 + 24 * xUnit, centerY * 4 / 5 + 56 * yUnit)
    }

    //下巴毛
    val jawpath = Path().apply {
        moveTo(centerX  - 55 * xUnit, centerY + 44* yUnit)
        cubicTo(centerX  - 58 * xUnit, centerY + 46* yUnit,centerX  - 58 * xUnit, centerY + 48* yUnit,
            centerX  - 58 * xUnit, centerY + 50* yUnit)
        cubicTo(centerX  - 58 * xUnit, centerY + 52* yUnit,centerX  - 60 * xUnit, centerY + 55* yUnit,
            centerX  - 55 * xUnit, centerY + 57* yUnit)
        quadraticBezierTo(centerX  - 53 * xUnit, centerY + 58* yUnit,centerX  - 53 * xUnit, centerY + 58* yUnit)
    }
    val jawpath1 = Path().apply {
        moveTo(centerX  - 55 * xUnit, centerY + 52* yUnit)
        quadraticBezierTo(centerX  - 54 * xUnit, centerY + 54* yUnit,centerX  - 55 * xUnit, centerY + 57* yUnit)
    }
    val jawpath2 = Path().apply {
        moveTo(centerX  - 55 * xUnit, centerY + 52* yUnit)
        quadraticBezierTo(centerX  - 56 * xUnit, centerY + 54* yUnit,centerX  - 48 * xUnit, centerY + 57* yUnit)
    }
    val jawpath3 = Path().apply {
        moveTo(centerX  - 50 * xUnit, centerY + 54* yUnit)
        quadraticBezierTo(centerX  - 48 * xUnit, centerY + 57* yUnit,centerX  - 45 * xUnit, centerY + 61* yUnit)
    }
    val jawpath4 = Path().apply {
        moveTo(centerX  - 46 * xUnit, centerY + 55* yUnit)
        cubicTo(centerX  - 45 * xUnit, centerY + 61* yUnit,centerX  - 41 * xUnit, centerY + 62* yUnit,
            centerX  - 38 * xUnit, centerY + 62* yUnit)
    }
    val jawpath5 = Path().apply {
        moveTo(centerX  - 39 * xUnit, centerY + 54* yUnit)
        cubicTo(centerX  - 40 * xUnit, centerY + 59* yUnit,centerX  - 38 * xUnit, centerY + 62* yUnit,
            centerX  - 34 * xUnit, centerY + 62* yUnit)
    }

    val jawpath6 = Path().apply {
        moveTo(centerX  - 41 * xUnit, centerY + 59* yUnit)
        quadraticBezierTo(centerX  - 38 * xUnit, centerY + 62* yUnit,centerX  - 34 * xUnit, centerY + 62* yUnit)
    }

    val jawpath7 = Path().apply {
        moveTo(centerX  - 36 * xUnit, centerY + 55* yUnit)
        cubicTo(centerX  - 35 * xUnit, centerY + 60* yUnit,centerX  - 29 * xUnit, centerY + 59* yUnit,
            centerX  - 25 * xUnit, centerY + 61* yUnit)
    }
    val jawpath8 = Path().apply {
        moveTo(centerX  - 32 * xUnit, centerY + 57* yUnit)
        quadraticBezierTo(centerX  - 29 * xUnit, centerY + 59* yUnit,centerX  - 20 * xUnit, centerY + 61* yUnit)
    }

    val jawpath9 = Path().apply {
        moveTo(centerX  - 24 * xUnit, centerY + 54* yUnit)
        quadraticBezierTo(centerX  - 20 * xUnit, centerY + 61* yUnit,centerX  - 14 * xUnit, centerY + 62* yUnit)
    }

    val jawpath10 = Path().apply {
        moveTo(centerX  - 24 * xUnit, centerY + 54* yUnit)
        quadraticBezierTo(centerX  - 17 * xUnit, centerY + 60* yUnit,centerX  - 9 * xUnit, centerY + 58* yUnit)
    }

    val jawpath11 = Path().apply {
        moveTo(centerX  - 17 * xUnit, centerY + 51* yUnit)
        quadraticBezierTo(centerX  - 10 * xUnit, centerY + 52* yUnit,centerX  - 9 * xUnit, centerY + 58* yUnit)
    }

    val jawpath12 = Path().apply {
        moveTo(centerX  - 20 * xUnit, centerY + 54* yUnit)
        quadraticBezierTo(centerX  - 15 * xUnit, centerY + 54* yUnit,centerX  - 9 * xUnit, centerY + 58* yUnit)
    }
    val jawpath13 = Path().apply {
        moveTo(centerX  - 12 * xUnit, centerY + 49* yUnit)
        quadraticBezierTo(centerX  - 11 * xUnit, centerY + 54* yUnit,centerX  - 3 * xUnit, centerY + 56* yUnit)
    }

    val jawpath14 = Path().apply {
        moveTo(centerX  - 6 * xUnit, centerY + 47* yUnit)
        quadraticBezierTo(centerX  - 3* xUnit, centerY + 52* yUnit,centerX  - 1 * xUnit, centerY + 58* yUnit)
    }

    val jawpath15 = Path().apply {
        moveTo(centerX  - 6 * xUnit, centerY + 47* yUnit)
        quadraticBezierTo(centerX  - 3* xUnit, centerY + 52* yUnit,centerX  + 7 * xUnit, centerY + 55* yUnit)
    }

    val jawpath16 = Path().apply {
        moveTo(centerX * 4 / 5 + 24 * xUnit, centerY * 4 / 5 + 56 * yUnit)
        quadraticBezierTo(centerX  + 3* xUnit, centerY + 52* yUnit,centerX  + 7 * xUnit, centerY + 55* yUnit)
    }
    val jawpath17 = Path().apply {
        moveTo(centerX * 4 / 5 + 24 * xUnit, centerY * 4 / 5 + 56 * yUnit)
        cubicTo(centerX  + 10* xUnit, centerY + 47* yUnit,centerX  + 7 * xUnit, centerY + 55* yUnit,
            centerX  + 10 * xUnit, centerY + 57* yUnit)
    }

    val jawpath18 = Path().apply {
        moveTo(centerX * 4 / 5 + 24 * xUnit, centerY * 4 / 5 + 56 * yUnit)
        cubicTo(centerX  + 14* xUnit, centerY + 43* yUnit,centerX  + 17* xUnit, centerY + 48* yUnit,
            centerX  + 20* xUnit, centerY + 50* yUnit)
        cubicTo(centerX  + 24* xUnit, centerY + 51* yUnit,centerX  + 28* xUnit, centerY + 50* yUnit,
            centerX  + 35* xUnit, centerY + 52* yUnit)
    }

    val jawpath19 = Path().apply {
        moveTo(centerX  + 14* xUnit, centerY + 45* yUnit)
        cubicTo(centerX  + 28* xUnit, centerY + 50* yUnit,centerX  + 30* xUnit, centerY + 48* yUnit,centerX  + 35* xUnit, centerY + 46* yUnit)
        cubicTo(centerX  + 40* xUnit, centerY + 49* yUnit,centerX  + 47* xUnit, centerY + 48* yUnit,centerX  + 50* xUnit, centerY + 48* yUnit)
    }

    val jawpath20 = Path().apply {
        moveTo(centerX  + 11* xUnit, centerY + 40* yUnit)
        cubicTo(centerX  + 15* xUnit, centerY + 42* yUnit,centerX  + 19* xUnit, centerY + 43* yUnit,centerX  + 23* xUnit, centerY + 43* yUnit)
        cubicTo(centerX  + 27* xUnit, centerY + 42* yUnit,centerX  + 31* xUnit, centerY + 41* yUnit,centerX  + 35* xUnit, centerY + 42* yUnit)
        cubicTo(centerX  + 39* xUnit, centerY + 43* yUnit,centerX  + 43* xUnit, centerY + 42* yUnit,centerX  + 47* xUnit, centerY + 41* yUnit)
    }

    val jawpath21 = Path().apply {
        moveTo(centerX  + 13* xUnit, centerY + 37* yUnit)
        cubicTo(centerX  + 15* xUnit, centerY + 39* yUnit,centerX  + 21* xUnit, centerY + 40* yUnit,centerX  + 25* xUnit, centerY + 40* yUnit)
        cubicTo(centerX  + 29* xUnit, centerY + 39* yUnit,centerX  + 33* xUnit, centerY + 38* yUnit,centerX  + 37* xUnit, centerY + 39* yUnit)
        cubicTo(centerX  + 41* xUnit, centerY + 40* yUnit,centerX  + 45* xUnit, centerY + 39* yUnit,centerX  + 49* xUnit, centerY + 38* yUnit)
    }

    val jawpath22 = Path().apply {
        moveTo(centerX  + 16* xUnit, centerY + 35* yUnit)
        cubicTo(centerX  + 19* xUnit, centerY + 33* yUnit,centerX  + 22* xUnit, centerY + 32* yUnit,centerX  + 25* xUnit, centerY + 32* yUnit)
        cubicTo(centerX  + 28* xUnit, centerY + 33* yUnit,centerX  + 31* xUnit, centerY + 35* yUnit,centerX  + 34* xUnit, centerY + 36* yUnit)
        cubicTo(centerX  + 37* xUnit, centerY + 36* yUnit,centerX  + 40* xUnit, centerY + 37* yUnit,centerX  + 43* xUnit, centerY + 39* yUnit)
        cubicTo(centerX  + 46* xUnit, centerY + 42* yUnit,centerX  + 49* xUnit, centerY + 42* yUnit,centerX  + 52* xUnit, centerY + 41* yUnit)
    }

    val jawpath23 = Path().apply {
        moveTo(centerX  + 16* xUnit, centerY + 35* yUnit)
        cubicTo(centerX  + 19* xUnit, centerY + 36* yUnit,centerX  + 23* xUnit, centerY + 36* yUnit,centerX  + 26* xUnit, centerY + 35* yUnit)
        cubicTo(centerX  + 29* xUnit, centerY + 35* yUnit,centerX  + 32* xUnit, centerY + 34* yUnit,centerX  + 36* xUnit, centerY + 33* yUnit)
        cubicTo(centerX  + 39* xUnit, centerY + 33* yUnit,centerX  + 42* xUnit, centerY + 34* yUnit,centerX  + 45* xUnit, centerY + 34* yUnit)
    }

    val jawpath24 = Path().apply {
        moveTo(centerX  + 20* xUnit, centerY + 30* yUnit)
        cubicTo(centerX  + 23* xUnit, centerY + 29* yUnit,centerX  + 26* xUnit, centerY + 29* yUnit,centerX  + 29* xUnit, centerY + 30* yUnit)
        cubicTo(centerX  + 32* xUnit, centerY + 32* yUnit,centerX  + 35* xUnit, centerY + 32* yUnit,centerX  + 38* xUnit, centerY + 31* yUnit)
        cubicTo(centerX  + 41* xUnit, centerY + 29* yUnit,centerX  + 44* xUnit, centerY + 29* yUnit,centerX  + 47* xUnit, centerY + 30* yUnit)
        cubicTo(centerX  + 50* xUnit, centerY + 32* yUnit,centerX  + 53* xUnit, centerY + 32* yUnit,centerX  + 56* xUnit, centerY + 31* yUnit)
    }


    val jawpath25 = Path().apply {
        moveTo(centerX  + 23* xUnit, centerY + 28* yUnit)
        cubicTo(centerX  + 26* xUnit, centerY + 27* yUnit,centerX  + 29* xUnit, centerY + 27* yUnit,centerX  + 32* xUnit, centerY + 28* yUnit)
        cubicTo(centerX  + 35* xUnit, centerY + 30* yUnit,centerX  + 38* xUnit, centerY + 30* yUnit,centerX  + 41* xUnit, centerY + 29* yUnit)
        cubicTo(centerX  + 44* xUnit, centerY + 27* yUnit,centerX  + 47* xUnit, centerY + 27* yUnit,centerX  + 50* xUnit, centerY + 28* yUnit)
        cubicTo(centerX  + 53* xUnit, centerY + 30* yUnit,centerX  + 56* xUnit, centerY + 30* yUnit,centerX  + 59* xUnit, centerY + 29* yUnit)
    }
    val jawpath26 = Path().apply {
        moveTo(centerX  + 26* xUnit, centerY + 26* yUnit)
        cubicTo(centerX  + 29* xUnit, centerY + 25* yUnit,centerX  + 32* xUnit, centerY + 25* yUnit,centerX  + 35* xUnit, centerY + 26* yUnit)
        cubicTo(centerX  + 38* xUnit, centerY + 28* yUnit,centerX  + 41* xUnit, centerY + 28* yUnit,centerX  + 44* xUnit, centerY + 27* yUnit)
        cubicTo(centerX  + 47* xUnit, centerY + 25* yUnit,centerX  + 51* xUnit, centerY + 25* yUnit,centerX  + 53* xUnit, centerY + 26* yUnit)
        cubicTo(centerX  + 56* xUnit, centerY + 28* yUnit,centerX  + 59* xUnit, centerY + 28* yUnit,centerX  + 62* xUnit, centerY + 27* yUnit)
    }
    val jawpath27 = Path().apply {
        moveTo(centerX  + 27* xUnit, centerY + 23* yUnit)
        cubicTo(centerX  + 30* xUnit, centerY + 22* yUnit,centerX  + 33* xUnit, centerY + 22* yUnit,centerX  + 36* xUnit, centerY + 23* yUnit)
        cubicTo(centerX  + 39* xUnit, centerY + 23* yUnit,centerX  + 42* xUnit, centerY + 24* yUnit,centerX  + 45* xUnit, centerY + 24* yUnit)
        cubicTo(centerX  + 48* xUnit, centerY + 23* yUnit,centerX  + 51* xUnit, centerY + 23* yUnit,centerX  + 54* xUnit, centerY + 22* yUnit)
        cubicTo(centerX  + 57* xUnit, centerY + 22* yUnit,centerX  + 60* xUnit, centerY + 23* yUnit,centerX  + 63* xUnit, centerY + 23* yUnit)
    }

    val jawpath28 = Path().apply {
        moveTo(centerX  + 25* xUnit, centerY + 25* yUnit)
        cubicTo(centerX  + 30* xUnit, centerY + 24* yUnit,centerX  + 33* xUnit, centerY + 24* yUnit,centerX  + 36* xUnit, centerY + 25* yUnit)
        cubicTo(centerX  + 39* xUnit, centerY + 25* yUnit,centerX  + 42* xUnit, centerY + 26* yUnit,centerX  + 45* xUnit, centerY + 26* yUnit)
        cubicTo(centerX  + 48* xUnit, centerY + 25* yUnit,centerX  + 51* xUnit, centerY + 25* yUnit,centerX  + 54* xUnit, centerY + 24* yUnit)
        cubicTo(centerX  + 57* xUnit, centerY + 24* yUnit,centerX  + 60* xUnit, centerY + 25* yUnit,centerX  + 63* xUnit, centerY + 25* yUnit)
    }

    val jawpath29 = Path().apply {
        moveTo(centerX  + 30* xUnit, centerY + 20* yUnit)
        cubicTo(centerX  + 33* xUnit, centerY + 19* yUnit,centerX  + 36* xUnit, centerY + 17* yUnit,centerX  + 39* xUnit, centerY + 16* yUnit)
        cubicTo(centerX  + 42* xUnit, centerY + 16* yUnit,centerX  + 45* xUnit, centerY + 16* yUnit,centerX  + 48* xUnit, centerY + 17* yUnit)
        cubicTo(centerX  + 51* xUnit, centerY + 17* yUnit,centerX  + 54* xUnit, centerY + 16* yUnit,centerX  + 57* xUnit, centerY + 15* yUnit)
        cubicTo(centerX  + 60* xUnit, centerY + 14* yUnit,centerX  + 63* xUnit, centerY + 14* yUnit,centerX  + 66* xUnit, centerY + 14* yUnit)
    }

    val jawpath30 = Path().apply {
        moveTo(centerX  + 34* xUnit, centerY + 17* yUnit)
        cubicTo(centerX  + 37* xUnit, centerY + 16* yUnit,centerX  + 40* xUnit, centerY + 14* yUnit,centerX  + 43* xUnit, centerY + 13* yUnit)
        cubicTo(centerX  + 46* xUnit, centerY + 13* yUnit,centerX  + 49* xUnit, centerY + 13* yUnit,centerX  + 52* xUnit, centerY + 14* yUnit)
        cubicTo(centerX  + 55* xUnit, centerY + 14* yUnit,centerX  + 58* xUnit, centerY + 13* yUnit,centerX  + 61* xUnit, centerY + 12* yUnit)
        cubicTo(centerX  + 64* xUnit, centerY + 11* yUnit,centerX  + 67* xUnit, centerY + 11* yUnit,centerX  + 70* xUnit, centerY + 11* yUnit)
    }


    val jawpath31 = Path().apply {
        moveTo(centerX  + 28* xUnit, centerY + 23* yUnit)
        cubicTo(centerX  + 31* xUnit, centerY + 22* yUnit,centerX  + 34* xUnit, centerY + 20* yUnit,centerX  + 37* xUnit, centerY + 19* yUnit)
        cubicTo(centerX  + 40* xUnit, centerY + 19* yUnit,centerX  + 43* xUnit, centerY + 19* yUnit,centerX  + 46* xUnit, centerY + 20* yUnit)
        cubicTo(centerX  + 49* xUnit, centerY + 20* yUnit,centerX  + 52* xUnit, centerY + 19* yUnit,centerX  + 55* xUnit, centerY + 18* yUnit)
        cubicTo(centerX  + 58* xUnit, centerY + 17* yUnit,centerX  + 61* xUnit, centerY + 17* yUnit,centerX  + 64* xUnit, centerY + 17* yUnit)
    }

    val jawpath32 = Path().apply {
        moveTo(centerX  + 35* xUnit, centerY + 15* yUnit)
        cubicTo(centerX  + 38* xUnit, centerY + 14* yUnit,centerX  + 41* xUnit, centerY + 12* yUnit,centerX  + 44* xUnit, centerY + 11* yUnit)
        cubicTo(centerX  + 47* xUnit, centerY + 11* yUnit,centerX  + 50* xUnit, centerY + 11* yUnit,centerX  + 53* xUnit, centerY + 12* yUnit)
        cubicTo(centerX  + 56* xUnit, centerY + 12* yUnit,centerX  + 59* xUnit, centerY + 11* yUnit,centerX  + 62* xUnit, centerY + 10* yUnit)
        cubicTo(centerX  + 65* xUnit, centerY + 9* yUnit,centerX  + 68* xUnit, centerY + 9* yUnit,centerX  + 71* xUnit, centerY + 9* yUnit)
    }

    val jawpath33 = Path().apply {
        moveTo(centerX  + 36* xUnit, centerY + 12* yUnit)
        cubicTo(centerX  + 39* xUnit, centerY + 11* yUnit,centerX  + 42* xUnit, centerY + 9* yUnit,centerX  + 45* xUnit, centerY + 8* yUnit)
        cubicTo(centerX  + 48* xUnit, centerY + 8* yUnit,centerX  + 51* xUnit, centerY + 8* yUnit,centerX  + 54* xUnit, centerY + 9* yUnit)
        cubicTo(centerX  + 57* xUnit, centerY + 9* yUnit,centerX  + 60* xUnit, centerY + 8* yUnit,centerX  + 63* xUnit, centerY + 7* yUnit)
        cubicTo(centerX  + 66* xUnit, centerY + 6* yUnit,centerX  + 69* xUnit, centerY + 6* yUnit,centerX  + 72* xUnit, centerY + 6* yUnit)
    }
    val jawpath34 = Path().apply {
        moveTo(centerX  + 36* xUnit, centerY + 9* yUnit)
        cubicTo(centerX  + 39* xUnit, centerY + 8* yUnit,centerX  + 42* xUnit, centerY + 6* yUnit,centerX  + 45* xUnit, centerY + 5* yUnit)
        cubicTo(centerX  + 48* xUnit, centerY + 5* yUnit,centerX  + 51* xUnit, centerY + 5* yUnit,centerX  + 54* xUnit, centerY + 6* yUnit)
        cubicTo(centerX  + 57* xUnit, centerY + 6* yUnit,centerX  + 60* xUnit, centerY + 5* yUnit,centerX  + 63* xUnit, centerY + 4* yUnit)
        cubicTo(centerX  + 66* xUnit, centerY + 3* yUnit,centerX  + 69* xUnit, centerY + 3* yUnit,centerX  + 72* xUnit, centerY + 3* yUnit)
    }

    val jawpath35 = Path().apply {
        moveTo(centerX  + 35* xUnit, centerY + 6* yUnit)
        cubicTo(centerX  + 36* xUnit, centerY + 5* yUnit,centerX  + 39* xUnit, centerY + 3* yUnit,centerX  + 42* xUnit, centerY + 2* yUnit)
        cubicTo(centerX  + 45* xUnit, centerY + 2* yUnit,centerX  + 48* xUnit, centerY + 2* yUnit,centerX  + 51* xUnit, centerY + 3* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY + 3* yUnit,centerX  + 57* xUnit, centerY + 2* yUnit,centerX  + 60* xUnit, centerY + 1* yUnit)
        cubicTo(centerX  + 63* xUnit, centerY + 0* yUnit,centerX  + 66* xUnit, centerY + 0* yUnit,centerX  + 69* xUnit, centerY - 2* yUnit)
    }

    val jawpath36 = Path().apply {
        moveTo(centerX  + 35* xUnit, centerY + 7* yUnit)
        cubicTo(centerX  + 36* xUnit, centerY + 7* yUnit,centerX  + 39* xUnit, centerY + 6* yUnit,centerX  + 42* xUnit, centerY + 4* yUnit)
        cubicTo(centerX  + 45* xUnit, centerY + 3* yUnit,centerX  + 48* xUnit, centerY + 2* yUnit,centerX  + 51* xUnit, centerY + 3* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY + 3* yUnit,centerX  + 57* xUnit, centerY + 2* yUnit,centerX  + 60* xUnit, centerY + 1* yUnit)
        cubicTo(centerX  + 63* xUnit, centerY + 0* yUnit,centerX  + 66* xUnit, centerY + 0* yUnit,centerX  + 69* xUnit, centerY - 1* yUnit)
    }
    val jawpath37 = Path().apply {
        moveTo(centerX  + 35* xUnit, centerY + 4* yUnit)
        cubicTo(centerX  + 36* xUnit, centerY + 4* yUnit,centerX  + 39* xUnit, centerY + 3* yUnit,centerX  + 42* xUnit, centerY + 1* yUnit)
        cubicTo(centerX  + 45* xUnit, centerY + 0* yUnit,centerX  + 48* xUnit, centerY - 1* yUnit,centerX  + 51* xUnit, centerY + 0* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY + 0* yUnit,centerX  + 57* xUnit, centerY - 1* yUnit,centerX  + 60* xUnit, centerY - 2* yUnit)
        cubicTo(centerX  + 63* xUnit, centerY - 3* yUnit,centerX  + 66* xUnit, centerY - 3* yUnit,centerX  + 69* xUnit, centerY - 4* yUnit)
    }
    val jawpath38 = Path().apply {
        moveTo(centerX  + 33* xUnit, centerY + 1* yUnit)
        cubicTo(centerX  + 36* xUnit, centerY + 1* yUnit,centerX  + 39* xUnit, centerY + 0* yUnit,centerX  + 42* xUnit, centerY - 2* yUnit)
        cubicTo(centerX  + 45* xUnit, centerY - 3* yUnit,centerX  + 48* xUnit, centerY - 4* yUnit,centerX  + 51* xUnit, centerY - 3* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY - 3* yUnit,centerX  + 57* xUnit, centerY - 4* yUnit,centerX  + 60* xUnit, centerY - 5* yUnit)
        cubicTo(centerX  + 63* xUnit, centerY - 6* yUnit,centerX  + 66* xUnit, centerY - 6* yUnit,centerX  + 69* xUnit, centerY - 7* yUnit)
    }
    val jawpath39 = Path().apply {
        moveTo(centerX  + 31* xUnit, centerY - 1* yUnit)
        cubicTo(centerX  + 36* xUnit, centerY - 1* yUnit,centerX  + 39* xUnit, centerY - 2* yUnit,centerX  + 42* xUnit, centerY - 4* yUnit)
        cubicTo(centerX  + 45* xUnit, centerY - 5* yUnit,centerX  + 48* xUnit, centerY - 6* yUnit,centerX  + 51* xUnit, centerY - 5* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY - 5* yUnit,centerX  + 57* xUnit, centerY - 6* yUnit,centerX  + 60* xUnit, centerY - 7* yUnit)
        cubicTo(centerX  + 63* xUnit, centerY - 8* yUnit,centerX  + 66* xUnit, centerY - 8* yUnit,centerX  + 69* xUnit, centerY - 9* yUnit)
    }
    val jawpath40 = Path().apply {
        moveTo(centerX  + 27* xUnit, centerY - 3* yUnit)
        cubicTo(centerX  + 33* xUnit, centerY - 3* yUnit,centerX  + 36* xUnit, centerY - 5* yUnit,centerX  + 39* xUnit, centerY - 6* yUnit)
        cubicTo(centerX  + 42* xUnit, centerY - 7* yUnit,centerX  + 45* xUnit, centerY - 8* yUnit,centerX  + 48* xUnit, centerY - 7* yUnit)
        cubicTo(centerX  + 51* xUnit, centerY - 7* yUnit,centerX  + 54* xUnit, centerY - 8* yUnit,centerX  + 57* xUnit, centerY - 9* yUnit)
        cubicTo(centerX  + 60* xUnit, centerY - 10* yUnit,centerX  + 63* xUnit, centerY - 10* yUnit,centerX  + 66* xUnit, centerY - 11* yUnit)
    }

    val jawpath41 = Path().apply {
        moveTo(centerX  + 30* xUnit, centerY - 5* yUnit)
        cubicTo(centerX  + 33* xUnit, centerY - 5* yUnit,centerX  + 36* xUnit, centerY - 7* yUnit,centerX  + 39* xUnit, centerY - 8* yUnit)
        cubicTo(centerX  + 42* xUnit, centerY - 9* yUnit,centerX  + 45* xUnit, centerY - 10* yUnit,centerX  + 48* xUnit, centerY - 9* yUnit)
        cubicTo(centerX  + 51* xUnit, centerY - 9* yUnit,centerX  + 54* xUnit, centerY - 10* yUnit,centerX  + 57* xUnit, centerY - 11* yUnit)
        cubicTo(centerX  + 60* xUnit, centerY - 12* yUnit,centerX  + 63* xUnit, centerY - 12* yUnit,centerX  + 66* xUnit, centerY - 13* yUnit)
    }

    val jawpath42 = Path().apply {
        moveTo(centerX  + 33* xUnit, centerY - 7* yUnit)
        cubicTo(centerX  + 37* xUnit, centerY - 7* yUnit,centerX  + 40* xUnit, centerY - 9* yUnit,centerX  + 44* xUnit, centerY - 10* yUnit)
        cubicTo(centerX  + 47* xUnit, centerY - 11* yUnit,centerX  + 51* xUnit, centerY - 12* yUnit,centerX  + 54* xUnit, centerY - 13* yUnit)
        cubicTo(centerX  + 57* xUnit, centerY - 13* yUnit,centerX  + 60* xUnit, centerY - 14* yUnit,centerX  + 63* xUnit, centerY - 15* yUnit)
        cubicTo(centerX  + 66* xUnit, centerY - 16* yUnit,centerX  + 69* xUnit, centerY - 16* yUnit,centerX  + 72* xUnit, centerY - 17* yUnit)
    }
    val jawpath43 = Path().apply {
        moveTo(centerX  + 35* xUnit, centerY - 10* yUnit)
        cubicTo(centerX  + 39* xUnit, centerY - 10* yUnit,centerX  + 42* xUnit, centerY - 11* yUnit,centerX  + 46* xUnit, centerY - 12* yUnit)
        cubicTo(centerX  + 49* xUnit, centerY - 12* yUnit,centerX  + 53* xUnit, centerY - 14* yUnit,centerX  + 56* xUnit, centerY - 15* yUnit)
        cubicTo(centerX  + 59* xUnit, centerY - 15* yUnit,centerX  + 62* xUnit, centerY - 14* yUnit,centerX  + 65* xUnit, centerY - 14* yUnit)
        cubicTo(centerX  + 68* xUnit, centerY - 15* yUnit,centerX  + 71* xUnit, centerY - 16* yUnit,centerX  + 74* xUnit, centerY - 16* yUnit)
    }

    val jawpath44 = Path().apply {
        moveTo(centerX  + 37* xUnit, centerY - 12* yUnit)
        cubicTo(centerX  + 40* xUnit, centerY - 13* yUnit,centerX  + 43* xUnit, centerY - 14* yUnit,centerX  + 46* xUnit, centerY - 14* yUnit)
        cubicTo(centerX  + 49* xUnit, centerY - 13* yUnit,centerX  + 52* xUnit, centerY - 13* yUnit,centerX  + 55* xUnit, centerY - 14* yUnit)
        cubicTo(centerX  + 58* xUnit, centerY - 15* yUnit,centerX  + 61* xUnit, centerY - 16* yUnit,centerX  + 64* xUnit, centerY - 16* yUnit)
        cubicTo(centerX  + 67* xUnit, centerY - 17* yUnit,centerX  + 70* xUnit, centerY - 17* yUnit,centerX  + 73* xUnit, centerY - 16* yUnit)
    }

    val jawpath45 = Path().apply {
        moveTo(centerX  + 37* xUnit, centerY - 14* yUnit)
        cubicTo(centerX  + 40* xUnit, centerY - 15* yUnit,centerX  + 43* xUnit, centerY - 16* yUnit,centerX  + 46* xUnit, centerY - 16* yUnit)
        cubicTo(centerX  + 49* xUnit, centerY - 17* yUnit,centerX  + 52* xUnit, centerY - 17* yUnit,centerX  + 55* xUnit, centerY - 18* yUnit)
        cubicTo(centerX  + 58* xUnit, centerY - 18* yUnit,centerX  + 61* xUnit, centerY - 17* yUnit,centerX  + 64* xUnit, centerY - 18* yUnit)
        cubicTo(centerX  + 67* xUnit, centerY - 19* yUnit,centerX  + 70* xUnit, centerY - 19* yUnit,centerX  + 73* xUnit, centerY - 20* yUnit)
    }

    val jawpath46 = Path().apply {
        moveTo(centerX  + 38* xUnit, centerY - 16* yUnit)
        cubicTo(centerX  + 41* xUnit, centerY - 17* yUnit,centerX  + 44* xUnit, centerY - 18* yUnit,centerX  + 47* xUnit, centerY - 18* yUnit)
        cubicTo(centerX  + 50* xUnit, centerY - 19* yUnit,centerX  + 53* xUnit, centerY - 20* yUnit,centerX  + 56* xUnit, centerY - 20* yUnit)
        cubicTo(centerX  + 59* xUnit, centerY - 21* yUnit,centerX  + 62* xUnit, centerY - 22* yUnit,centerX  + 65* xUnit, centerY - 22* yUnit)
        cubicTo(centerX  + 68* xUnit, centerY - 21* yUnit,centerX  + 71* xUnit, centerY - 21* yUnit,centerX  + 74* xUnit, centerY - 22* yUnit)
    }

    val jawpath47 = Path().apply {
        moveTo(centerX  + 40* xUnit, centerY - 18* yUnit)
        cubicTo(centerX  + 43* xUnit, centerY - 19* yUnit,centerX  + 46* xUnit, centerY - 20* yUnit,centerX  + 49* xUnit, centerY - 20* yUnit)
        cubicTo(centerX  + 52* xUnit, centerY - 21* yUnit,centerX  + 55* xUnit, centerY - 22* yUnit,centerX  + 58* xUnit, centerY - 22* yUnit)
        cubicTo(centerX  + 61* xUnit, centerY - 23* yUnit,centerX  + 64* xUnit, centerY - 24* yUnit,centerX  + 67* xUnit, centerY - 24* yUnit)
        cubicTo(centerX  + 70* xUnit, centerY - 23* yUnit,centerX  + 73* xUnit, centerY - 23* yUnit,centerX  + 76* xUnit, centerY - 24* yUnit)
    }
    val jawpath48 = Path().apply {
        moveTo(centerX  + 40* xUnit, centerY - 20* yUnit)
        cubicTo(centerX  + 45* xUnit, centerY - 21* yUnit,centerX  + 48* xUnit, centerY - 22* yUnit,centerX  + 51* xUnit, centerY - 22* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY - 23* yUnit,centerX  + 57* xUnit, centerY - 24* yUnit,centerX  + 60* xUnit, centerY - 24* yUnit)
        cubicTo(centerX  + 63* xUnit, centerY - 25* yUnit,centerX  + 66* xUnit, centerY - 26* yUnit,centerX  + 69* xUnit, centerY - 26* yUnit)
        cubicTo(centerX  + 72* xUnit, centerY - 25* yUnit,centerX  + 75* xUnit, centerY - 25* yUnit,centerX  + 78* xUnit, centerY - 26* yUnit)
    }
    val jawpath49 = Path().apply {
        moveTo(centerX  + 40* xUnit, centerY - 21* yUnit)
        cubicTo(centerX  + 45* xUnit, centerY - 22* yUnit,centerX  + 48* xUnit, centerY - 23* yUnit,centerX  + 51* xUnit, centerY - 23* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY - 24* yUnit,centerX  + 57* xUnit, centerY - 25* yUnit,centerX  + 60* xUnit, centerY - 25* yUnit)
        cubicTo(centerX  + 63* xUnit, centerY - 26* yUnit,centerX  + 66* xUnit, centerY - 27* yUnit,centerX  + 69* xUnit, centerY - 27* yUnit)
        cubicTo(centerX  + 72* xUnit, centerY - 26* yUnit,centerX  + 75* xUnit, centerY - 26* yUnit,centerX  + 78* xUnit, centerY - 27* yUnit)
    }

    val jawpath50 = Path().apply {
        moveTo(centerX  + 42* xUnit, centerY - 23* yUnit)
        cubicTo(centerX  + 45* xUnit, centerY - 24* yUnit,centerX  + 48* xUnit, centerY - 25* yUnit,centerX  + 51* xUnit, centerY - 25* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY - 25* yUnit,centerX  + 57* xUnit, centerY - 25* yUnit,centerX  + 60* xUnit, centerY - 26* yUnit)
        cubicTo(centerX  + 63* xUnit, centerY - 27* yUnit,centerX  + 66* xUnit, centerY - 28* yUnit,centerX  + 69* xUnit, centerY - 28* yUnit)
        cubicTo(centerX  + 72* xUnit, centerY - 27* yUnit,centerX  + 75* xUnit, centerY - 27* yUnit,centerX  + 78* xUnit, centerY - 28* yUnit)
    }

    val jawpath51 = Path().apply {
        moveTo(centerX  + 54* xUnit, centerY - 27* yUnit)
        cubicTo(centerX  + 57* xUnit, centerY - 27* yUnit,centerX  + 60* xUnit, centerY - 28* yUnit,centerX  + 63* xUnit, centerY - 29* yUnit)
        cubicTo(centerX  + 66* xUnit, centerY - 30* yUnit,centerX  + 69* xUnit, centerY - 30* yUnit,centerX  + 72* xUnit, centerY - 29* yUnit)
        cubicTo(centerX  + 75* xUnit, centerY - 29* yUnit,centerX  + 78* xUnit, centerY - 30* yUnit,centerX  + 81* xUnit, centerY - 31* yUnit)
    }


    val jawpath52 = Path().apply {
        moveTo(centerX  + 56* xUnit, centerY - 29* yUnit)
        cubicTo(centerX  + 59* xUnit, centerY - 29* yUnit,centerX  + 62* xUnit, centerY - 30* yUnit,centerX  + 65* xUnit, centerY - 31* yUnit)
        cubicTo(centerX  + 68* xUnit, centerY - 32* yUnit,centerX  + 71* xUnit, centerY - 32* yUnit,centerX  + 74* xUnit, centerY - 31* yUnit)
        cubicTo(centerX  + 77* xUnit, centerY - 31* yUnit,centerX  + 80* xUnit, centerY - 32* yUnit,centerX  + 83* xUnit, centerY - 33* yUnit)
    }

    val jawpath53 = Path().apply {
        moveTo(centerX  + 30* xUnit, centerY - 39* yUnit)
        cubicTo(centerX  + 33* xUnit, centerY - 40* yUnit,centerX  + 36* xUnit, centerY - 41* yUnit,centerX  + 38* xUnit, centerY - 43* yUnit)
    }
    val jawpath54 = Path().apply {
        moveTo(centerX  + 31* xUnit, centerY - 41* yUnit)
        cubicTo(centerX  + 34* xUnit, centerY - 42* yUnit,centerX  + 36* xUnit, centerY - 43* yUnit,centerX  + 39* xUnit, centerY - 45* yUnit)
    }

    val jawpath55 = Path().apply {
        moveTo(centerX  + 32* xUnit, centerY - 43* yUnit)
        cubicTo(centerX  + 35* xUnit, centerY - 44* yUnit,centerX  + 37* xUnit, centerY - 46* yUnit,centerX  + 39* xUnit, centerY - 47* yUnit)
    }
    val jawpath56 = Path().apply {
        moveTo(centerX  + 33* xUnit, centerY - 46* yUnit)
        cubicTo(centerX  + 35* xUnit, centerY - 46* yUnit,centerX  + 37* xUnit, centerY - 47* yUnit,centerX  + 39* xUnit, centerY - 48* yUnit)
    }

    val jawpath57 = Path().apply {
        moveTo(centerX  + 48* xUnit, centerY - 52* yUnit)
        cubicTo(centerX  + 51* xUnit, centerY - 54* yUnit,centerX  + 52* xUnit, centerY - 56* yUnit,centerX  + 53* xUnit, centerY - 58* yUnit)
        cubicTo(centerX  + 55* xUnit, centerY - 59* yUnit,centerX  + 57* xUnit, centerY - 60* yUnit,centerX  + 59* xUnit, centerY - 61* yUnit)
    }

    val jawpath58 = Path().apply {
        moveTo(centerX  + 50* xUnit, centerY - 50* yUnit)
        cubicTo(centerX  + 52* xUnit, centerY - 52* yUnit,centerX  + 54* xUnit, centerY - 54* yUnit,centerX  + 55* xUnit, centerY - 56* yUnit)
        cubicTo(centerX  + 57* xUnit, centerY - 57* yUnit,centerX  + 59* xUnit, centerY - 58* yUnit,centerX  + 61* xUnit, centerY - 59* yUnit)
    }

    val jawpath59 = Path().apply {
        moveTo(centerX  + 50* xUnit, centerY - 48* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY - 50* yUnit,centerX  + 58* xUnit, centerY - 54* yUnit,centerX  + 62* xUnit, centerY - 58* yUnit)
    }

    val jawpath60 = Path().apply {
        moveTo(centerX  + 50* xUnit, centerY - 46* yUnit)
        cubicTo(centerX  + 54* xUnit, centerY - 48* yUnit,centerX  + 56* xUnit, centerY - 51* yUnit,centerX  + 58* xUnit, centerY - 52* yUnit)
        cubicTo(centerX  + 61* xUnit, centerY - 53* yUnit,centerX  + 63* xUnit, centerY - 54* yUnit,centerX  + 65* xUnit, centerY - 56* yUnit)
    }

    val jawpath61 = Path().apply {
        moveTo(centerX  + 5* xUnit, centerY - 44* yUnit)
        cubicTo(centerX  + 8* xUnit, centerY - 46* yUnit,centerX  + 9* xUnit, centerY - 47* yUnit,centerX  + 11* xUnit, centerY - 55* yUnit)
        cubicTo(centerX  + 12* xUnit, centerY - 56* yUnit,centerX  + 15* xUnit, centerY - 59* yUnit,centerX  + 18* xUnit, centerY - 61* yUnit)
    }

    val jawpath62 = Path().apply {
        moveTo(centerX  + 8* xUnit, centerY - 44* yUnit)
        cubicTo(centerX  + 10* xUnit, centerY - 46* yUnit,centerX  + 12* xUnit, centerY - 50* yUnit,centerX  + 15* xUnit, centerY - 56* yUnit)
        cubicTo(centerX  + 18* xUnit, centerY - 59* yUnit,centerX  + 21* xUnit, centerY - 61* yUnit,centerX  + 24* xUnit, centerY - 62* yUnit)
    }

    val jawpath63 = Path().apply {
        moveTo(centerX  + 13* xUnit, centerY - 46* yUnit)
        cubicTo(centerX  + 14* xUnit, centerY - 50* yUnit,centerX  + 16* xUnit, centerY - 53* yUnit,centerX  + 24* xUnit, centerY - 58* yUnit)
    }

    val jawpath64 = Path().apply {
        moveTo(centerX  + 21* xUnit, centerY - 52* yUnit)
        cubicTo(centerX  + 23* xUnit, centerY - 54* yUnit,centerX  + 25* xUnit, centerY - 56* yUnit,centerX  + 27* xUnit, centerY - 57* yUnit)
    }

    //长胡须
    val longBeardTop = Path().apply {
        moveTo(centerX / 2 - 16 * xUnit, centerY + 9 * yUnit)
        cubicTo(centerX / 2 - 17 * xUnit, centerY - 2 * yUnit,centerX / 2 - 18 * xUnit, centerY - 4 * yUnit,centerX / 2 - 20 * xUnit, centerY - 5 * yUnit)
        cubicTo(centerX / 2 - 23 * xUnit, centerY - 5 * yUnit,centerX / 2 - 30 * xUnit, centerY - 3 * yUnit,centerX / 2 - 32 * xUnit, centerY - 2 * yUnit)
        cubicTo(centerX / 2 - 34 * xUnit, centerY - 2 * yUnit,centerX / 2 - 36 * xUnit, centerY - 3 * yUnit,centerX / 2 - 38 * xUnit, centerY - 5 * yUnit)
        cubicTo(centerX / 2 - 39 * xUnit, centerY - 10 * yUnit,centerX / 2 - 36 * xUnit, centerY - 15 * yUnit,centerX / 2 - 32 * xUnit, centerY - 20 * yUnit)
        cubicTo(centerX / 2 - 31 * xUnit, centerY - 23 * yUnit,centerX / 2 - 31 * xUnit, centerY - 26 * yUnit,centerX / 2 - 32 * xUnit, centerY - 29 * yUnit)
        cubicTo(centerX / 2 - 36 * xUnit, centerY - 33 * yUnit,centerX / 2 - 37 * xUnit, centerY - 35 * yUnit,centerX / 2 - 37 * xUnit, centerY - 37 * yUnit)
        cubicTo(centerX / 2 - 36 * xUnit, centerY - 39 * yUnit,centerX / 2 - 34 * xUnit, centerY - 41 * yUnit,centerX / 2 - 28 * xUnit, centerY - 45 * yUnit)
    }
    val longBeardBottom = Path().apply {
        moveTo(centerX / 2 + 8 * xUnit, centerY + 6 * yUnit)
        cubicTo(centerX / 2 + 20 * xUnit, centerY + 5 * yUnit,centerX / 2 + 28 * xUnit, centerY + 9 * yUnit,centerX / 2 + 32 * xUnit, centerY + 13 * yUnit)
        cubicTo(centerX / 2 + 33 * xUnit, centerY + 16 * yUnit,centerX / 2 + 30 * xUnit, centerY + 29 * yUnit,centerX / 2 + 30 * xUnit, centerY + 32 * yUnit)
        cubicTo(centerX / 2 + 32 * xUnit, centerY + 38 * yUnit,centerX / 2 + 36 * xUnit, centerY + 40 * yUnit,centerX / 2 + 45 * xUnit, centerY + 42 * yUnit)
        cubicTo(centerX / 2 + 49 * xUnit, centerY + 45 * yUnit,centerX / 2 + 53 * xUnit, centerY + 47 * yUnit,centerX / 2 + 57 * xUnit, centerY + 48 * yUnit)
    }
    Canvas(modifier = modifier.blur(1.dp)) {
        width = this.size.width
        height = this.size.height
        //眼睛
        drawCircle(
            color = defaultColor, radius = 3 * xUnit,
            center = Offset(centerX * 4 / 5, centerY * 4 / 5),
            style = defaultStyle
        )
        drawCircle(
            color = defaultColor, radius = xUnit,
            center = Offset(centerX * 4 / 5 - 10, centerY * 4 / 5),
        )
        drawOval(
            color = defaultColor,
            topLeft = Offset(centerX * 4 / 5 - 3 * xUnit, centerY * 4 / 5 - 4 * xUnit),
            size = Size(12 * xUnit, 9 * xUnit), style = defaultStyle
        )
        drawCircle(
            color = defaultColor, radius = 3 * xUnit,
            center = Offset(centerX * 5 / 8, centerY * 4 / 5 - 5),
            style = defaultStyle
        )
        drawCircle(
            color = defaultColor, radius = xUnit,
            center = Offset(centerX * 5 / 8 - 10, centerY * 4 / 5 - 5),
        )
        //左眉毛
        drawPath(leftEyeBowP1, color = defaultColor, style = defaultStyle)
        drawPath(leftEyeBowP2, color = defaultColor, style = defaultStyle)
        drawPath(leftEyeBowP3, color = defaultColor, style = defaultStyle)
        drawPath(leftEyeBowP4, color = defaultColor, style = defaultStyle)
        drawPath(leftEyeBowP5, color = defaultColor, style = defaultStyle)
        drawPath(leftEyeBowP6, color = defaultColor, style = defaultStyle)
        //左眉毛
        //右眉毛
        drawPath(rightEyeP1, color = defaultColor, style = defaultStyle)
        drawPath(rightEyeP2, color = defaultColor, style = defaultStyle)
        drawPath(rightEyeP3, color = defaultColor, style = defaultStyle)
        drawPath(rightEyeP4, color = defaultColor, style = defaultStyle)
        drawPath(rightEyeP5, color = defaultColor, style = defaultStyle)
        drawPath(rightEyeP6, color = defaultColor, style = defaultStyle)
        drawPath(rightEyeP7, color = defaultColor, style = defaultStyle)
        drawPath(rightEyeP8, color = defaultColor, style = defaultStyle)
        //右眉毛
        //鼻子
        drawArc(
            color = defaultColor,
            topLeft = Offset(centerX * 5 / 8, centerY * 4 / 5 + 3 * xUnit),
            sweepAngle = -130f,
            startAngle = -30f,
            useCenter = false,
            size = Size(centerX * 4 / 5 - centerX * 5 / 8 - 4 * xUnit,
                centerX * 4 / 5 - centerX * 5 / 8 - 4 * xUnit),
            style = defaultStyle
        )
        drawArc(
            color = defaultColor,
            topLeft = Offset(centerX / 2 + 8 * xUnit, centerY * 12 / 13),
            sweepAngle = -120f,
            startAngle = -20f,
            useCenter = false,
            size = Size(12 * xUnit, 12 * xUnit),
            style = defaultStyle
        )
        drawArc(
            color = defaultColor,
            topLeft = Offset(centerX / 2 + 3 * xUnit, centerY - 3 * yUnit),
            sweepAngle = -120f,
            startAngle = -20f,
            useCenter = false,
            size = Size(12 * xUnit, 12 * xUnit),
            style = defaultStyle
        )
        drawArc(
            color = defaultColor,
            topLeft = Offset(centerX / 2 - 15 * xUnit, centerY * 12 / 13),
            sweepAngle = -270f, startAngle = 0f, useCenter = false,
            size = Size(22 * xUnit, 28 * xUnit), style = defaultStyle
        )
        drawArc(
            color = defaultColor,
            topLeft = Offset(centerX / 2 + 4 * xUnit, centerY + 9 * xUnit),
            sweepAngle = -220f, startAngle = 100f, useCenter = false,
            size = Size(12 * xUnit, 14 * xUnit), style = defaultStyle
        )
        drawArc(
            color = defaultColor,
            topLeft = Offset(centerX / 2 - 3 * xUnit, centerY + 19 * xUnit),
            sweepAngle = 210f, startAngle = 160f, useCenter = false,
            size = Size(8 * xUnit, 6 * xUnit), style = defaultStyle
        )
        drawArc(
            color = defaultColor,
            topLeft = Offset(centerX / 2 - 22 * xUnit, centerY + 10 * xUnit),
            sweepAngle = -180f, startAngle = 270f, useCenter = false,
            size = Size(12 * xUnit, 14 * xUnit), style = defaultStyle
        )
        drawArc(
            color = defaultColor,
            topLeft = Offset(centerX / 2 - 18 * xUnit, centerY + 20 * xUnit),
            sweepAngle = -250f, startAngle = 0f, useCenter = false,
            size = Size(6 * xUnit, 4 * xUnit), style = defaultStyle
        )
        //胡子
        drawPath(beardp1, color = defaultColor, style = defaultStyle)
        drawPath(beardp2, color = defaultColor, style = defaultStyle)
        drawPath(beardp3, color = defaultColor, style = defaultStyle)
        drawLine(
            color = defaultColor,
            start = Offset(centerX / 2 - 29 * xUnit, centerY + 30 * yUnit,),
            end = Offset(centerX / 2 - 25 * xUnit, centerY + 28 * yUnit),
            strokeWidth = 3f
        )
        drawPath(beardp4, color = defaultColor, style = defaultStyle)
        drawPath(beardp5, color = defaultColor, style = defaultStyle)
        drawPath(beardp6, color = defaultColor, style = defaultStyle)
        drawPath(beardp7, color = defaultColor, style = defaultStyle)
        drawPath(beardp8, color = defaultColor, style = defaultStyle)
        drawPath(beardp9, color = defaultColor, style = defaultStyle)
        drawPath(beardp10, color = defaultColor, style = defaultStyle)
        drawPath(beardp11, color = defaultColor, style = defaultStyle)
        drawPath(beardp12, color = defaultColor, style = defaultStyle)
        drawPath(beardp13, color = defaultColor, style = defaultStyle)
        drawPath(beardp14, color = defaultColor, style = defaultStyle)
        drawPath(beardp15, color = defaultColor, style = defaultStyle)
        drawPath(beardp16, color = defaultColor, style = defaultStyle)
        drawPath(beardp17, color = defaultColor, style = defaultStyle)

        //龙角
        drawPath(hornp1, color = defaultcolor, style = defaultStyle)
        drawPath(hornp2, color = defaultcolor, style = defaultStyle)
        drawPath(hornp3, color = defaultcolor, style = defaultStyle)
        drawPath(hornp4, color = defaultcolor, style = defaultStyle)
        drawPath(hornp5, color = defaultcolor, style = defaultStyle)
        drawPath(hornp6, color = defaultcolor, style = defaultStyle)
        drawPath(hornp7, color = defaultcolor, style = defaultStyle)
        drawPath(hornp8, color = defaultcolor, style = defaultStyle)
        drawPath(hornp9, color = defaultcolor, style = defaultStyle)
        drawPath(hornp10, color = defaultcolor, style = defaultStyle)
        drawPath(hornp11, color = defaultcolor, style = defaultStyle)
        drawPath(hornp12, color = defaultcolor, style = defaultStyle)
        drawPath(hornp13, color = defaultcolor, style = defaultStyle)

        //上颚
        drawPath(mouthHair1,color = defaultcolor, style = defaultStyle)
        drawPath(mouthHair2,color = defaultcolor, style = defaultStyle)
        drawPath(mouthHair3,color = defaultcolor, style = defaultStyle)
        drawPath(mouthHair4,color = defaultcolor, style = defaultStyle)
        drawPath(mouthHair5,color = defaultcolor, style = defaultStyle)
        drawPath(mouthHair6,color = defaultcolor, style = defaultStyle)
        drawPath(mouthHair7,color = defaultcolor, style = defaultStyle)
        drawPath(mouthHair8,color = defaultcolor, style = defaultStyle)
        drawPath(mouthHair9,color = defaultcolor, style = defaultStyle)
        drawPath(mouthHair10,color = defaultcolor, style = defaultStyle)
        drawLine(start = Offset(centerX  + 9 * xUnit, centerY + 16* yUnit),
                end = Offset(centerX  + 9 * xUnit, centerY + 14* yUnit),
                color = defaultcolor, strokeWidth = 3f)
        drawPath(mouthHair11,color = defaultcolor, style = defaultStyle)
        drawLine(start = Offset(centerX  + 5 * xUnit, centerY + 21* yUnit),
                end = Offset(centerX  + 5 * xUnit, centerY + 19* yUnit),
                color = defaultcolor, strokeWidth = 3f)
        drawPath(mouthHair12,color = defaultcolor, style = defaultStyle)
        //牙龈
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 2 * xUnit, centerY + 26* yUnit),
                end = Offset(centerX  - 5 * xUnit, centerY + 28* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 5 * xUnit, centerY + 28* yUnit),
                end = Offset(centerX  - 8 * xUnit, centerY + 30* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 8 * xUnit, centerY + 30* yUnit),
                end = Offset(centerX  - 11 * xUnit, centerY + 32* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 11 * xUnit, centerY + 32* yUnit),
                end = Offset(centerX  - 14 * xUnit, centerY + 35* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 14 * xUnit, centerY + 35* yUnit),
                end = Offset(centerX  - 17 * xUnit, centerY + 38* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 17 * xUnit, centerY + 38* yUnit),
                end = Offset(centerX  - 19 * xUnit, centerY + 40* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 19 * xUnit, centerY + 40* yUnit),
                end = Offset(centerX  - 21 * xUnit, centerY + 42* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 21 * xUnit, centerY + 42* yUnit),
                end = Offset(centerX  - 25 * xUnit, centerY + 44* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 25 * xUnit, centerY + 44* yUnit),
                end = Offset(centerX  - 29 * xUnit, centerY + 46* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 29 * xUnit, centerY + 46* yUnit),
                end = Offset(centerX  - 33 * xUnit, centerY + 48* yUnit))

        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 2 * xUnit, centerY + 13* yUnit),
                end = Offset(centerX  - 5 * xUnit, centerY + 15* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 5 * xUnit, centerY + 15* yUnit),
                end = Offset(centerX  - 8 * xUnit, centerY + 16* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 8 * xUnit, centerY + 16* yUnit),
                end = Offset(centerX  - 11 * xUnit, centerY + 17* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 11 * xUnit, centerY + 17* yUnit),
                end = Offset(centerX  - 15 * xUnit, centerY + 19* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 15 * xUnit, centerY + 19* yUnit),
                end = Offset(centerX  - 19 * xUnit, centerY + 20* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 19 * xUnit, centerY + 20* yUnit),
                end = Offset(centerX  - 22 * xUnit, centerY + 21* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 22 * xUnit, centerY + 21* yUnit),
                end = Offset(centerX  - 26 * xUnit, centerY + 22* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 33 * xUnit, centerY + 48* yUnit),
                end = Offset(centerX  - 37 * xUnit, centerY + 50* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 37 * xUnit, centerY + 50* yUnit),
                end = Offset(centerX  - 42 * xUnit, centerY + 50* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 42 * xUnit, centerY + 50* yUnit),
                end = Offset(centerX  - 45 * xUnit, centerY + 49* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 45 * xUnit, centerY + 49* yUnit),
                end = Offset(centerX  - 48 * xUnit, centerY + 49* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 48 * xUnit, centerY + 49* yUnit),
                end = Offset(centerX  - 52 * xUnit, centerY + 48* yUnit))
        drawLine(color = defaultcolor, strokeWidth = 3f, start = Offset(centerX  - 52 * xUnit, centerY + 46* yUnit),
                end = Offset(centerX  - 55 * xUnit, centerY + 46* yUnit))

        //牙齿
        drawPath(toothTop,color = defaultcolor, style = defaultStyle)
        drawPath(toothTop1,color = defaultcolor, style = defaultStyle)
        drawPath(toothTop2,color = defaultcolor, style = defaultStyle)
        drawPath(toothBottom,color = defaultcolor, style = defaultStyle)
        drawPath(toothBottom1,color = defaultcolor, style = defaultStyle)
        drawPath(toothBottom2,color = defaultcolor, style = defaultStyle)
        drawPath(toothBottom3,color = defaultcolor, style = defaultStyle)

        //舌头
        drawPath(tounghPath,color = defaultcolor, style = defaultStyle)
        drawPath(tounghPath2,color = defaultcolor, style = defaultStyle)
        drawPath(tounghPath3,color = defaultcolor, style = defaultStyle)
        drawPath(tounghPath4,color = defaultcolor, style = defaultStyle)
        drawPath(tounghPath5,color = defaultcolor, style = defaultStyle)

        //耳朵
        drawPath(ear1,color = defaultcolor, style = defaultStyle)
        drawPath(ear2,color = defaultcolor, style = defaultStyle)
        drawPath(ear3,color = defaultcolor, style = defaultStyle)

        //脸

        drawPath(jawPath,color = defaultcolor, style = defaultStyle)

        //下巴
        drawPath(jawpath,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath1,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath2,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath3,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath4,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath5,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath6,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath7,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath8,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath9,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath10,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath11,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath12,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath13,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath14,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath15,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath16,color = defaultcolor, style = defaultStyle)

        drawPath(jawpath17,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath18,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath19,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath20,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath21,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath22,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath23,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath24,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath25,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath26,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath27,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath28,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath29,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath30,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath31,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath32,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath33,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath34,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath35,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath36,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath37,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath38,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath39,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath40,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath41,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath42,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath43,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath44,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath45,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath46,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath47,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath48,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath49,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath50,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath51,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath52,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath53,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath54,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath55,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath56,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath57,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath58,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath59,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath60,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath61,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath62,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath63,color = defaultcolor, style = defaultStyle)
        drawPath(jawpath64,color = defaultcolor, style = defaultStyle)

        //长胡须
        drawPath(longBeardTop,color = defaultcolor, style = defaultStyle)
        drawPath(longBeardBottom,color = defaultcolor, style = defaultStyle)
    }
}