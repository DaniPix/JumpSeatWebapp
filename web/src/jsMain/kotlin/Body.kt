import androidx.compose.runtime.Composable
import api.RidesResponse
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun body(rides: RidesResponse) {
    Div(attrs = {
        classes("content")
    }) {
        Text(rides.data.first().journey.destinationName)
    }
}
