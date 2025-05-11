// app/src/main/java/com/example/courselist/data/model/Course.kt
package com.example.courselist.data.model

data class Course(
    val id: Int,
    val title: String,
    val code: String,
    val credits: Int,
    val description: String,
    val prerequisites: List<String> = emptyList()
)

val sampleCourses = listOf(
    Course(
        id = 1,
        title = "Android Development",
        code = "CS-101",
        credits = 4,
        description = "Build modern Android apps with Jetpack Compose",
        prerequisites = listOf("Intro to Programming", "Kotlin Basics")
    ),
    Course(
        id = 2,
        title = "Data Structures",
        code = "CS-201",
        credits = 3,
        description = "Master fundamental data structures and algorithms",
        prerequisites = listOf("CS-101")
    ),

    Course(
        id = 3,
        title = "Operating Systems",
        code = "CS-301",
        credits = 4,
        description = "Learn how modern operating systems manage processes, memory, and I/O.",
        prerequisites = listOf("CS-201", "Computer Architecture")
    )
)
