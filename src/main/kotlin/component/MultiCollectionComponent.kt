package component

import data.network.api.callMultiCollection
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.h1

class MultiCollectionComponent(props: RProps) : RComponent<RProps, RState>(props) {

    private val scope = MainScope()

    init {
        scope.launch {
            val response = callMultiCollection()
            window.alert("multiCollections : " + response.multiCollections.size.toString())
        }
    }

    override fun RBuilder.render() {
        h1 {
            +"Multi collection"
        }
    }

}

fun RBuilder.multiCollection() = child(MultiCollectionComponent::class) {
}
