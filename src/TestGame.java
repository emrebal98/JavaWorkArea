import java.util.Random;

public class TestGame {

	public static void main(String[] args) {

		System.out.println("### Scenario 1 ###");
		System.out.println();

		// region Scenario 1
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
		// endregion

		System.out.println("### Scenario 2 ###");
		System.out.println();

		// region Scenario 2
		TeamSports teamSports = new TeamSports("NBA", 5);

		for (int i = 0; i < 11; i++) {

			if (i < 6)
				teamSports.join_leave(true, true);
			else if (i < 9)
				teamSports.join_leave(false, true);
			else
				teamSports.join_leave(true, false);

			System.out.println("Online: " + teamSports.getNumberOfOnlinePlayers() + "\nTeam A: " + teamSports.getTeamA()
					+ "\nTeam B: " + teamSports.getTeamB());
			System.out.println();

		}
		// endregion

	}

}
