package component

import kotlinx.html.ButtonType
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

class Dashboard(props: RProps) : RComponent<RProps, RState>(props) {

    override fun RBuilder.render() {
        div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
            h1(classes = "h2") {
                +"Dashboard"
            }
            div(classes = "btn-toolbar mb-2 mb-md-0") {
                div(classes = "btn-group me-2") {
                    button(classes = "btn btn-sm btn-outline-secondary", type = ButtonType.button) {
                        +"Share"
                    }
                    button(classes = "btn btn-sm btn-outline-secondary", type = ButtonType.button) {
                        +"Export"
                    }
                }
                button(
                    classes = "btn btn-sm btn-outline-secondary dropdown-toggle",
                    type = ButtonType.button
                ) {
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

fun RBuilder.dashboard() = child(Dashboard::class) {
}
