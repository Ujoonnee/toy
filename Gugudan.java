public class Gugudan {
  public static void main(String[] args){
  
    int x = 2;
    int y = 1;

    while(x<10){
      System.out.println(x+"단");
      while(y < 11){
        if (y < 10) {
        System.out.println(x+" * "+y+" = "+x*y);
        y++;
        } else {
            if(y == 10) {
            y = 1;
            System.out.println("");
            break;
            }
        }
        }
      x++;
    }
  }
}
