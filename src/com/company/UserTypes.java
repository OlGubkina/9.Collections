package com.company;

public enum UserTypes implements Comparable{
    ADMIN(0),
    PREMIUM(1),
    AUTHORIZED(2),
    GUEST(3);

    private int priority;
    private Object obj;

    UserTypes(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int compareTo(Object obj) {
        this.obj = obj;
        if (obj == null) return false;
        UserTypes that = (UserTypes) obj;
        if (this.priority > that.priority) return 1; // Входящий объект больше чем текущий
        else return -1;
    }
}