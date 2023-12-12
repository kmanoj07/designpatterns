package org.condingconcepts.designpatterns.creationalpatterns.singleton;

public class Client {
    public static void main(String[] args) {
//        Database db = Database.getInstance();
//        db.setUrl("test");
//        db.setPassword("test");
//        db.setUsername("test");
//        System.out.println(Database.count);
//
//        Database db1 = Database.getInstance();
//        db1.setUrl("testing");
//        db1.setUsername("testing");
//        db1.setPassword("testing");
//        System.out.println(Database.count);

        DatabaseEager dbe = DatabaseEager.getInstance();
        System.out.println(DatabaseEager.count);

        DatabaseEager dbe2 = DatabaseEager.getInstance();
        System.out.println(DatabaseEager.count);

        System.out.println(dbe.hashCode());
        System.out.println(dbe2.hashCode());
    }
}
