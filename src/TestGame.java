import java.util.Random;

public class TestGame {

	public static void main(String[] args) {
		
		//region Scenario 1
		Combat combat = new Combat("FortNite", 5);
		
		Random random = new Random();
		int age = 0;
		boolean joinOrLeave = true;
		
		for (int i = 0; i < 10; i++) {

			if (i < 3)
				age = random.nextInt(10) + 10;
			else if (i < 5)
				age = random.nextInt(10);
			else if (i < 8)
				age = random.nextInt(10) + 10;
			else
				joinOrLeave = false;

			combat.join_leave(age, joinOrLeave);
			System.out.println("Online: " + combat.getNumberOfOnlinePlayers());
			System.out.println();
			
		}
		//endregion
		
		//region Scenario 2
		
		//endregion

	}

}
