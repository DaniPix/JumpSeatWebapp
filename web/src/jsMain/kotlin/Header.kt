import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.*

@Composable
fun header() {
    Nav(attrs = {
        classes("navbar", "navbar-expand-lg", "navbar-light", "bg-light")
    }) {
        Div(attrs = {
            classes("container-fluid")
        }) {
            A(attrs = {
                classes("navbar-brand")
            }, href = "#") {
                Img(src = "/brand_icon.svg") {
                    style {
                        width(84.px)
                        height(84.px)
                        padding(24.px)
                    }
                }
            }
            Div(attrs = {
                classes("collapse", "navbar-collapse")
                id("navbarSupportedContent")
            }) {
                Ul(attrs = {
                    classes("navbar-nav", "me-auto", "mb-2", "mb-lg-0")
                }) {
                    Li(attrs = {
                        classes("nav-item")
                    }) {
                        A(attrs = {
                            classes("nav-link")
                        }, href = "#") {
                            Text("Book trips")
                        }
                    }
                    Li(attrs = {
                        classes("nav-item")
                    }) {
                        A(attrs = {
                            classes("nav-link")
                        }, href = "#") {
                            Text("How does it work ?")
                        }
                    }
                    Li(attrs = {
                        classes("nav-item")
                    }) {
                        A(attrs = {
                            classes("nav-link")
                        }, href = "#") {
                            Text("Sign Up")
                        }
                    }
                }
            }
        }
    }
}