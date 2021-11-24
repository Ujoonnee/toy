public class Gugudan {

	public static int[] calc(int num) {
		int[] result = new int[9];
		for (int i=0; i<result.length; i++) {
			result[i] = (i+1)*num;
		}
		return result;
	}
  public static void main(String[] args){

	  for (int i=1; i<10; i++) {
		  calc(i);
		  System.out.println(result);
	  	}
  }
}
