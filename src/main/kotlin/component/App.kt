package component

import kotlinx.html.ButtonType
import kotlinx.html.InputType
import kotlinx.html.id
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

class App(props: RProps) : RComponent<RProps, RState>(props) {

    override fun RBuilder.render() {
        // header
        header(classes = "navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow") {
            a(classes = "navbar-brand col-md-3 col-lg-2 me-0 px-3", href = "#") {
                +"Company name"
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
            input(classes = "form-control form-control-dark w-100", type = InputType.text) {
                attrs.placeholder = "Search"
                attrs["aria-label"] = "Search"
            }
            ul(classes = "navbar-nav px-3") {
                li(classes = "nav-item text-nowrap") {
                    a(classes = "nav-link", href = "#") {
                        +"Sign out"
                    }
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
                            li(classes = "nav-item") {
                                a(classes = "nav-link active", href = "#") {
                                    attrs["aria-current"] = "page"
                                    +"Dashboard"
                                }
                            }
                            li(classes = "nav-item") {
                                a(classes = "nav-link", href = "#") {
                                    +"Orders"
                                }
                            }
                            li(classes = "nav-item") {
                                a(classes = "nav-link", href = "#") {
                                    +"Products"
                                }
                            }
                            li(classes = "nav-item") {
                                a(classes = "nav-link", href = "#") {
                                    +"Customers"
                                }
                            }
                            li(classes = "nav-item") {
                                a(classes = "nav-link", href = "#") {
                                    +"Reports"
                                }
                            }
                            li(classes = "nav-item") {
                                a(classes = "nav-link", href = "#") {
                                    +"Integrations"
                                }
                            }
                        }

                        h6(classes = "sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted") {
                            span {
                                +"Saved reports"
                            }
                            a(classes = "link-secondary", href = "#") {
                                attrs["aria-label"] = "Add a new report"
                            }
                        }
                        ul(classes = "nav flex-column mb-2") {
                            li(classes = "nav-item") {
                                a(classes = "nav-link", href = "#") {
                                    +"Current month"
                                }
                            }
                            li(classes = "nav-item") {
                                a(classes = "nav-link", href = "#") {
                                    +"Last quarter"
                                }
                            }
                            li(classes = "nav-item") {
                                a(classes = "nav-link", href = "#") {
                                    +"Social engagement"
                                }
                            }
                            li(classes = "nav-item") {
                                a(classes = "nav-link", href = "#") {
                                    +"Year-end sale"
                                }
                            }
                        }
                    }
                }

                // main
                main(classes = "col-md-9 ms-sm-auto col-lg-10 px-md-4") {
                    div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
                        h1(classes = "h2") {
                            +"Dashboard"
                        }
                        div(classes = "btn-toolbar mb-2 mb-md-0") {
                            div(classes = "btn-group me-2") {
                                button(classes = "btn btn-sm btn-outline-secondary",type = ButtonType.button) {
                                    +"Share"
                                }
                                button(classes = "btn btn-sm btn-outline-secondary",type = ButtonType.button) {
                                    +"Export"
                                }
                            }
                            button(classes = "btn btn-sm btn-outline-secondary dropdown-toggle",type = ButtonType.button) {
                                span {
                                    attrs["data-feather"] = "calendar"
                                }
                                +"This week"
                            }
                        }
                    }

                    h2 {
                        +"Section title"
                    }
                    div(classes = "table-responsive") {
                        table(classes = "table table-striped table-sm") {
                            thead {
                                tr {
                                    th {
                                        +"#"
                                    }
                                    th {
                                        +"Header"
                                    }
                                    th {
                                        +"Header"
                                    }
                                    th {
                                        +"Header"
                                    }
                                    th {
                                        +"Header"
                                    }
                                }
                            }
                            tbody {
                                tr {
                                    td {
                                        +"1,001"
                                    }
                                    td {
                                        +"random"
                                    }
                                    td {
                                        +"data"
                                    }
                                    td {
                                        +"placeholder"
                                    }
                                    td {
                                        +"text"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,002"
                                    }
                                    td {
                                        +"placeholder"
                                    }
                                    td {
                                        +"irrelevant"
                                    }
                                    td {
                                        +"visual"
                                    }
                                    td {
                                        +"layout"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,003"
                                    }
                                    td {
                                        +"data"
                                    }
                                    td {
                                        +"rich"
                                    }
                                    td {
                                        +"dashboard"
                                    }
                                    td {
                                        +"tabular"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,003"
                                    }
                                    td {
                                        +"information"
                                    }
                                    td {
                                        +"placeholder"
                                    }
                                    td {
                                        +"illustrative"
                                    }
                                    td {
                                        +"data"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,004"
                                    }
                                    td {
                                        +"text"
                                    }
                                    td {
                                        +"random"
                                    }
                                    td {
                                        +"layout"
                                    }
                                    td {
                                        +"dashboard"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,005"
                                    }
                                    td {
                                        +"dashboard"
                                    }
                                    td {
                                        +"irrelevant"
                                    }
                                    td {
                                        +"text"
                                    }
                                    td {
                                        +"placeholder"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,006"
                                    }
                                    td {
                                        +"dashboard"
                                    }
                                    td {
                                        +"illustrative"
                                    }
                                    td {
                                        +"rich"
                                    }
                                    td {
                                        +"data"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,007"
                                    }
                                    td {
                                        +"placeholder"
                                    }
                                    td {
                                        +"tabular"
                                    }
                                    td {
                                        +"information"
                                    }
                                    td {
                                        +"irrelevant"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,008"
                                    }
                                    td {
                                        +"random"
                                    }
                                    td {
                                        +"data"
                                    }
                                    td {
                                        +"placeholder"
                                    }
                                    td {
                                        +"text"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,009"
                                    }
                                    td {
                                        +"placeholder"
                                    }
                                    td {
                                        +"irrelevant"
                                    }
                                    td {
                                        +"visual"
                                    }
                                    td {
                                        +"layout"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,010"
                                    }
                                    td {
                                        +"data"
                                    }
                                    td {
                                        +"rich"
                                    }
                                    td {
                                        +"dashboard"
                                    }
                                    td {
                                        +"tabular"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,011"
                                    }
                                    td {
                                        +"information"
                                    }
                                    td {
                                        +"placeholder"
                                    }
                                    td {
                                        +"illustrative"
                                    }
                                    td {
                                        +"data"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,012"
                                    }
                                    td {
                                        +"text"
                                    }
                                    td {
                                        +"placeholder"
                                    }
                                    td {
                                        +"layout"
                                    }
                                    td {
                                        +"dashboard"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,013"
                                    }
                                    td {
                                        +"dashboard"
                                    }
                                    td {
                                        +"irrelevant"
                                    }
                                    td {
                                        +"text"
                                    }
                                    td {
                                        +"visual"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,014"
                                    }
                                    td {
                                        +"dashboard"
                                    }
                                    td {
                                        +"illustrative"
                                    }
                                    td {
                                        +"rich"
                                    }
                                    td {
                                        +"data"
                                    }
                                }
                                tr {
                                    td {
                                        +"1,015"
                                    }
                                    td {
                                        +"random"
                                    }
                                    td {
                                        +"tabular"
                                    }
                                    td {
                                        +"information"
                                    }
                                    td {
                                        +"text"
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

fun RBuilder.app() = child(App::class) {
}
