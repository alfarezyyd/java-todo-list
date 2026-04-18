package service;

import entity.TodoList;
import helper.Scanner;


public class TodoListService {
  private final TodoList todoListEntity;

  public TodoListService(TodoList todoListEntity) {
    this.todoListEntity = todoListEntity;
  }

  public void showTodoList() {
    int indexCounter = 0;
    System.out.println(todoListEntity.getAllTodoLists().size() + " TodoList");
    for (var todoList : todoListEntity.getAllTodoLists()) {
      System.out.println(++indexCounter + ". " + todoList);
    }
  }

  public void showCreateTodoList(Scanner scannerInstance) {
    System.out.println("Create TodoList");
    String userInput = scannerInstance.readNextLine("Input TodoList: ");
    if (userInput.equalsIgnoreCase("x")) {
      return;
    } else {
      todoListEntity.appendTodoList(userInput);
    }
  }

  public void showRemoveTodoList(Scanner scannerInstance) {
    while (true) {
      System.out.println("Remove TodoList - Input x if you want to cancel");
      System.out.print("Input Number of TodoList: ");

      String userInput = scannerInstance.readNextLine("Input Number of TodoList:");

      // cancel
      if (userInput.equalsIgnoreCase("x")) {
        return;
      }

      try {
        int index = Integer.parseInt(userInput);

        // optional: validasi index > 0
        if (index <= 0) {
          System.out.println("Input must be greater than 0!");
          continue;
        }

        todoListEntity.deleteTodoListByIndex(index - 1);
        break;

      } catch (NumberFormatException e) {
        System.out.println("Invalid input! Please enter a valid number.");
      }
    }
  }

}
