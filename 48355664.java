import java.util.Scanner;
class Divide{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test-->0){
            long a,b,c;
            a = in.nextLong();
            b = in.nextLong();
            c = in.nextLong();
         if(c%2!=0){
             a*=2;
         }
          System.out.println(Math.max(a,b)/Math.min(a,b));
        }
    }
}