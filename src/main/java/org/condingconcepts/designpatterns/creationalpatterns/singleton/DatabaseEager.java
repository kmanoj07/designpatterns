package org.condingconcepts.designpatterns.creationalpatterns.singleton;

public class DatabaseEager {
    private static  DatabaseEager instance = new DatabaseEager();
    public static int count = 0;
    private String url;
    private String username;
    private String password;

    private DatabaseEager(){ count++;}
    public static DatabaseEager getInstance(){
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
