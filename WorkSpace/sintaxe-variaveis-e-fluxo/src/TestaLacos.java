
public class TestaLacos {
	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println("Começando tabuada do " + multiplicador);			
			for (int cont = 0; cont <= 10; cont++) {
				System.out.print(multiplicador * cont);
				System.out.print(" ");				
			}
			System.out.println();
		}
	}

}
