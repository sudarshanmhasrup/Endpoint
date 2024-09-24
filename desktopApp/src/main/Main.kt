import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.application
import screens.initApp
import screens.splashScreen.SplashScreenStatus

// The main function
fun main() = application {
    initApp(
        showSplashString = SplashScreenStatus.SHOW,
        modifier = Modifier.fillMaxSize()
    )
}