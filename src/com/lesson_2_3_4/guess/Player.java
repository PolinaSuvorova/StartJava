package com.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];
    private int countAttempts;
    private int scoreWin;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return nums[countAttempts - 1];
    }

    public void addNum(int num) throws RuntimeException {
        if (checkNum( num )) {
            nums[countAttempts] = num;
            countAttempts++;
            return;
        }
        throw new RuntimeException("Число не входит в полуинтервал (0, 100]");
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, countAttempts);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int getScoreWin() {
        return scoreWin;
    }

    public void clearAttempts() {
        Arrays.fill(nums, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public void clearScore() {
        scoreWin = 0;
    }
    private boolean checkNum( int num ){
        return  (num > 0 || num <= 100) ? true : false;
    }
}