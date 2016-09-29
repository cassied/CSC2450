
public class HappyBirthday {

	public static void main(String[] args) {
		String name = "Cassie";
		String hb = "Happy Birthday to you!";
		int age = 25;
		
		System.out.println(hb);
		System.out.println(hb);
		System.out.println("Happy Birthday dear " + name + "!");
		System.out.println(hb);
		
		int count = 1;
        while (count <= age) {
            System.out.println("Are you " + count + "?");
            count++;
        }

	}

}
