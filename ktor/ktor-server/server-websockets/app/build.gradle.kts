val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
  implementation("io.ktor:ktor-server-core:$ktor_version")
  implementation("io.ktor:ktor-server-netty:$ktor_version")
  implementation("ch.qos.logback:logback-classic:$logback_version")
  implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
  implementation("io.ktor:ktor-serialization-kotlinx-xml:$ktor_version")
  implementation("io.ktor:ktor-serialization-kotlinx-cbor:$ktor_version")
  implementation("io.ktor:ktor-server-websockets:$ktor_version")
}

application {
    mainClass.set("app.AppKt")
}