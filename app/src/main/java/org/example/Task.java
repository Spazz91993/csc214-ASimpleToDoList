package org.example;

public class Task extends TodoList {
    String description;
    boolean isComplete;

    Task(String description) {
        this.description = description;
        this.isComplete = false;
    }
}
