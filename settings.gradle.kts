pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ZgoCompose"
include(":app")
//include ":catalog:integration-tests:material-catalog"
//include ":catalog:material:samples"
//include ":catalog:material:material-catalog"
//include ":catalog:material3:samples"
//include ":catalog:material3:material3-catalog"
//include ":catalog:annotation-sampled"
//include ':catalog:annotation-sampled'
 