public class Multiplication1DofArary {
    public static void main(String[] args) {
        
        int[]arr1={1,3,5};
        int[]arr2={2,6,8};
        int[]SumArr=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            SumArr[i]=arr1[i]*arr2[i];
        }
        System.out.print("SumArr: ");
          for(int num: SumArr){
               System.out.print(num + " ");
          }
    }
    
}
