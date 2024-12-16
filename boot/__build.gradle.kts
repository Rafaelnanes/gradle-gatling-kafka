plugins {
    java
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.spring.dependency.management)
//    id("org.graalvm.buildtools.native") version "0.10.3"
    kotlin("jvm") version "1.9.20"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    ext{
//        someVersion = "anyVersion";
    }
//    implementation("someDepencency:${someV}")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.kafka:spring-kafka")
    implementation(libs.jackson.databind)
    annotationProcessor("org.projectlombok:lombok")
    compileOnly("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.kafka:spring-kafka-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

project.ext {
//    val configProperties = new Properties();
    var myVal = "a"
}

tasks.register("hello") {
    doLast {
        println("Hello!")
    }
}

tasks.register("greet") {
    ext{
        myOtherValue =  "anyValue"
    }
    val env = System.getenv("ENV") ?: "default"
    doLast {
        println("How are you?")
        println("My env: $env" )
        println("My myVal: " + rootProject.ext.myVal )
        println("My myOtherValue: " + rootProject.ext.myVal )
    }
    dependsOn("hello")
}

tasks.clean {
    dependsOn("greet")
}
