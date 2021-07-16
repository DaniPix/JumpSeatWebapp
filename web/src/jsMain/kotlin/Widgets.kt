import androidx.compose.runtime.Composable
import api.RidesResponse
import core.parseTimestampToLocalDateTime
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.attributes.placeholder
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.selectors.id
import org.jetbrains.compose.web.css.selectors.type
import org.jetbrains.compose.web.dom.*

@Composable
fun navigationArea() {
    Header {
        Div(attrs = { classes("header-area") }) {
            Div(attrs = {
                id("sticky-header")
                classes("main-header-area")
            }) {
                Div(attrs = { classes("container-fluid") }) {
                    Div(attrs = { classes("row", "align-items-center") }) {
                        Div(attrs = { classes("col-xl-2", "col-lg-2") }) {
                            Div(attrs = { classes("logo") }) {
                                A(href = "index.html") {
                                    Img(src = "img/logo.svg", alt = "Logo") {
                                        style {
                                            width(48.px)
                                            height(48.px)
                                            margin(16.px)
                                        }
                                    }
                                    Text("Jumpseat")
                                }
                            }
                        }
                        Div(attrs = { classes("col-xl-6", "col-lg-6") }) {
                            Div(attrs = { classes("main-menu", "d-none", "d-lg-block") }) {
                                Nav {
                                    Ul(attrs = { id("navigation") }) {
                                        Li {
                                            A(attrs = { classes("active") }, href = "index.html") {
                                                Text("Home")
                                            }
                                        }
                                        Li {
                                            A(href = "destinations.html") {
                                                Text("Available trips")
                                            }

                                        }
                                        Li {
                                            A(href = "index.html") {
                                                Text("About Us")
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        Div(attrs = { classes("col-12") }) {
                            Div(attrs = { classes("mobile_menu", "d-block", "d-lg-none") })
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun sliderArea() {
    Div(attrs = { classes("slider_area") }) {
        Div(attrs = { classes("slider_active") }) {
            Div(attrs = { classes("single_slider", "d-flex", "align-items-center", "slider_bg_2", "overlay") }) {
                Div(attrs = { classes("container") }) {
                    Div(attrs = { classes("row", "align-items-center") }) {
                        Div(attrs = { classes("col-xl-12", "col-md-12") }) {
                            Div(attrs = { classes("slider_text", "text-center") }) {
                                H3 {
                                    Text("Explore Sri Lanka")
                                }
                                P {
                                    Text("Travel is the only thing you can buy that makes your richer.")
                                }
                                A(href = "#", attrs = { classes("boxed-btn3") }) {
                                    Text("Begin adventure")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun popularDestinationsArea() {
    Div(attrs = { classes("popular_destination_area") }) {
        Div(attrs = { classes("container") }) {
            Div(attrs = { classes("row", "justify-content-center") }) {
                Div(attrs = { classes("col-lg-6") }) {
                    Div(attrs = { classes("section_title", "text-center", "mb_70") }) {
                        H3 {
                            Text("Popular destinations")
                        }
                        P {
                            Text("Explore one of our top destinations in Sri Lanka.")
                        }
                    }
                }
            }
            Div(attrs = { classes("row") }) {
                Div(attrs = { classes("col-lg-4", "col-md-6") }) {
                    Div(attrs = { classes("single_destination") }) {
                        Div(attrs = { classes("thumb") }) {
                            Img(src = "img/destination/kandy.jpg", alt = "Top Destination")
                        }
                        Div(attrs = { classes("content") }) {
                            P(attrs = { classes("d-flex", "align-items-center") }) {
                                Text("Kandy")
                            }
                        }
                    }
                }
                Div(attrs = { classes("col-lg-4", "col-md-6") }) {
                    Div(attrs = { classes("single_destination") }) {
                        Div(attrs = { classes("thumb") }) {
                            Img(src = "img/destination/arugam_bay.jpg", alt = "Top Destination")
                        }
                        Div(attrs = { classes("content") }) {
                            P(attrs = { classes("d-flex", "align-items-center") }) {
                                Text("Arugam Bay")
                            }
                        }
                    }
                }
                Div(attrs = { classes("col-lg-4", "col-md-6") }) {
                    Div(attrs = { classes("single_destination") }) {
                        Div(attrs = { classes("thumb") }) {
                            Img(src = "img/destination/colombo.jpg", alt = "Top Destination")
                        }
                        Div(attrs = { classes("content") }) {
                            P(attrs = { classes("d-flex", "align-items-center") }) {
                                Text("Colombo")
                            }
                        }
                    }
                }
                Div(attrs = { classes("col-lg-4", "col-md-6") }) {
                    Div(attrs = { classes("single_destination") }) {
                        Div(attrs = { classes("thumb") }) {
                            Img(src = "img/destination/gale.jpg", alt = "Top Destination")
                        }
                        Div(attrs = { classes("content") }) {
                            P(attrs = { classes("d-flex", "align-items-center") }) {
                                Text("Gale")
                            }
                        }
                    }
                }
                Div(attrs = { classes("col-lg-4", "col-md-6") }) {
                    Div(attrs = { classes("single_destination") }) {
                        Div(attrs = { classes("thumb") }) {
                            Img(src = "img/destination/sigiriya.jpg", alt = "Top Destination")
                        }
                        Div(attrs = { classes("content") }) {
                            P(attrs = { classes("d-flex", "align-items-center") }) {
                                Text("Sigiriya")
                            }
                        }
                    }
                }
                Div(attrs = { classes("col-lg-4", "col-md-6") }) {
                    Div(attrs = { classes("single_destination") }) {
                        Div(attrs = { classes("thumb") }) {
                            Img(src = "img/destination/nuwara_eliya.jpg", alt = "Top Destination")
                        }
                        Div(attrs = { classes("content") }) {
                            P(attrs = { classes("d-flex", "align-items-center") }) {
                                Text("Nuwara Eliya")
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun footerArea() {
    Footer(attrs = { classes("footer") }) {
        Div(attrs = { classes("footer_top") }) {
            Div(attrs = { classes("container") }) {

                Div(attrs = { classes("row", "justify-content-center") }) {
                    Div(attrs = { classes("col-lg-6") }) {
                        Div(attrs = { classes("section_title", "text-center", "mb_70") }) {
                            H3 {
                                Text("Current available rides")
                            }
                            P {
                                Text("Pick one of the available rides.")
                            }
                        }
                    }
                }


                Div(attrs = { classes("row") }) {
                    Div(attrs = { classes("col-xl-4", "col-md-6", "col-lg-4") }) {
                        Div(attrs = { classes("footer_widget") }) {
                            Div(attrs = { classes("footer_logo") }) {
                                A(href = "#") {
                                    Img(src = "img/logo.svg", alt = "Logo") {
                                        style {
                                            width(48.px)
                                            height(48.px)
                                            marginBottom(16.px)
                                        }
                                    }
                                }
                                H3(attrs = { classes("footer_title") }) {
                                    Text("Jumpseat")
                                }
                            }
                            P {
                                Text("Colombo, Sri Lanka\ncontact@jumpseat.company")
                            }
                        }
                    }
                    Div(attrs = { classes("col-xl-2", "col-md-6", "col-lg-2") }) {
                        Div(attrs = { classes("footer_widget") }) {
                            H3(attrs = { classes("footer_title") }) {
                                Text("Company")
                            }
                            Ul {
                                Li {
                                    A(href = "#") {
                                        Text("Pricing")
                                    }
                                }
                                Li {
                                    A(href = "#") {
                                        Text("About")
                                    }
                                }
                                Li {
                                    A(href = "#") {
                                        Text("Contact")
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun availableTrips(ridesResponse: RidesResponse) {

    val randomImages = mutableListOf(
        "img/destination/arugam_bay.jpg",
        "img/destination/kandy.jpg",
        "img/destination/colombo.jpg",
        "img/destination/gale.jpg",
        "img/destination/nuwara_eliya.jpg",
        "img/destination/sigiriya.jpg"
    )

    Div(attrs = { classes("popular_places_area") }) {
        Div(attrs = { classes("container") }) {
            Div(attrs = { classes("row") }) {
                Div(attrs = { classes("col") }) {
                    Div(attrs = { classes("row") }) {
                        ridesResponse.data.forEach { ride ->
                            Div(attrs = { classes("col-lg-6", "col-md-6") }) {
                                Div(attrs = { classes("single_place") }) {
                                    Div(attrs = { classes("thumb") }) {
                                        Img(src = randomImages.random(), alt = "") {
                                            style {
                                                width(250.px)
                                                height(250.px)
                                            }
                                        }
                                        A(href = "#", attrs = { classes("prise") }) {
                                            Text("$${ride.ridePrice / 100}/seat")
                                        }
                                    }
                                    Div(attrs = { classes("place_info") }) {
                                        H3 {
                                            Text(ride.departureTime.parseTimestampToLocalDateTime()?.date.toString())
                                        }
                                        P {
                                            Text(ride.journey.pickupName)
                                        }
                                        P {
                                            Text(ride.journey.destinationName)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
