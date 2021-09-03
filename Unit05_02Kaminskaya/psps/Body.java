package psps;

import java.util.Scanner;

public class Body {
	public static void OperationNamefilter(Common cstmr) {

		for (int i = 0; i < cstmr.size(); i++) {
			String minName = cstmr.getCustomer(i).getName();
			int minIndex = i;

			for (int j = i + 1; j < cstmr.size(); j++) {
				String currentName = cstmr.getCustomer(j).getName();
				if (minName.compareTo(currentName) > 0) {
					minName = currentName;
					minIndex = j;
				} else if (minName.compareTo(currentName) == 0) {
					String minSurname = cstmr.getCustomer(minIndex).getSurname();
					String currentSurname = cstmr.getCustomer(j).getSurname();
					System.out.println(minSurname + " - " + currentName);

					if (minSurname.compareTo(currentSurname) > 0) {
						Customer temp = cstmr.getCustomer(minIndex);
						cstmr.setCustomer(minIndex, cstmr.getCustomer(j));
						cstmr.setCustomer(j, temp);
					}
				}
			}

			Customer temp = cstmr.getCustomer(minIndex);
			cstmr.setCustomer(minIndex, cstmr.getCustomer(i));
			cstmr.setCustomer(i, temp);
		}
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < cstmr.size(); i++) {
			System.out.println(cstmr.getCustomer(i));
		}
		System.out.println("----------------------------------------------------");

	}

	public static void OperationCardfilter(Common cstmr) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите точку отсчета: ");
		int Min = sc.nextInt();
		System.out.println("Введите конечную точку: ");
		int Max = sc.nextInt();

		System.out.println("Производится отсчет от " + Min + " до " + " " + Max);
		System.out.println("----------------------------------------------------");
		for (int i = 0; i < cstmr.size(); i++) {
			if (cstmr.getCustomer(i).getCard() > Min && cstmr.getCustomer(i).getCard() < Max) {
				System.out.println(cstmr.getCustomer(i));
			}
		}
	}

}
