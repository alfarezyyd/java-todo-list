import entity.TodoList;
import helper.Scanner;
import service.TodoListService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public static void main() {
  TodoList todoListEntity = new TodoList();
  TodoListService todoListService = new TodoListService(todoListEntity);
  Scanner scannerHelper = new Scanner();

  while (true) {
    todoListService.showTodoList();
    System.out.println("MENU : ");
    System.out.println("1. Tambah");
    System.out.println("2. Hapus");
    System.out.println("x. Keluar");
    var userInput = scannerHelper.readNextLine("Pilih");
    if (userInput.equals("1")) {
      todoListService.showCreateTodoList(scannerHelper);
    } else if (userInput.equals("2")) {
      todoListService.showRemoveTodoList(scannerHelper);
    } else if (userInput.equalsIgnoreCase("x")) {
      break;
    } else {
      System.out.println("Pilihan tidak dimengerti");
    }
  }
}

