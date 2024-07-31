package com.example.taskmanagement;

public class TaskManagement {
    private Task[] tasks;
    private int size;

    // Constructor to initialize the task array
    public TaskManagement(int capacity) {
        tasks = new Task[capacity];
        size = 0;
    }

    // Method to add a task
    public void addTask(Task task) {
        if (size == tasks.length) {
            System.out.println("Task array is full. Cannot add more tasks.");
            return;
        }
        tasks[size++] = task;
    }

    // Method to search a task by taskId
    public Task searchTask(String taskId) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getTaskId().equals(taskId)) {
                return tasks[i];
            }
        }
        return null;
    }

    // Method to traverse all tasks
    public void traverseTasks() {
        for (int i = 0; i < size; i++) {
            System.out.println(tasks[i]);
        }
    }

    // Method to delete a task by taskId
    public void deleteTask(String taskId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (tasks[i].getTaskId().equals(taskId)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[--size] = null;
        } else {
            System.out.println("Task not found.");
        }
    }
}
