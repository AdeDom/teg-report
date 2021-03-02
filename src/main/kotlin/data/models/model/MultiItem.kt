package data.models.model

import kotlinx.serialization.Serializable

@Serializable
data class MultiItem(
    val multiId: Int? = null,
    val roomNo: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val status: String? = null,
    val dateTimeCreated: Long? = null,
    val dateTimeUpdated: Long? = null,
)
