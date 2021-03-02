package component

import data.models.model.Player
import data.network.api.callPlayer
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.*
import react.dom.*

interface PlayerState : RState {
    var players: List<Player>
}

class PlayerComponent(props: RProps) : RComponent<RProps, PlayerState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callPlayer()
            setState {
                players = response.players
            }
        }
    }

    override fun PlayerState.init(props: RProps) {
        players = emptyList()
    }

    override fun RBuilder.render() {
        div(classes = "d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom") {
            h1(classes = "h2") {
                +"Player"
            }
        }

        div(classes = "table-responsive") {
            table(classes = "table table-striped table-sm") {
                thead {
                    tr {
                        th {
                            +"playerId"
                        }
                        th {
                            +"username"
                        }
                        th {
                            +"password"
                        }
                        th {
                            +"name"
                        }
                        th {
                            +"image"
                        }
                        th {
                            +"gender"
                        }
                        th {
                            +"birthDate"
                        }
                        th {
                            +"state"
                        }
                        th {
                            +"latitude"
                        }
                        th {
                            +"longitude"
                        }
                        th {
                            +"currentMode"
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
                    state.players.forEach { player ->
                        tr {
                            td {
                                +"${player.playerId}"
                            }
                            td {
                                +"${player.username}"
                            }
                            td {
                                +"${player.password}"
                            }
                            td {
                                +"${player.name}"
                            }
                            td {
                                +"${player.image}"
                            }
                            td {
                                +"${player.gender}"
                            }
                            td {
                                +"${player.birthDate}"
                            }
                            td {
                                +"${player.state}"
                            }
                            td {
                                +"${player.latitude}"
                            }
                            td {
                                +"${player.longitude}"
                            }
                            td {
                                +"${player.currentMode}"
                            }
                            td {
                                +"${player.dateTimeCreated}"
                            }
                            td {
                                +"${player.dateTimeUpdated}"
                            }
                        }
                    }
                }
            }
        }
    }

}

fun RBuilder.player() = child(PlayerComponent::class) {
}
