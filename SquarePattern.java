import java.util.Scanner;

class SquarePattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        int n=sc.nextInt();
        for(int i=n; i>=1;i--){
            for(int j=1;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
              
            
        }

    }

}
