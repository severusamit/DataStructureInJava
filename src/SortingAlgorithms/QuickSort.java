package SortingAlgorithms;

import java.util.Scanner;

public class QuickSort
{
    static void swap(int[] arr,int i, int j)  // Swapping is Done in this function
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int[] arr,int low ,int high)
    {
        int pivot =arr[high];
        int i=(low-1);
        for(int j=low;j<=high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }
    static void quickSort(int[] arr, int low,int high)
    {
        if(low<high)
        {
            int pi =partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static void printArr(int[] arr)      //  print function
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        int l;
        System.out.println("Lenth of array ?");
        l=in.nextInt();
        int[] arr1 = new int[l];
        System.out.println("Enter array elements ?");
        for(int i=0;i<l;i++)
        {
            arr1[i]=in.nextInt();
        }
        //int n= arr1.length;
        quickSort(arr1,0,l-1);
        System.out.print("Sorted Array :");
        printArr(arr1);
        
        //int[] arr2= new int arr2[];
    }
}
