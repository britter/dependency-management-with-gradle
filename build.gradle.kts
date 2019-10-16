plugins {
    id("com.gradle.build-scan") version "2.4.2"
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"

    publishAlways()
}
