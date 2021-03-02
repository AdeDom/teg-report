package component

import data.models.model.SingleItem
import data.network.api.callSingleItem
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.*
import react.dom.*

interface SingleItemState : RState {
    var singleItems: List<SingleItem>
}

class SingleItemComponent(props: RProps) : RComponent<RProps, SingleItemState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callSingleItem()
            setState {
                singleItems = response.singleItems
            }
        }
    }

    override fun SingleItemState.init(props: RProps) {
        singleItems = emptyList()
    }

    override fun RBuilder.render() {
        div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
            h1(classes = "h2") {
                +"Single item"
            }
        }

        div(classes = "table-responsive") {
            table(classes = "table table-striped table-sm") {
                thead {
                    tr {
                        th {
                            +"singleId"
                        }
                        th {
                            +"itemTypeId"
                        }
                        th {
                            +"latitude"
                        }
                        th {
                            +"longitude"
                        }
                        th {
                            +"playerId"
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
                    state.singleItems.forEach { singleItem ->
                        tr {
                            td {
                                +"${singleItem.singleId}"
                            }
                            td {
                                +"${singleItem.itemTypeId}"
                            }
                            td {
                                +"${singleItem.latitude}"
                            }
                            td {
                                +"${singleItem.longitude}"
                            }
                            td {
                                +"${singleItem.playerId}"
                            }
                            td {
                                +"${singleItem.status}"
                            }
                            td {
                                +"${singleItem.dateTimeCreated}"
                            }
                            td {
                                +"${singleItem.dateTimeUpdated}"
                            }
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.singleItem() = child(SingleItemComponent::class) {
}
