package psps;

import java.util.List;
import java.util.Scanner;

public class Body {
	public static List<Train> TrainNumberfiltered(List<Train> chuhchuh) {

		for (int i = 0; i < chuhchuh.size(); i++) {
			int minNumber = chuhchuh.get(i).getTrainNumber();
			int minIndex = i;

			for (int j = i + 1; j < chuhchuh.size(); j++) {
				int currentNumber = chuhchuh.get(j).getTrainNumber();
				if (minNumber > currentNumber) {
					minNumber = currentNumber;
					minIndex = j;
				}
			}
			Train temp = chuhchuh.get(minIndex);
			chuhchuh.set(minIndex, chuhchuh.get(i));
			chuhchuh.set(i, temp);
		}
		for (int i = 0; i < chuhchuh.size(); i++) {
			System.out.println(chuhchuh.get(i));
		}
		return chuhchuh;
	}

	public static List<Train> WhereToFilter(List<Train> chuhchuh) {

		for (int i = 0; i < chuhchuh.size(); i++) {
			String minWhereToGo = chuhchuh.get(i).getWhereToGo();
			int minIndex1 = i;

			for (int j = i + 1; j < chuhchuh.size(); j++) {
				String currentWhereToGo = chuhchuh.get(j).getWhereToGo();
				if (minWhereToGo.compareTo(currentWhereToGo) > 0) {
					minWhereToGo = currentWhereToGo;
					minIndex1 = j;

				} else if (minWhereToGo.compareTo(currentWhereToGo) > 0) {
					int minWhenGoes = chuhchuh.get(minIndex1).getWhenGoes();
					int currentWhenGoes = chuhchuh.get(j).getWhenGoes();
					if (minWhenGoes > currentWhenGoes) {
						Train temp = chuhchuh.get(minIndex1);
						chuhchuh.set(minIndex1, chuhchuh.get(i));
						chuhchuh.set(i, temp);
					}
				}
			}
			Train temp = chuhchuh.get(minIndex1);
			chuhchuh.set(minIndex1, chuhchuh.get(i));
			chuhchuh.set(i, temp);

		}
		for (int i = 0; i < chuhchuh.size(); i++) {
			System.out.println(chuhchuh.get(i));
		}
		return chuhchuh;
	}

	public static void about(List<Train> chuhchuh) {

		for (int i = 0; i < chuhchuh.size(); i++) {
			System.out.println(chuhchuh.get(i));
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер нужного поезда: ");

		int value = sc.nextInt();

		for (int i = 0; i < chuhchuh.size(); i++) {
			if (value == chuhchuh.get(i).getTrainNumber()) {
				System.out.println(chuhchuh.get(i));
			}
		}
	}
}