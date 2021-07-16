import androidx.compose.runtime.mutableStateOf
import api.Api
import api.RidesResponse
import kotlinx.browser.document
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.selectors.id

import org.jetbrains.compose.web.renderComposable
import org.w3c.dom.HTMLElement

fun main() {

    val ridesResponse = mutableStateOf<RidesResponse?>(null)
    val api = Api()
    val coroutineScope = CoroutineScope(Dispatchers.Main)

    coroutineScope.launch {
        ridesResponse.value = api.getAvailableRides()
    }


    val root = document.getElementById("root") as HTMLElement?
    val rootDestinations = document.getElementById("rootDestinations") as HTMLElement?

    if (root != null) {
        renderComposable(rootElementId = "root") {
            navigationArea()
            sliderArea()
            popularDestinationsArea()
            footerArea()
        }
    } else if (rootDestinations != null) {
        renderComposable(rootElementId = "rootDestinations") {
            navigationArea()
            val rides = ridesResponse.value
            if (rides != null) {
                availableTrips(rides)
            }
            footerArea()
        }
    }
}



