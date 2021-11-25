public class NewguguInput {

	public static int[] input(String args) {
		
		String[] array = args.split(",");
		int[] num = new int[array.length];
		
		for (int i=0; i<array.length; i++) {
			num[i] = Integer.parseInt(array[i]);
		}

		return num;

	}
	
	public static void print(int[] result) {
		
		System.out.println(result[0]+"단");
		
		for (int i=1; i<result[1]+1; i++) {
			System.out.println(result[0]+" * "+i+" = "+result[0]*i);
		}
	}
}
