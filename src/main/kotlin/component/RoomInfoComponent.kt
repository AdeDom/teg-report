package component

import data.models.model.RoomInfo
import data.network.api.callRoomInfo
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.*
import react.dom.*

interface RoomInfoState : RState {
    var roomInfoList: List<RoomInfo>
}

class RoomInfoComponent(props: RProps) : RComponent<RProps, RoomInfoState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callRoomInfo()
            setState {
                roomInfoList = response.roomInfoList
            }
        }
    }

    override fun RoomInfoState.init(props: RProps) {
        roomInfoList = emptyList()
    }

    override fun RBuilder.render() {
        div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
            h1(classes = "h2") {
                +"Room info"
            }
        }

        div(classes = "table-responsive") {
            table(classes = "table table-striped table-sm") {
                thead {
                    tr {
                        th {
                            +"infoId"
                        }
                        th {
                            +"roomNo"
                        }
                        th {
                            +"playerId"
                        }
                        th {
                            +"latitude"
                        }
                        th {
                            +"longitude"
                        }
                        th {
                            +"team"
                        }
                        th {
                            +"status"
                        }
                        th {
                            +"role"
                        }
                        th {
                            +"dateTime"
                        }
                    }
                }
                tbody {
                    state.roomInfoList.forEach { roomInfo ->
                        tr {
                            td {
                                +"${roomInfo.infoId}"
                            }
                            td {
                                +"${roomInfo.roomNo}"
                            }
                            td {
                                +"${roomInfo.playerId}"
                            }
                            td {
                                +"${roomInfo.latitude}"
                            }
                            td {
                                +"${roomInfo.longitude}"
                            }
                            td {
                                +"${roomInfo.team}"
                            }
                            td {
                                +"${roomInfo.status}"
                            }
                            td {
                                +"${roomInfo.role}"
                            }
                            td {
                                +"${roomInfo.dateTime}"
                            }
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.roomInfo() = child(RoomInfoComponent::class) {
}
