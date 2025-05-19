package com.asadbyte.taskone

data class Task(
    val id: Int,
    val title: String,
    val priority: Priority = Priority.MEDIUM
)

enum class Priority {
    LOW, MEDIUM, HIGH
}

class TaskRepository {

    fun getTasks(): List<Task> {
        // Sample tasks data
        return listOf(
            Task(1, "Android", Priority.HIGH),
            Task(2, "Kotlin Basics", Priority.HIGH),
            Task(3, "Control Flow", Priority.MEDIUM),
            Task(4, "Kotlin Classes", Priority.MEDIUM),
            Task(5, "Kotlin Functions", Priority.HIGH),
            Task(6, "Extension Functions", Priority.LOW),
            Task(7, "App UI", Priority.HIGH),
            Task(8, "Activity Lifecycle", Priority.MEDIUM),
            Task(9, "Fragments", Priority.HIGH)
        )
    }

    fun getTasksByPriority(): Map<Priority, List<Task>> {
        return getTasks().groupBy { it.priority }
    }
}