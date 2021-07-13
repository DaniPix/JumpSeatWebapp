import androidx.compose.runtime.mutableStateOf
import api.Api
import api.RidesResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

import org.jetbrains.compose.web.renderComposable

fun main() {

    val ridesResponse = mutableStateOf<RidesResponse?>(null)
    val api = Api()
    val coroutineScope = CoroutineScope(Dispatchers.Main)
    coroutineScope.launch {
        ridesResponse.value = api.getAvailableRides()
    }

    renderComposable(rootElementId = "root") {
        header()
        val rides = ridesResponse.value
        if (rides != null) {
            body(rides)
        }
        footer()
    }
}



