package component

import data.network.api.callSingleItem
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class SingleItemComponent(props: RProps) : RComponent<RProps, RState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callSingleItem()
            window.alert("singleItems : " + response.singleItems.size.toString())
        }
    }

    override fun RBuilder.render() {
        h1 {
            +"Single item"
        }
    }

}

fun RBuilder.singleItem() = child(SingleItemComponent::class) {
}
