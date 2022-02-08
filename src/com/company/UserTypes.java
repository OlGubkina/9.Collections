package com.company;

public enum UserTypes {
    ADMIN(0),
    PREMIUM(1),
    AUTHORIZED(2),
    GUEST(3);

    private int priority;

    UserTypes(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}