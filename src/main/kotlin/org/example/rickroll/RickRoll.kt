import java.awt.Desktop
import java.net.URI

fun main() {
    rickroll()
}

fun rickroll() {
    try {
        // Opens the web browser and plays the Rickroll Song
        Desktop.getDesktop().browse(URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"))
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
