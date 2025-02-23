package org.example;

public class App {
  public static void main(String[] args) {
    TodoList myTodoList = new TodoList();

    myTodoList.add("Finish homework");
    myTodoList.add("Clean the house");
    myTodoList.add("Buy groceries");

    myTodoList.complete(1);

    myTodoList.all();

    myTodoList.getCompletedTasks();

    myTodoList.getIncompleteTasks();

    myTodoList.clear();
}
}
