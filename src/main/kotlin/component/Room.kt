package component

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class Room(props: RProps) : RComponent<RProps, RState>(props) {

    override fun RBuilder.render() {
        h1 {
            +"Room"
        }
    }

}

fun RBuilder.room() = child(Room::class) {
}
