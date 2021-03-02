package data.models.model

import kotlinx.serialization.Serializable

@Serializable
data class MultiCollection(
    val collectionId: Int? = null,
    val roomNo: String? = null,
    val playerId: String? = null,
    val team: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val dateTime: Long? = null,
)
