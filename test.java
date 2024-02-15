import java.util.Scanner;

   class test{

    public static void main(String[] args){
    
       Scanner s=new Scanner(System.in);
        int num=s.nextInt();
   

       for( int i=1;i<=num;i++){
        for(int j=num-i;j>0;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
       }

       for(int l=1;l<=num-1;l++){
       
        for(int r=1;r<=l;r++){
            System.out.print(" ");
        }
        for(int m=num-l;m>0;m--){
            System.out.print("* ");
        }
        System.out.println();
       }
       s.close();
   }
}
