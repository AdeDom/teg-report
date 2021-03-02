package component

import data.network.api.callPlayer
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class Player(props: RProps) : RComponent<RProps, RState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callPlayer()
            window.alert("players : " + response.players.size.toString())
        }
    }

    override fun RBuilder.render() {
        h1 {
            +"Player"
        }
    }

}

fun RBuilder.player() = child(Player::class) {
}
