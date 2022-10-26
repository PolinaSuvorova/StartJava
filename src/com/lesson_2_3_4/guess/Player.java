package com.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numsAttempt = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getNum() {
        return numsAttempt[countAttempts - 1];
    }
    public int[] getNumsAttempt() {
        return Arrays.copyOf(numsAttempt, countAttempts);
    }
    public int getCountAttempts() {
        return countAttempts;
    }

    public void enterNum(int num) {
        numsAttempt[countAttempts] = num;
        countAttempts++;
    }
   public void destroyAttempts( ){
       Arrays.fill(numsAttempt, 0, countAttempts, 0);
       countAttempts = 0;
   }


}