package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
* Используя Users.class из ДЗ 6(enums, занятие №7),
* создать ArrayList из 10 объектов Users, вывести на печать hashcode этих объектов

 создать TreeSet объектов User из ранее созданного Arraylist и отсортировать их по priority и login в порядке возрастания.
 (Вначале будут элементы с наименьшим priority, отсортированные по алфавиту)

 */
 public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex123", "parol", UserTypes.ADMIN);
        User user2 = new User("Pashka999", "passs", UserTypes.PREMIUM);

        ArrayList<String> allUsers = new ArrayList<>();
        allUsers.add(String.valueOf(user1));
        allUsers.add(String.valueOf(user2));

        System.out.println(allUsers);






	// write your code here
    }
}
