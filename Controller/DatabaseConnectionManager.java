package Controller;

public class DatabaseConnectionManager {
  private String password;
  private static DatabaseConnectionManager dbInstance;
  private String url;
  private String username;

  private DatabaseConnectionManager(String password, String url, String username) {
    this.password = password;
    this.url = url;
    this.username = username;
  }

  public static DatabaseConnectionManager dbConnection(String password, String url, String username) {
    if (dbInstance == null) {
      if (password == "123456" && url == "db.com:3031" && username == "admin") {
        dbInstance = new DatabaseConnectionManager(password, url, username);
      } else {
        return null;
      }
    }

    return dbInstance;
  }

  public String getPassword() {
    return this.password;
  }

  public String getUrl() {
    return this.url;
  }

  public String getUsername() {
    return this.username;
  }
}
