package helper;

public class Scanner {
  public java.util.Scanner scannerInstance = new java.util.Scanner(System.in);

  public String readNextLine(String messageInfo) {
    System.out.print(messageInfo + " : ");
    return scannerInstance.nextLine().trim();
  }
}
