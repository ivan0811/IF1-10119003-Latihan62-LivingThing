package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan Human menggunakan konsep abtract
 */

public class Tester {

    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Ivan Faathirza");
        System.out.print(human.getNama());
        human.walk();
        System.out.print(human.getNama());
        human.breath();
        System.out.print(human.getNama());
        human.eat();
    }
}
