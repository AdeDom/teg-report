package component

import data.network.api.callRoom
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class RoomComponent(props: RProps) : RComponent<RProps, RState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callRoom()
            window.alert("rooms : " + response.rooms.size.toString())
        }
    }

    override fun RBuilder.render() {
        h1 {
            +"Room"
        }
    }

}

fun RBuilder.room() = child(RoomComponent::class) {
}
