package com.company;

public enum Days {
    MONDAY("Дуйшомбу куну жава окуйм"),
    TUESDAY("Шейшемби куну англис тил сабагын окуйм"),
    WEDNESDAY("Шаршемби куну жава сабагын окуйм"),
    THURSDAY("Бейшемби куну Софт скилс сабагын окуйм"),
    FRIDAY("Жума куну жава сабагын окуйм"),
    SATURDAY("Ишемби куну сабак окубайм"),
    SUNDAY("Жекшемби куну сабак окубайм");

    private String a;

    Days(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }
    public void setA(String a) {
        this.a = a;
    }


    @Override
    public String toString() {
        return a;
    }
}
