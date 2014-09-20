import java.util.*;

public class ArrayTest {
	public static void main(String[] args){
		int[] num = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			num[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
}