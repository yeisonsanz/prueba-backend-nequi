plugins {
    java
    id("org.springframework.boot") version "3.3.11"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.nequi"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // Spring Boot WebFlux
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter")

    // R2DBC y MySQL
    implementation ("io.r2dbc:r2dbc-mysql")
    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    implementation("dev.miku:r2dbc-mysql:0.8.2.RELEASE")

    // Lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
