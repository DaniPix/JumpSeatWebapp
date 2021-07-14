import androidx.compose.runtime.Composable
import api.RidesResponse
import core.parseTimestampToLocalDateTime
import org.jetbrains.compose.common.foundation.layout.Column
import org.jetbrains.compose.common.ui.Modifier
import org.jetbrains.compose.common.ui.padding
import org.jetbrains.compose.common.ui.unit.dp
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.attr
import org.jetbrains.compose.web.dom.*

@Composable
fun body(rides: RidesResponse, modifier: Modifier = Modifier) {
    Div(attrs = {
        classes("container")
    }) {
        Column(modifier.padding(16.dp)) {
            rides.data.forEach { ride ->
                Div(attrs = {
                    classes("card")
                }) {
                    P(attrs = {
                        style {
                            fontSize(17.px)
                            paddingLeft(16.px)
                            paddingRight(16.px)
                            paddingTop(16.px)
                        }
                    }) {
                        Text(ride.departureTime.parseTimestampToLocalDateTime()?.date.toString())
                    }


                    P(attrs = {
                        style {
                            fontSize(21.px)
                            paddingLeft(16.px)
                            paddingRight(16.px)
                            paddingTop(8.px)
                        }
                    }) {
                        Text(ride.journey.pickupName)
                    }



                    P(attrs = {
                        style {
                            fontSize(21.px)
                            paddingLeft(16.px)
                            paddingRight(16.px)
                            paddingTop(16.px)
                        }
                    }) {
                        Text(ride.journey.destinationName)
                    }



                    P(attrs = {
                        style {
                            paddingLeft(16.px)
                            paddingRight(16.px)
                            paddingTop(16.px)
                            paddingBottom(16.px)
                            textAlign("right")
                        }
                    }) {
                        Button(attrs = {
                            classes("button")
                        }) {
                            Text("Purchase")
                        }
                    }
                }
            }
        }
    }
}
