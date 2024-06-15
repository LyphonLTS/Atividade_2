import Controller.DatabaseAccessThread;

class Main {
  public static void main(String[] args) {
    String password = "123456";
    String url = "db.com:3031";
    String username = "admin";

    DatabaseAccessThread thread1 = new DatabaseAccessThread();
    DatabaseAccessThread thread2 = new DatabaseAccessThread();

    System.out.println(thread1.getDbConnection("teste", "teste", "teste"));

    System.out.println(thread1.getDbConnection(password, url, username));
    System.out.println(thread2.getDbConnection(password, url, username));
  }
}