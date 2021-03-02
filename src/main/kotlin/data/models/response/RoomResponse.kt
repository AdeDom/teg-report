package data.models.response

import data.models.model.Room
import kotlinx.serialization.Serializable

@Serializable
data class RoomResponse(
    var success: Boolean = false,
    var message: String? = null,
    var rooms: List<Room> = emptyList(),
)
