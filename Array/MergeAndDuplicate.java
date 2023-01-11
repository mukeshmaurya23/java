import java.util.Arrays;

public class Main
{
    static void mergeArray(int arr1[],int arr2[]){
        int arr3[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){//1 2 3 4 5 arr[0]=1 5 arr3[5]=5
            arr3[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            arr3[arr1.length+j]=arr2[j];
        }
       
        int j=0;
        for(int i=0;i<arr3.length-1;i++){
            if(arr3[i]!=arr3[i+1]){
                arr3[j++]=arr3[i];
            }
        }
        arr3[j++]=arr3[arr3.length-1];
         for(int i=0;i<j;i++){
            System.out.print(arr3[i]+" ");
        }
       
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
	    int arr1[]={5,2,3,1,4};
	    int arr2[]={10,9,7,6,5};
	    
	    Arrays.sort(arr1);
	   // Arrays.sort(arr2);
	    int temp;
	    for(int i=0;i<arr2.length;i++){
	        for(int j=0;j<arr2.length-1-i;j++){
	            if(arr2[j]>arr2[j+1]){
	                temp=arr2[j];
	                arr2[j]=arr2[j+1];
	                arr2[j+1]=temp;
	            }
	        }
	    }
	   // printArray(arr2);
	   mergeArray(arr1,arr2);
	   
	   
	}
}
