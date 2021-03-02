package data.models.response

import data.models.model.ItemCollection
import kotlinx.serialization.Serializable

@Serializable
data class ItemCollectionResponse(
    var success: Boolean = false,
    var message: String? = null,
    var itemCollections: List<ItemCollection> = emptyList(),
)
