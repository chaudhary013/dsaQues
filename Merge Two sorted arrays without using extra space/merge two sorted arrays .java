public class Main
{
	public static void main(String[] args) {
      int[] arr1={1,3,,5,7};
      int[]={0,2,6,8,9};
      
      int n= arr1.length;
      int m= arr2.length;
      
      int i=0, j=0;
      
      while(i<n){
          
          if(arr1[i]>arr2[j]){
              int temp = arr1[i];
              arr1[i]= arr2[j];
              arr2[j] = temp;
              fixArray2(arr2);
          }
          i++;
      }
	}
	
	static void fixArray2(int[] arr2){
	    for(int i=1;i<arr2.length;i++){
	        int temp = arr2[i];
              arr2[i]= arr2[i-1];
              arr2[i-1] = temp;
	    }
	}
}