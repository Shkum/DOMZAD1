package com.shkum1;

public class Main {

    public static void main(String[] args) {
        User a1 = new User();
        DB db = new DB();

        a1.ID = 123;
        a1.login = "Test";
        a1.pass = "test";
        a1.fio = "FIO";

        db.add(a1);
        db.add(a1);
        db.add(a1);
        db.add(a1);
        System.out.println(db.toString() );

    }
}
