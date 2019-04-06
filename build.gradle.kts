plugins {
    java
}

group = "wuz.gua"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("org.antlr", "antlr4-runtime", "4.0")
    compile("org.scala-lang", "jline", "2.10.7")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}