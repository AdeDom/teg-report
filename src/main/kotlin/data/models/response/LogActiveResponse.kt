package data.models.response

import data.models.model.LogActive
import kotlinx.serialization.Serializable

@Serializable
data class LogActiveResponse(
    var success: Boolean = false,
    var message: String? = null,
    var logActives: List<LogActive> = emptyList(),
)
