plugins {
    java
}

group = "wuz.gua"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.antlr", "antlr4-runtime", "4.0")
    implementation("org.scala-lang", "jline", "2.10.7")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

