package data.models.response

import data.models.model.MultiItem
import kotlinx.serialization.Serializable

@Serializable
data class MultiItemResponse(
    var success: Boolean = false,
    var message: String? = null,
    var multiItems: List<MultiItem> = emptyList(),
)
