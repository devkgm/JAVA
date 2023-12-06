package com.devkim.StudyArray;

public class Study3 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++){
            arr[i] = (int)(Math.random() * 100 + 1);
        }
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        for(int i =0 ; i < arr.length; i++){
            int minIndex = i;
            for(int j = i; j < arr.length-1; j++){
                if(arr[minIndex] > arr[j+1]){
                    minIndex = j+1;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
