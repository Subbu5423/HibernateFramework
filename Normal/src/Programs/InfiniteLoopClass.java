package Programs;

public class InfiniteLoopClass {

	public static void main(String[] args) {
		int n=1000;
		while(true) {
			System.out.println(n);
			n--;
			if(n<0) {
				break;
			}
		}

	}

}
