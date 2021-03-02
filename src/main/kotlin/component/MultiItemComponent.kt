package component

import data.models.model.MultiItem
import data.network.api.callMultiItem
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.*
import react.dom.*

interface MultiItemState : RState {
    var multiItems: List<MultiItem>
}

class MultiItemComponent(props: RProps) : RComponent<RProps, MultiItemState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callMultiItem()
            setState {
                multiItems = response.multiItems
            }
        }
    }

    override fun MultiItemState.init(props: RProps) {
        multiItems = emptyList()
    }

    override fun RBuilder.render() {
        div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
            h1(classes = "h2") {
                +"Multi item"
            }
        }

        div(classes = "table-responsive") {
            table(classes = "table table-striped table-sm") {
                thead {
                    tr {
                        th {
                            +"multiId"
                        }
                        th {
                            +"roomNo"
                        }
                        th {
                            +"latitude"
                        }
                        th {
                            +"longitude"
                        }
                        th {
                            +"status"
                        }
                        th {
                            +"dateTimeCreated"
                        }
                        th {
                            +"dateTimeUpdated"
                        }
                    }
                }
                tbody {
                    state.multiItems.forEach { multiItem ->
                        tr {
                            td {
                                +"${multiItem.multiId}"
                            }
                            td {
                                +"${multiItem.roomNo}"
                            }
                            td {
                                +"${multiItem.latitude}"
                            }
                            td {
                                +"${multiItem.longitude}"
                            }
                            td {
                                +"${multiItem.status}"
                            }
                            td {
                                +"${multiItem.dateTimeCreated}"
                            }
                            td {
                                +"${multiItem.dateTimeUpdated}"
                            }
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.multiItem() = child(MultiItemComponent::class) {
}
