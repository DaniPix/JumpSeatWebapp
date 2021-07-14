package core

import kotlinx.datetime.*

fun String.parseTimestampToLocalDateTime(): LocalDateTime? {
    return try {
        val instant = Instant.parse(this)
        return instant.toLocalDateTime(TimeZone.currentSystemDefault())
    } catch (throwable: Throwable) {
        null
    }
}