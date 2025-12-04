package _05_for_loops._2_badgers;

public class badgers {
	public static void main(String[] args) {
		int looped = 0;
		
		for (looped=1; looped <= 2; looped +=1){
			System.out.println();
			for (int i = 0; i < 12; i++) {
				System.out.print("Badger,");
			}
			for (int i = 0; i < 2; i++) {
				System.out.print("Mushroom,");	
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.println("A Snake!!!");
	}
}
