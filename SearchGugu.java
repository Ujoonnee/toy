import javax.swing.JOptionPane;

public class SearchGugu {

  public static void main(String[] args){
  
    int x = Integer.parseInt(JOptionPane.showInputDialog("Table number?"));
    int y = 1;

      System.out.println(x+"단");
      while(y < 10){
        System.out.println(x+" * "+y+" = "+x*y);
        y++;
      }
  }
}
