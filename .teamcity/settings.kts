version = "2022.10"

project {
    buildType(SimpleBuild)
}

object SimpleBuild : BuildType({
    name = "Hello TeamCity"

    steps {
        script {
            name = "Say Hello"
            scriptContent = "echo 'Hello from TeamCity!'"
        }
    }
})
