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

    public int[] getNums() {
        return Arrays.copyOf(nums, countAttempts);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int getScoreWin() {
        return scoreWin;
    }

    public void addNum(int num) throws Exception {
        if (num > 0 && num <= 100) {
            nums[countAttempts] = num;
            countAttempts++;
            return;
        }
        throw new Exception("Число не входит в полуинтервал (0, 100]");
    }

    public void clearAttempts() {
        Arrays.fill(nums, 0, countAttempts, 0);
        countAttempts = 0;
        scoreWin = 0;
    }
}