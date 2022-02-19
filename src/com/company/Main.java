package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *   Используя User class, создать ArrayList из 10 объектов User
 *   вывести на печать hashcode этих объектов
 *   создать TreeSet объектов User из ранее созданного Arraylist
 *   и отсортировать их по priority и login в порядке возрастания.
 *   (Вначале будут элементы с наименьшим priority, отсортированные по алфавиту)
 */
 public class Main {
    public static void main(String[] args) {
        User user1 = new User( "Anna","123456", UserTypes.ADMIN);
        User user2 = new User( "Sasha","123456", UserTypes.AUTHORIZED);
        User user3 = new User( "Pasha","123456", UserTypes.GUEST);
        User user4 = new User( "Masha","123456", UserTypes.PREMIUM);
        User user5 = new User( "Misha","123456", UserTypes.ADMIN);
        User user6 = new User( "Tolik","123456", UserTypes.PREMIUM);
        User user7 = new User( "Bolik","123456", UserTypes.GUEST);
        User user8 = new User( "Timofey","123456", UserTypes.AUTHORIZED);
        User user9 = new User( "Artur","123456", UserTypes.AUTHORIZED);
        User user10 = new User( "Lena","123456", UserTypes.AUTHORIZED);

        ArrayList<User> MyUsers = new ArrayList<>();
        MyUsers.add(user1);
        MyUsers.add(user2);
        MyUsers.add(user3);
        MyUsers.add(user4);
        MyUsers.add(user5);

        MyUsers.get(6);




        }



    }
