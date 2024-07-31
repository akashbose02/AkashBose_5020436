package com.example.taskmanagement;

public class TaskManagementTest {
    public static void main(String[] args) {
        TaskManagement taskMgmt = new TaskManagement(5);

        Task task1 = new Task("S001", "Design Database", "In Progress");
        Task task2 = new Task("S002", "Implement API", "Not Started");
        Task task3 = new Task("S003", "Write Tests", "Completed");

        // Add tasks
        taskMgmt.addTask(task1);
        taskMgmt.addTask(task2);
        taskMgmt.addTask(task3);

        // Traverse tasks
        System.out.println("Traversing tasks:");
        taskMgmt.traverseTasks();

        // Search for a task
        System.out.println("\nSearching for task with ID 'S002':");
        System.out.println(taskMgmt.searchTask("S002"));

        // Delete a task
        System.out.println("\nDeleting task with ID 'S001':");
        taskMgmt.deleteTask("S001");

        // Traverse tasks again
        System.out.println("\nTraversing tasks after deletion:");
        taskMgmt.traverseTasks();
    }
}
