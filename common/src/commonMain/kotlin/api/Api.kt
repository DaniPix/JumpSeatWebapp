package api

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.serialization.decodeFromString

class Api {

    private val json = kotlinx.serialization.json.Json { isLenient = true; ignoreUnknownKeys = true }

    private val httpClient = HttpClient {
        install(JsonFeature) {
            serializer = KotlinxSerializer(json)
        }
        install(Logging) {
            logger = Logger.DEFAULT
            level = LogLevel.INFO
        }
    }

    suspend fun getAvailableRides(): RidesResponse? {
        val response: HttpResponse =
            httpClient.get("https://raw.githubusercontent.com/DaniPix/FoursquareApp/master/dummy.json") {
                method = HttpMethod.Get

                headers {
                    append(HttpHeaders.ContentType, "application/json")
                }
            }


        try {
            val rides: RidesResponse = json.decodeFromString(response.receive())
            return rides
        } catch (e: Exception) {

        }

        return null
    }
}