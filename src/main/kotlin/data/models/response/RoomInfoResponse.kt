package data.models.response

import data.models.model.RoomInfo
import kotlinx.serialization.Serializable

@Serializable
data class RoomInfoResponse(
    var success: Boolean = false,
    var message: String? = null,
    var roomInfoList: List<RoomInfo> = emptyList(),
)
