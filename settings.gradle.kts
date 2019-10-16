rootProject.name = "dependency-management-with-gradle"

include("app")
include("model")
include("persistence")
include("web")

for (project in rootProject.children) {
    val projectDirName = project.name
    project.projectDir = file("subprojects/$projectDirName")
    project.buildFileName = "${project.name}.gradle.kts"
    require(project.projectDir.isDirectory) {
        "Project directory ${project.projectDir} for project ${project.name} does not exist."
    }
    require(project.buildFile.isFile) {
        "Build file ${project.buildFile} for project ${project.name} does not exist."
    }
}
