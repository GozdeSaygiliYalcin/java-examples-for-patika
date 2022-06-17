package dev.patika.java101;

import java.util.Scanner;

public class ChinesseZodiac {

	public static void main(String[] args) {
		// This is the Chinesse Zodiac finder
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your birth year and learn your Chinesse Horoscop!");
		int birthDate = scanner.nextInt();
		scanner.close();
		
		
		int horoscop=birthDate%12;
		switch(horoscop) {
		
		case 0:
			System.out.println("Monkey");
			break;
		case 1:
			System.out.println("Rooster");
			break;
		case 2:
			System.out.println("Dog");
			break;
		case 3:
			System.out.println("Pig");
			break;
		case 4:
			System.out.println("Mouse");
			break;
		case 5:
			System.out.println("Cow");
			break;
		case 6:
			System.out.println("Tiger");
			break;
		case 7:
			System.out.println("Rabbit");
			break;
		case 8:
			System.out.println("Dragon");
			break;
		case 9:
			System.out.println("Snake");
			break;
		case 10:
			System.out.println("Horse");
			break;
		case 11:
			System.out.println("Sheep");
			break;
			
			default:
				System.out.println("Error");
		
		}

	}

}
