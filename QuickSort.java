import java.util.*;
class QuickSort{
    static void swap(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    static int partition(int[] arr, int start,int end){
        int pivot=arr[end];
        int i=(start-1);
        for(int j=start; j<=end-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return (i+1);
    }

    static void quick_sort(int arr[],int start,int end){
        if(start<end){
            int pi=partition(arr, start, end);
            quick_sort(arr, start, pi-1);
            quick_sort(arr, pi+1, end);
        }
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] arr={5,7,3,6,1,9};
        int n=arr.length;
        quick_sort(arr, 0, n-1);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}