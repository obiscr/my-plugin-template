package com.github.obiscr.myplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.obiscr.myplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
