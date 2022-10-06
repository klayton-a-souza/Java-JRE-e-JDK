
public class TestaSomatoria {

	public static void main(String[] args) {
		int cont = 0;
		int total = 0;
		while (cont <= 100000) {
			total += cont;
			cont++;
		}
		System.out.println("Somatoria: " + total);
	}

}
