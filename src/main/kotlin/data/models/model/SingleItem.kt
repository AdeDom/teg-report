package data.models.model

import kotlinx.serialization.Serializable

@Serializable
data class SingleItem(
    val singleId: Int? = null,
    val itemTypeId: Int? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val playerId: String? = null,
    val status: String? = null,
    val dateTimeCreated: Long? = null,
    val dateTimeUpdated: Long? = null,
)
