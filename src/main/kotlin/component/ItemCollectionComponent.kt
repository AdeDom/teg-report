package component

import data.models.model.ItemCollection
import data.network.api.callItemCollection
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.*
import react.dom.*

interface ItemCollectionState : RState {
    var itemCollections: List<ItemCollection>
}

class ItemCollectionComponent(props: RProps) : RComponent<RProps, ItemCollectionState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callItemCollection()
            setState {
                itemCollections = response.itemCollections
            }
        }
    }

    override fun ItemCollectionState.init(props: RProps) {
        itemCollections = emptyList()
    }

    override fun RBuilder.render() {
        div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
            h1(classes = "h2") {
                +"Item collection"
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
                            +"playerId"
                        }
                        th {
                            +"itemId"
                        }
                        th {
                            +"qty"
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
                        th {
                            +"mode"
                        }
                    }
                }
                tbody {
                    state.itemCollections.forEach { itemCollection ->
                        tr {
                            td {
                                +"${itemCollection.collectionId}"
                            }
                            td {
                                +"${itemCollection.playerId}"
                            }
                            td {
                                +"${itemCollection.itemId}"
                            }
                            td {
                                +"${itemCollection.qty}"
                            }
                            td {
                                +"${itemCollection.latitude}"
                            }
                            td {
                                +"${itemCollection.longitude}"
                            }
                            td {
                                +"${itemCollection.dateTime}"
                            }
                            td {
                                +"${itemCollection.mode}"
                            }
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.itemCollection() = child(ItemCollectionComponent::class) {
}
