package com.rajeshchinni;

public class SumOddRange {
    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));






    }

    public static boolean isOdd(int number){
        if ((number < 0) || (number == 0) || (number%2 == 0)){
            return false;
        }else
            return true;
    }




    public static int sumOdd(int start, int end){
        if(start > end || start <= 0){
            return -1;
        }else {
            int sum = 0;
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
            return sum;

        }

    }










}
