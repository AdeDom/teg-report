package component

import data.models.model.MultiCollection
import data.network.api.callMultiCollection
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.*
import react.dom.*

interface MultiCollectionState : RState {
    var multiCollections: List<MultiCollection>
}

class MultiCollectionComponent(props: RProps) : RComponent<RProps, MultiCollectionState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callMultiCollection()
            setState {
                multiCollections = response.multiCollections
            }
        }
    }

    override fun MultiCollectionState.init(props: RProps) {
        multiCollections = emptyList()
    }

    override fun RBuilder.render() {
        div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
            h1(classes = "h2") {
                +"Multi collection"
            }
        }

        div(classes = "table-responsive") {
            table(classes = "table table-striped table-sm") {
                thead {
                    tr {
                        th {
                            +"collectionId"
                        }
                        th {
                            +"roomNo"
                        }
                        th {
                            +"playerId"
                        }
                        th {
                            +"team"
                        }
                        th {
                            +"latitude"
                        }
                        th {
                            +"longitude"
                        }
                        th {
                            +"dateTime"
                        }
                    }
                }
                tbody {
                    state.multiCollections.forEach { multiCollection ->
                        tr {
                            td {
                                +"${multiCollection.collectionId}"
                            }
                            td {
                                +"${multiCollection.roomNo}"
                            }
                            td {
                                +"${multiCollection.playerId}"
                            }
                            td {
                                +"${multiCollection.team}"
                            }
                            td {
                                +"${multiCollection.latitude}"
                            }
                            td {
                                +"${multiCollection.longitude}"
                            }
                            td {
                                +"${multiCollection.dateTime}"
                            }
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.multiCollection() = child(MultiCollectionComponent::class) {
}
