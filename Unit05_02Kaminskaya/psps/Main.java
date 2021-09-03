package psps;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Common customers = new Common();

		customers.add(new Customer(1, "Snake", "Liquid", "Teriible", "London", 245896, 22357778));
		customers.add(new Customer(2, "Kagome", "Higurashi", "Inu", "Tokyo", 334596, 88645532));
		customers.add(new Customer(3, "Jane", "Shepard", "Zemelya", "New-York", 965442, 03545231));
		customers.add(new Customer(4, "Danley", "Banley", "Painly", "Pinsk", 132554, 45622187));
		customers.add(new Customer(5, "Sparatus", "Harkian", "Sophian", "Rome", 532554, 45622187));

		for (int i = 0; i < customers.size(); i++) {
			System.out.println(customers.getCustomer(i));
		}

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("1. Чтобы вывести список в алфавитном порядке (по имени) введите 1\n"
				+ "2. Чтобы вывести покупателей, у которых номер карты находится в заданном интервале, введите 2\n"
				+ "3. Чтобы провести обе операции, введите 3\n");
		System.out.println("Ввод: ");

		int value = sc.nextInt();
		if (value == 1) {
			Body.OperationNamefilter(customers);
		} else if (value == 2) {
			Body.OperationCardfilter(customers);
		} else if (value == 3) {
			Body.OperationNamefilter(customers);
			Body.OperationCardfilter(customers);
		}
	}

}
