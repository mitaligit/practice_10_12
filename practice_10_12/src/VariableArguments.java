
public class VariableArguments {
	public static int sum( int... a) {
		System.out.println( a.length);
		//no need for null check on a 
		int s1um =0;
		for( int n : a) {
			s1um += n;
		}
		return s1um;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(1);
		sum(1,2);
		
	}
}
