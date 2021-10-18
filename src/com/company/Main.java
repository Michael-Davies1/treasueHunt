package com.company;

import jdk.management.resource.internal.inst.RandomAccessFileRMHooks;

import java.util.Random;

public class Main {
    static String[][] board = new String[10][8];
    public static void main(String[] args) {

    }
    static int Treasure() {
        Random random = new Random();
        int coins = random.nextInt(100);
        return coins;
    }
    static void coordinates() {
    Random random = new Random();
        board[random.nextInt(10)][random.nextInt(8)] = "["+Treasure()+"]";

    }



    static void printBoard() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[  ]";
                System.out.print(board[i][j]);

            }
            System.out.println();
        }

        // write your code here
    }

