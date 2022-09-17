package app.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
       get("/") {
         call.respondText("new Hello World")
       }
    }
}
