import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto
import org.jetbrains.compose.web.dom.*

@Composable
fun header() {
    Div(attrs = {
        classes("center")
    }) {

        Img(src = "/image.png", attrs = {
            style {
                height(600.px)
                width(1000.px)
                borderRadius(64.px)
            }
        })

        Nav {
            A(href = "#") {
                Text("Book Trips")
            }

            A(href = "#") {
                Text("Sign Up")
            }

            A(href = "#") {
                Text("About Us")
            }
        }
    }
}