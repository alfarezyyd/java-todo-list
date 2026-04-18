package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TodoList {
  private final ArrayList<String> allTodoLists = new ArrayList<String>(10);

  public List<String> getAllTodoLists() {
    return Collections.unmodifiableList(allTodoLists);
  }

  public void appendTodoList(String todoList) {
    allTodoLists.add(todoList);
  }

  public void deleteTodoListByIndex(int todoList) {
    allTodoLists.remove(todoList);
  }
}
