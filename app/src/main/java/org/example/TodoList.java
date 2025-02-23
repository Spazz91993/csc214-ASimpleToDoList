package org.example;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(String taskDescription) {
        if (taskDescription == null || taskDescription.isEmpty()) {
            System.out.println("Error: Task description cannot be empty.");
            return;
        }
        tasks.add(new Task(taskDescription));
        System.out.println("Task added: " + taskDescription);
    }

    public void complete(int taskIndex) {
        if (taskIndex < 0 || taskIndex >= tasks.size()) {
            System.out.println("Error: Invalid task index.");
            return;
        }
        tasks.get(taskIndex).isComplete = true;
        System.out.println("Task marked as complete: " + tasks.get(taskIndex).description);
    }

    public void all() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("All tasks:");
        for (Task task : tasks) {
            System.out.println((task.isComplete ? "[Completed] " : "[Incomplete] ") + task.description);
        }
    }

    public List<Task> getCompletedTasks() {
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isComplete) {
                completedTasks.add(task);
            }
        }
        return completedTasks;
    }

    public List<Task> getIncompleteTasks() {
        List<Task> incompleteTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isComplete) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public void clear() {
        tasks.clear();
        System.out.println("All tasks cleared.");
    }
}