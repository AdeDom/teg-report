package component

import data.models.model.LogActive
import data.network.api.callLogActive
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.*
import react.dom.*

interface LogActiveState : RState {
    var logActives: List<LogActive>
}

class LogActiveComponent(props: RProps) : RComponent<RProps, LogActiveState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callLogActive()
            setState {
                logActives = response.logActives
            }
        }
    }

    override fun LogActiveState.init(props: RProps) {
        logActives = emptyList()
    }

    override fun RBuilder.render() {
        div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
            h1(classes = "h2") {
                +"Log active"
            }
        }

        div(classes = "table-responsive") {
            table(classes = "table table-striped table-sm") {
                thead {
                    tr {
                        th {
                            +"logId"
                        }
                        th {
                            +"playerId"
                        }
                        th {
                            +"dateTimeIn"
                        }
                        th {
                            +"dateTimeOut"
                        }
                    }
                }
                tbody {
                    state.logActives.forEach { logActive ->
                        tr {
                            td {
                                +"${logActive.logId}"
                            }
                            td {
                                +"${logActive.playerId}"
                            }
                            td {
                                +"${logActive.dateTimeIn}"
                            }
                            td {
                                +"${logActive.dateTimeOut}"
                            }
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.logActive() = child(LogActiveComponent::class) {
}
