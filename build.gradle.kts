plugins {
    // Поддержка запуска из командной строки
    application
}

repositories {
    // Подключаем автоматическая работа с репозиторием Maven Central
    mavenCentral()
}
tasks.test {
    useJUnitPlatform()
}
dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")
}