import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application

val screenWidth = 600.dp//screensize.width.dp//600.dp
val screenHeight = 450.dp//screensize.height.dp//600.dp

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication, state = WindowState(
            size = DpSize(screenWidth, screenHeight),
            position = WindowPosition(Alignment.TopEnd)
        )
    ) {
        dragon(Modifier.fillMaxSize())
    }
}
