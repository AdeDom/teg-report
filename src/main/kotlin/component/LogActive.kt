package component

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class LogActive(props: RProps) : RComponent<RProps, RState>(props) {

    override fun RBuilder.render() {
        h1 {
            +"LogActive"
        }
    }

}

fun RBuilder.logActive() = child(LogActive::class) {
}
