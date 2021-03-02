package data.models.model

import kotlinx.serialization.Serializable

@Serializable
data class ItemCollection(
    val collectionId: Int? = null,
    val playerId: String? = null,
    val itemId: Int? = null,
    val qty: Int? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val dateTime: Long? = null,
    val mode: String? = null,
)
