plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
  mavenCentral()
}

dependencies {
  compileOnly("com.gradle:gradle-enterprise-gradle-plugin:3.12.2")
}