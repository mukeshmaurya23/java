/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
  static int kthLargest (int arr[], int k)
  {
    return arr[arr.length - k];
  }
  static void sortArray(int arr[]){
      
      int smallest,temp=0;
      for(int i=0;i<arr.length-1;i++){
          smallest=i;
          for(int j=i+1;j<arr.length;j++){
              if(arr[smallest]<arr[j]){
                  smallest=j;
              }
          }
          temp=arr[i];
          arr[i]=arr[smallest];
          arr[smallest]=temp;
      }
      for(int x:arr){
          System.out.print(x+" ");
      }
      
  }
  

  public static void main (String[]args)
  {
    int arr[] = { 1, 5, 4, 3, 6 };
    sortArray(arr);
    int k = 2;

    System.out.println (kthLargest (arr, k));
  }
}
