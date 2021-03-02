package data.models.model

import kotlinx.serialization.Serializable

@Serializable
data class LogActive(
    val logId: Int? = null,
    val playerId: String? = null,
    val dateTimeIn: Long? = null,
    val dateTimeOut: Long? = null,
)
