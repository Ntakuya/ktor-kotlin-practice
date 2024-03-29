package app

import app.handlers.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.routing.*
import io.ktor.server.plugins.contentnegotiation.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
install(ContentNegotiation)
   routing {
       get("/") {
           call.respondText("Hello World")
       }
   }
   handlers()
}
