package com.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] nums = new int[10];
    private int countAttempts;

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

    public void addNum(int num) {
        nums[countAttempts] = num;
        countAttempts++;
    }

    public void destroyAttempts() {
        Arrays.fill(nums, 0, countAttempts, 0);
        countAttempts = 0;
    }
}