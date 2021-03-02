package data.models.response

import data.models.model.Player
import kotlinx.serialization.Serializable

@Serializable
data class PlayerResponse(
    var success: Boolean = false,
    var message: String? = null,
    var players: List<Player> = emptyList(),
)
