package data.models.response

import data.models.model.MultiCollection
import kotlinx.serialization.Serializable

@Serializable
data class MultiCollectionResponse(
    var success: Boolean = false,
    var message: String? = null,
    var multiCollections: List<MultiCollection> = emptyList(),
)
