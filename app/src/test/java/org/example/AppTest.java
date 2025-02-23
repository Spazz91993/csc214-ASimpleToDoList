package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
private TodoList todoList;

    @BeforeEach
    public void setUp() {
        todoList = new TodoList();
    }

    @Test
    public void testAddValidTask() {
        todoList.add("Finish homework");
        assertEquals(1, todoList.getTasks().size());
        assertTrue(todoList.getTasks().get(0).description.equals("Finish homework"));
    }

    @Test
    public void testAddEmptyTask() {
        todoList.add("");
        assertEquals(0, todoList.getTasks().size());
    }

    @Test
    public void testCompleteValidTask() {
        todoList.add("Finish homework");
        todoList.complete(0);
        assertTrue(todoList.getTasks().get(0).isComplete);
    }

    @Test
    public void testCompleteInvalidTaskIndex() {
        todoList.add("Finish homework");
        todoList.complete(1);
        assertFalse(todoList.getTasks().get(0).isComplete);
    }

    @Test
    public void testAllTasks() {
        todoList.add("Finish homework");
        todoList.add("Clean the house");
        assertEquals(2, todoList.getTasks().size());
    }

    @Test
    public void testAllTasksEmptyList() {
        assertEquals(0, todoList.getTasks().size());
    }

    @Test
    public void testCompleteTasks() {
        todoList.add("Finish homework");
        todoList.add("Clean the house");
        todoList.complete(0);
        assertEquals(1, todoList.getCompletedTasks().size());
    }

    @Test
    public void testCompleteTasksNoCompleted() {
        todoList.add("Finish homework");
        assertEquals(0, todoList.getCompletedTasks().size());
    }

    @Test
    public void testIncompleteTasks() {
        todoList.add("Finish homework");
        todoList.add("Clean the house");
        todoList.complete(0);
        assertEquals(1, todoList.getIncompleteTasks().size());
    }

    @Test
    public void testIncompleteTasksAllCompleted() {
        todoList.add("Finish homework");
        todoList.complete(0);
        assertEquals(0, todoList.getIncompleteTasks().size());
    }

    @Test
    public void testClearTasks() {
        todoList.add("Finish homework");
        todoList.add("Clean the house");
        todoList.clear();
        assertEquals(0, todoList.getTasks().size());
      }

    @Test
    public void testClearEmptyList() {
        todoList.clear();
        assertEquals(0, todoList.getTasks().size());
    }
  }
