package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TodoList {
  private final ArrayList<String> allTodoLists = new ArrayList<String>(10);
  private int size = 0;

  public List<String> getAllTodoLists() {
    return allTodoLists.stream()
        .filter(Objects::nonNull)
        .toList();
  }

  public void appendTodoList(String todo) {
    if (size < allTodoLists.size()) {
      allTodoLists.set(size, todo);
    } else {
      allTodoLists.add(todo);
    }
    size++;
  }

  public void deleteTodoListByIndex(int index) {
    if (index < 0 || index >= size) {
      System.out.println("Invalid index!");
      return;
    }

    // SHIFT KE KIRI
    for (int i = index; i < size - 1; i++) {
      allTodoLists.set(i, allTodoLists.get(i + 1));
    }

    // KOSONGKAN SLOT TERAKHIR
    allTodoLists.set(size - 1, null);

    // KURANGI SIZE
    size--;
  }
}
