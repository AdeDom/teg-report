package component

import kotlinx.html.ButtonType
import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*

interface AppState : RState {
    var selectNav: Int
}

class App(props: RProps) : RComponent<RProps, AppState>(props) {

    private val navMenu = listOf(
        "Dashboard",
        "item_collection",
        "log_active",
        "multi_collection",
        "multi_item",
        "player",
        "room",
        "room_info",
        "single_item",
    )

    override fun AppState.init(props: RProps) {
        selectNav = 0
    }

    override fun RBuilder.render() {
        // header
        header(classes = "navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow") {
            a(classes = "navbar-brand col-md-3 col-lg-2 me-0 px-3", href = "#") {
                +"The egg game - Report"
            }
            button(classes = "navbar-toggler position-absolute d-md-none collapsed", type = ButtonType.button) {
                attrs["data-bs-toggle"] = "collapse"
                attrs["data-bs-target"] = "#sidebarMenu"
                attrs["aria-controls"] = "sidebarMenu"
                attrs["aria-expanded"] = "false"
                attrs["aria-label"] = "Toggle navigation"
                span(classes = "navbar-toggler-icon") {
                }
            }
        }

        // content
        div(classes = "container-fluid") {
            div(classes = "row") {
                // nav
                nav(classes = "col-md-3 col-lg-2 d-md-block bg-light sidebar collapse") {
                    attrs.id = "sidebarMenu"
                    div(classes = "position-sticky pt-3") {
                        ul(classes = "nav flex-column") {
                            navMenu()
                        }
                    }
                }

                // main
                main(classes = "col-md-9 ms-sm-auto col-lg-10 px-md-4") {
                    when (state.selectNav) {
                        0 -> dashboard()
                        1 -> itemCollection()
                        2 -> logActive()
                        3 -> multiCollection()
                        4 -> multiItem()
                        5 -> player()
                        6 -> room()
                        7 -> roomInfo()
                        8 -> singleItem()
                    }
                }
            }
        }
    }

    private fun RBuilder.navMenu() {
        navMenu.forEachIndexed { index, navItem ->
            li(classes = "nav-item") {
                val linkActive = if (state.selectNav == index) "active" else ""
                a(classes = "nav-link $linkActive") {
                    +navItem.replace("_", " ").capitalize()
                    attrs.onClickFunction = {
                        setState {
                            selectNav = index
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.app() = child(App::class) {
}
