package by.home.maxzzzit;

public class RaznoobrazieCiklov {

	// Цикл FOR
	void mass_for() {
		int[] mass_1 = new int[10];

		// Нумеруем все элементы массива
		for (int i = 0, j = 1; i < mass_1.length; i++, j++) {
			System.out.print((mass_1[i] = j) + " ");
		}

		System.out.println("\n---------------------");

		// Выводим значения в прямом порядке
		for (int i = 0; i < mass_1.length; i++) {
			System.out.print(mass_1[i] + " ");
		}

		System.out.println("\n---------------------");

		// Выводим значения в обратном порядке
		for (int i = mass_1.length - 1; i >= 0; i--) {
			System.out.print(mass_1[i] + " ");
		}

		System.out.println("\n_____________________");

	}

	// Цикл FOR EACH
	void mass_foreach() {
		int[] mass_2 = new int[] { 34, 54, 65, 23, 75, 23, 96};
		for (int j : mass_2) {
			System.out.print(j + " ");
		}
		System.out.println("\n_____________________");
	}
	// Цикл WHILE
	void mass_while() {
		int z=0;
		int[] mass_3 = new int[10];
		while (z<mass_3.length) {
			z++;
			System.out.print(z+" ");
		}
	}
	
}
