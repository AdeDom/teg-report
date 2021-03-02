package data.models.model

import kotlinx.serialization.Serializable

@Serializable
data class Room(
    val roomId: Int? = null,
    val roomNo: String? = null,
    val name: String? = null,
    val people: Int? = null,
    val status: String? = null,
    val startTime: Long? = null,
    val endTime: Long? = null,
    val dateTime: Long? = null,
)
