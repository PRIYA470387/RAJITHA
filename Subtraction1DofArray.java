public class Subtraction1DofArray {
    public static void main(String[] args) {

        int arr1[]={2,6,7};
        int arr2[]={3,5,2};
        int[]SumArr=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
           SumArr[i]=arr1[i]-arr2[i];
        }
          System.out.print("SumArr: ");
          for(int num: SumArr){
               System.out.print(num + " ");
          }
          
          }
    }

    

