package conflicts;

public class Cnfts1 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i==5) {
				System.exit(0);
			}
			System.out.println(1);
			break;
		}
	}

}
