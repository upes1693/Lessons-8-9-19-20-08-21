package com.company;

public class Array {
    public static void main(String[] args){
        int[] myNums=new int[5];

        myNums[1]=5;
        myNums[2]=8;
        myNums[3]=10;
        System.out.println(myNums[1]);
        String[] colors={"red","black","white"};

        int[] numbers=new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=i*100;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index "+i+" value is "+numbers[i]);
        }

        System.out.println(calcAvg(new int[]{1,2,3,4,5}));

        int[][] multiArr=new int[10][20];
        multiArr[2][0]=1;
    }

    public static double calcAvg(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }

        return sum/arr.length;
    }
}
