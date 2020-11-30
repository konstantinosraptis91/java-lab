plugins {
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.13")
    api("org.apache.commons:commons-math3:3.6.1")
    implementation("com.google.guava:guava:29.0-jre")
    implementation("jakarta.validation:jakarta.validation-api:3.0.0")
}
