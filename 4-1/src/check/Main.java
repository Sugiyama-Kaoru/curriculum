package check;
import constants.Constants;
public class Main {
	
	public static void main(String[] args) {
		System.out.print("printNameメソッド → ");
		printName(firstName, lastName);
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		Pet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
	}
	
	private static String firstName = "杉山";
	private static String lastName = "薫";
	
	private static void printName(String firstName, String lastName) {
		System.out.println(firstName + lastName);
	}
}
