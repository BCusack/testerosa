package controller;

import java.util.Scanner;

import view.MainMenu;

public class programController {
	static MainMenu mainMenu = new MainMenu();

	public static void run() {
		String userChoice;
		// try with auto closure for Scanner
		try (Scanner user_input = new Scanner(System.in)) {
			System.out.println("Welcome to the Most Coolest Ticketing Program");
			while (true) {
				mainMenu.ShowMainMenu();
				if (user_input.hasNext()) {
					userChoice = user_input.next();
					switch (userChoice) {
					case "1": {
						System.out.println("1");
						break;
					}
					case "2": {
						System.out.println("2");
						break;
					}
					case "3": {
						System.out.println("Exiting");
						System.exit(0);
						break;
					}
					default: {
						PrintInvalidationMessage();
						break;
					}
					}
				}
			}

		}
	}

	/**
	 * Print invalidation message
	 */
	private static void PrintInvalidationMessage() {
		System.out.println("Please select a valid menu option.");
		safeSleep();
	}

	private static void safeSleep() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
