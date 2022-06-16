package com.github.jarrodmitchell.theme1.services

import com.intellij.openapi.project.Project
import com.github.jarrodmitchell.theme1.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
