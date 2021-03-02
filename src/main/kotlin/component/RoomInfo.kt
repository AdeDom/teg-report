package component

import data.network.api.callRoomInfo
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class RoomInfo(props: RProps) : RComponent<RProps, RState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callRoomInfo()
            window.alert("roomInfoList : " + response.roomInfoList.size.toString())
        }
    }

    override fun RBuilder.render() {
        h1 {
            +"Room info"
        }
    }

}

fun RBuilder.roomInfo() = child(RoomInfo::class) {
}
