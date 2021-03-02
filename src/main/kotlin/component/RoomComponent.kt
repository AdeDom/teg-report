package component

import data.models.model.Room
import data.network.api.callRoom
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.*
import react.dom.*

interface RoomState : RState {
    var rooms: List<Room>
}

class RoomComponent(props: RProps) : RComponent<RProps, RoomState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callRoom()
            setState {
                rooms = response.rooms
            }
        }
    }

    override fun RoomState.init(props: RProps) {
        rooms = emptyList()
    }

    override fun RBuilder.render() {
        div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
            h1(classes = "h2") {
                +"Room"
            }
        }

        div(classes = "table-responsive") {
            table(classes = "table table-striped table-sm") {
                thead {
                    tr {
                        th {
                            +"roomId"
                        }
                        th {
                            +"roomNo"
                        }
                        th {
                            +"name"
                        }
                        th {
                            +"people"
                        }
                        th {
                            +"status"
                        }
                        th {
                            +"startTime"
                        }
                        th {
                            +"endTime"
                        }
                        th {
                            +"dateTime"
                        }
                    }
                }
                tbody {
                    state.rooms.forEach { room ->
                        tr {
                            td {
                                +"${room.roomId}"
                            }
                            td {
                                +"${room.roomNo}"
                            }
                            td {
                                +"${room.name}"
                            }
                            td {
                                +"${room.people}"
                            }
                            td {
                                +"${room.status}"
                            }
                            td {
                                +"${room.startTime}"
                            }
                            td {
                                +"${room.endTime}"
                            }
                            td {
                                +"${room.dateTime}"
                            }
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.room() = child(RoomComponent::class) {
}
