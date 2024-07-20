import java.util.Scanner;;
public class LastOccurrenceX11 {
   static int output(int arr[],int x){
      int lastainx=-1;
      for(int i=0;i<arr.length;i++){
         if(arr[i]==x){
            lastainx=i;
         }
         
      }return lastainx;
      
   }

   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("entre the size of elenemt");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("entre the element of arr ");
      for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();  
      }
      System.out.println("entre the enement that we want to count");
      int x=sc.nextInt();

      System.out.println("last occurane :"+output(arr,x));

   }
}
