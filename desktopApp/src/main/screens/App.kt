package screens

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import screens.splashScreen.SplashScreenStatus
import kotlin.system.exitProcess
import screens.splashScreen.SplashScreenStatus.*
import screens.splashScreen.initSplashScreen

// This is the entry point of this application
@Composable
fun initApp(
    showSplashString: Boolean = true,
    modifier: Modifier = Modifier
) {

    var splashScreenStatus by remember { mutableStateOf(SplashScreenStatus.SHOW) }

    when(splashScreenStatus) {
        SHOW -> {
            initSplashScreen(
                onSplashFinished = {
                    splashScreenStatus = HIDE
                }
            )
        }
        HIDE -> {
            loadApplicationWindow()
        }
    }
}

// The window will appear once the splash screen concludes
@Composable
fun loadApplicationWindow() {

    Window(
        onCloseRequest = {
            exitProcess(0)
        }
    ) {

    }
}
