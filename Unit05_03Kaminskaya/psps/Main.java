package psps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        List<Train> chuhchuh = new ArrayList<Train>();
        
        chuhchuh.add(new Train("Jamaika", 445, 12));
        chuhchuh.add(new Train("Komarovo", 115, 9));
        chuhchuh.add(new Train("Prostokvashino", 923, 23));
        chuhchuh.add(new Train("Elisium", 544, 23));
        chuhchuh.add(new Train("Elisium", 852, 2));
        
        
        Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("1. Чтобы вывести информацию о конкретном поезде\n"
				+ "2. Отсортировать по пункту назначения(одинаковые по времени отправления)\n"
				+ "3. Отсортировать по номеру поезда\n");
		System.out.println("Ввод: ");

		int value = sc.nextInt();
		if (value == 1) {
			Body.about(chuhchuh);
		} else if (value == 2) {
			Body.WhereToFilter(chuhchuh);
		} else if (value == 3) {
			Body.TrainNumberfiltered(chuhchuh);
		} else {
			System.out.println("Повторите ввод.");
			sc.nextInt();
		}
	}
}