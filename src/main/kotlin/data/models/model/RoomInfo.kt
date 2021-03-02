package data.models.model

import kotlinx.serialization.Serializable

@Serializable
data class RoomInfo(
    val infoId: Int? = null,
    val roomNo: String? = null,
    val playerId: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val team: String? = null,
    val status: String? = null,
    val role: String? = null,
    val dateTime: Long? = null,
)
