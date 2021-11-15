import java.util.Scanner;

public class SearchGugu {

  public static void main(String[] args){

    System.out.println("몇 단?");
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = 1;

      System.out.println(x+"단");
      while(y < 10){
        System.out.println(x+" * "+y+" = "+x*y);
        y++;
      }
  }
}
