import java.util.Scanner;

/***
 * 
 * @author Leo Li
 *
 */
public class BirthdayCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.next();

		System.out.print("Enter the day you were born: ");
		int birthDay = input.nextInt();

		System.out.print("Enter the month you were born: ");
		int birthMonth =input.nextInt();

		System.out.print("Please enter the year you were born: ");
		int birthYear = input.nextInt();

		System.out.print("Enter your name: ");
		String name2 = input.next();

		System.out.print("Enter the day you were born: ");
		int birthDay2 = input.nextInt();

		System.out.print("Enter the month you were born: ");
		int birthMonth2 = input.nextInt();

		System.out.print("Please enter the year you were born: ");
		int birthYear2 = input.nextInt();
		if (birthYear < birthYear2) {
			System.out.println(name + " is older than " + name2);

		} else if (birthYear == birthYear2) {
			if (birthMonth < birthMonth2) {
				System.out.println(name + " is older than " + name2);
			} else if (birthMonth == birthMonth2) {
				if (birthDay < birthDay2) {
					System.out.println(name + " is older than " + name2);
				}

				else if (birthDay == birthDay2) {
					System.out.println(name + " is the same age as " + name2);
				} else {
					System.out.println(name2 + " is older than " + name);
				}
			} else {
				System.out.println(name2 + " is older than " + name);
			}

		} else {
			System.out.println(name2 + " is older than " + name);
		}

	}

}
