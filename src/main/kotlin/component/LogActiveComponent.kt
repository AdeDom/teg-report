package component

import data.network.api.callLogActive
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class LogActiveComponent(props: RProps) : RComponent<RProps, RState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callLogActive()
            window.alert("logActives : " + response.logActives.size.toString())
        }
    }

    override fun RBuilder.render() {
        h1 {
            +"Log active"
        }
    }

}

fun RBuilder.logActive() = child(LogActiveComponent::class) {
}
