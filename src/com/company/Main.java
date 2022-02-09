package com.company;

import java.lang.reflect.Array;
import java.util.*;

/** ДЗ №9
 * Используя Users.class из ДЗ 6(enums, занятие №7),
 * создать ArrayList из 10 объектов Users,
 * вывести на печать hashcode этих объектов
 * создать TreeSet объектов User из ранее созданного Arraylist
 * отсортировать их по priority и login в порядке возрастания.
 * (Вначале будут элементы с наименьшим priority, отсортированные по алфавиту)
 */

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", "0000", UserTypes.ADMIN);
        User user2 = new User("Pashka", "1111", UserTypes.PREMIUM);
        User user3 = new User("Dashka", "2222", UserTypes.GUEST);
        User user4 = new User("Mashka", "3333", UserTypes.ADMIN);
        User user5 = new User("Sashka", "4444", UserTypes.GUEST);
        User user6 = new User("Nik", "5555", UserTypes.PREMIUM);
        User user7 = new User("Alla", "6666", UserTypes.AUTHORIZED);
        User user8 = new User("Zora", "7777", UserTypes.GUEST);
        User user9 = new User("Kim", "8888", UserTypes.PREMIUM);
        User user10 = new User("Natan", "9999", UserTypes.AUTHORIZED);


        ArrayList<String> allUsers = new ArrayList<>();
        allUsers.add(String.valueOf(user1));
        allUsers.add(String.valueOf(user2));
        allUsers.add(String.valueOf(user3));
        allUsers.add(String.valueOf(user4));
        allUsers.add(String.valueOf(user5));
        allUsers.add(String.valueOf(user6));
        allUsers.add(String.valueOf(user7));
        allUsers.add(String.valueOf(user8));
        allUsers.add(String.valueOf(user9));
        allUsers.add(String.valueOf(user10));
        System.out.println("ArrayList" + allUsers);


//        System.out.println("HashCodes:");
//        for (int i = 1; i<allUsers.size()-1;i++) {
//            System.out.println(allUsers.get(i).hashCode());
//        }

//        Collections.sort(allUsers);
//        System.out.println("sorrrt" + allUsers);
//
//        System.out.println("Sort:");
//        for (int i = 1; i<allUsers.size()-1;i++) {
//            System.out.println(allUsers.get(i).hashCode());
//        }

        TreeSet<User> set1 = new TreeSet<>( allUsers);
        System.out.println("TreeSet" + set1);
        //set1.stream().sorted("type"?)



	// write your code here
    }
}
