package com.example.courselist.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courselist.data.model.Course
import com.example.courselist.data.model.sampleCourses
import com.example.courselist.ui.components.CourseCard
import com.example.courselist.ui.theme.CourseListTheme

@Composable
fun CourseListScreen(
    courses: List<Course>,
    modifier: Modifier = Modifier
) {
    if (courses.isEmpty()) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "No courses available",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    } else {
        LazyColumn(
            modifier = modifier.padding(horizontal = 16.dp),
            contentPadding = PaddingValues(vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(
                items = courses,
                key = { it.id }
            ) { course ->
                CourseCard(course = course)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CourseListScreenPreviewLight() {
    CourseListTheme(darkTheme = false) {
        CourseListScreen(courses = sampleCourses)
    }
}

@Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun CourseListScreenPreviewDark() {
    CourseListTheme(darkTheme = true) {
        CourseListScreen(courses = sampleCourses)
    }
}
