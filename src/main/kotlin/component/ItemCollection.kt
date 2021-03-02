package component

import data.network.api.callItemCollection
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class ItemCollection(props: RProps) : RComponent<RProps, RState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callItemCollection()
            window.alert("itemCollections : " + response.itemCollections.size.toString())
        }
    }

    override fun RBuilder.render() {
        h1 {
            +"Item collection"
        }
    }

}

fun RBuilder.itemCollection() = child(ItemCollection::class) {
}
