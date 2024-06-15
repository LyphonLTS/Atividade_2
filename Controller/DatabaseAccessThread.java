package Controller;

public class DatabaseAccessThread {
  public DatabaseAccessThread() {

  }

  public DatabaseConnectionManager getDbConnection(String password, String url, String username) {
    return DatabaseConnectionManager.dbConnection(password, url, username);
  }
}
