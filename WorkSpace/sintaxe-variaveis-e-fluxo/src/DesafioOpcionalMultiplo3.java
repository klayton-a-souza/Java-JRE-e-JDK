
public class DesafioOpcionalMultiplo3 {
	public static void main(String[] args) {

		for (int cont = 0; cont <= 100; cont++) {
			if (cont % 3 == 0) {
				System.out.println(cont);
			}
		}

		for (int cont = 0; cont <= 100; cont += 3) {
			System.out.println(cont);
		}
	}
}
