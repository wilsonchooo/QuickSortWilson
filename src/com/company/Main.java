package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {



        int []arr = randomIntarr(10);
        System.out.println(Arrays.toString(arr));

        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if (left<right)
        {
            int pivot = Partition(arr,left,right);

            quickSort(arr,left,pivot-1);
            quickSort(arr,pivot+1,right);
        }
    }

    public static int Partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left-1;

        for (int j = left; j <right;j++)
        {
            if (arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return i+1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static int[] randomIntarr(int count)
    {
        int[] cut =new int[count];
        for (int i=0;i<cut.length;i++)
        {
            cut[i]=(int)(Math.random()*10000);
        }
        return cut;

    }


}
