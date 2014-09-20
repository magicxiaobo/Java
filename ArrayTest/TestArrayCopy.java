public class TestArrayCopy {
		public static void main(String[] args) {
			String[] s = {"Microsoft", "IBM", "Sun", "Oracle", "Apple"};
			String[] scopy = new String[6];
			
			System.arraycopy(s, 0, scopy, 0, s.length);
			
			for(int i = 0; i < scopy.length; i++) {
				System.out.print(scopy[i] + " ");
			}
		}
}