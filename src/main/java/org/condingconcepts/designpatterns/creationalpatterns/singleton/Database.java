package org.condingconcepts.designpatterns.creationalpatterns.singleton;

public class Database {
    private static Database instance;
    public static int count = 0;
    private String url;
    private String username;
    private String password;

    private Database(){ count++;}
    public static Database getInstance(){
        if(instance == null) {
            synchronized (Database.class) { // acquire lock
                if(instance == null) { // Double locking check
                    instance = new Database(); // create instance
                }
            }
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
