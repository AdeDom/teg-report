package data.network.api

import data.models.response.*
import data.network.client.client
import io.ktor.client.request.*

const val BASE_URL = "https://the-egg-game.herokuapp.com/"

suspend fun callItemCollection(): ItemCollectionResponse {
    return client.get("${BASE_URL}api/report/item-collection")
}

suspend fun callLogActive(): LogActiveResponse {
    return client.get("${BASE_URL}api/report/log-active")
}

suspend fun callMultiCollection(): MultiCollectionResponse {
    return client.get("${BASE_URL}api/report/multi-collection")
}

suspend fun callMultiItem(): MultiItemResponse {
    return client.get("${BASE_URL}api/report/multi-item")
}

suspend fun callPlayer(): PlayerResponse {
    return client.get("${BASE_URL}api/report/player")
}

suspend fun callRoom(): RoomResponse {
    return client.get("${BASE_URL}api/report/room")
}

suspend fun callRoomInfo(): RoomInfoResponse {
    return client.get("${BASE_URL}api/report/room-info")
}

suspend fun callSingleItem(): SingleItemResponse {
    return client.get("${BASE_URL}api/report/single-item")
}
