public class Additionof1DArray {
    public static void main(String[] args) {
        
        int arr1[]={1,2,3,7};
        int arr2[]={4,5,6,8};
        int[]sumArr=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
          sumArr[i]=arr1[i]+arr2[i];  
        }
        System.out.print("SumArr: " );
        for(int num:sumArr){
            System.out.print(num + " ");
        }
    }

    
}
