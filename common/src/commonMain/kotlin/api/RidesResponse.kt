package api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RidesResponse(
    @SerialName("totalCount")
    val totalCount: Int,
    @SerialName("data")
    val data: List<RideData>
)

@Serializable
data class RideResponse(
    @SerialName("ride")
    val ride: RideData,
    @SerialName("riders")
    val riders: List<RideRider>? = null
)

@Serializable
data class RideData(
    @SerialName("rideId")
    val rideId: String,
    @SerialName("rideGuid")
    val rideGuid: String,
    @SerialName("driverId")
    val driverId: String,
    @SerialName("availableSeatCount")
    val availableSeatCount: Int,
    @SerialName("totalSeatCount")
    val totalSeatCount: Int,
    @SerialName("departureTime")
    val departureTime: String,
    @SerialName("ridePrice")
    val ridePrice: Double,
    @SerialName("currency")
    val currency: String,
    @SerialName("areAllRidersAdmitted")
    val areAllRidersAdmitted: Boolean,
    @SerialName("journey")
    val journey: Journey,
    @SerialName("vehicleId")
    val vehicleId: String,
    @SerialName("rideStatus")
    var rideStatus: Int,
    @SerialName("qrCode")
    val qrCode: List<String>?,
    @SerialName("gender")
    val gender: Int
)

@Serializable
data class Journey(
    @SerialName("pickUpLocation")
    val pickUpLocation: Location,
    @SerialName("destinationLocation")
    val destinationLocation: Location,
    @SerialName("route")
    val route: String,
    @SerialName("distance")
    val distance: String,
    @SerialName("distanceValue")
    val distanceValue: Int,
    @SerialName("duration")
    val duration: String,
    @SerialName("durationValue")
    val durationValue: Int,
    @SerialName("pickupName")
    val pickupName: String,
    @SerialName("destinationName")
    val destinationName: String
)

@Serializable
data class Location(
    @SerialName("longitude")
    val longitude: Double,
    @SerialName("latitude")
    val latitude: Double,
    @SerialName("geoHash")
    val geoHash: String = "N/A"
)

@Serializable
data class RideRider(
    @SerialName("userUId")
    val riderId: String,
    @SerialName("onboardStatus")
    val checkInStatus: Int
)
