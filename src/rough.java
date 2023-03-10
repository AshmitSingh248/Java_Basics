import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class rough {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int temp=0;
        for(int i=0;i< arr1.length;i++){
            for(int j=i+1;j< arr1.length;j++){
                if(arr1[j]>arr1[i]){
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;

                }
            }
        }
        int res=1;
        for(int i=0;i< arr.length;i++){
                res+=arr[i]*arr1[i];

            }

        System.out.println(res);

    }
}

