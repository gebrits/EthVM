import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  application
  kotlin("jvm")
  id("org.jlleitschuh.gradle.ktlint")
}

val test by tasks.getting(Test::class) { useJUnitPlatform {} }

application {
  mainClassName = "io.enkrypt.kafka.streams.MainKt"
}

project.java.sourceSets["main"].java {
  srcDir("src/main/kotlin")
}

dependencies {
  // Kotlin
  implementation(kotlin("stdlib"))
  implementation(kotlin("reflect"))

  // Avro
  implementation(project(":common"))
  implementation(project(":avro"))

  // Ethereumj
  implementation(group = "org.ethereum", name = "ethereumj-core", version = "1.10.0@ethvm.2-SNAPSHOT")

  // Kafka
  implementation("org.apache.kafka:kafka-streams:2.0.1")
  implementation("io.confluent:kafka-streams-avro-serde:5.0.1")

  // Utils
  implementation("com.github.ajalt:clikt:1.5.0")
  implementation("ch.qos.logback:logback-classic:1.2.3")
  implementation("io.github.microutils:kotlin-logging:1.6.10")
  implementation("joda-time:joda-time:2.10")
  implementation("org.koin:koin-core:1.0.0")
  implementation("io.arrow-kt:arrow-core:0.8.1")

  // Testing
  testImplementation("io.mockk:mockk:1.8.12")
  testImplementation("org.koin:koin-test:1.0.0")
  testImplementation("io.kotlintest:kotlintest-runner-junit5:3.1.10")
  testImplementation("org.apache.curator:curator-test:4.0.0")
  testImplementation("org.apache.kafka:kafka_2.12:2.0.1")
  testImplementation("org.apache.kafka:kafka_2.12:2.0.1:test")
  testImplementation("org.apache.kafka:kafka-streams-test-utils:2.0.1")
  testImplementation("org.apache.kafka:kafka-clients:2.0.1")
  testImplementation("org.apache.kafka:kafka-clients:2.0.1:test")
  testImplementation("io.confluent:kafka-schema-registry:5.0.1")
  testImplementation("io.confluent:kafka-schema-registry:5.0.1:tests")
}
