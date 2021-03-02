package data.models.response

import data.models.model.SingleItem
import kotlinx.serialization.Serializable

@Serializable
data class SingleItemResponse(
    var success: Boolean = false,
    var message: String? = null,
    var singleItems: List<SingleItem> = emptyList(),
)
