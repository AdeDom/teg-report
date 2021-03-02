package component

import data.network.api.callMultiItem
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class MultiItemComponent(props: RProps) : RComponent<RProps, RState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callMultiItem()
            window.alert("multiItems : " + response.multiItems.size.toString())
        }
    }

    override fun RBuilder.render() {
        h1 {
            +"Multi item"
        }
    }

}

fun RBuilder.multiItem() = child(MultiItemComponent::class) {
}
