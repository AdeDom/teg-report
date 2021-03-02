package data.models.model

import kotlinx.serialization.Serializable

@Serializable
data class Player(
    val playerId: String? = null,
    val username: String? = null,
    val password: String? = null,
    val name: String? = null,
    val image: String? = null,
    val gender: String? = null,
    val birthDate: Long? = null,
    val state: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val currentMode: String? = null,
    val dateTimeCreated: Long? = null,
    val dateTimeUpdated: Long? = null,
)
