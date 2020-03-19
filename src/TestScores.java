import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestScores {

	public static void main(String[] args) {
		Random r = new Random();
		String[] names = { "Romy", "Emelie", "Allen", "Bryan", "Alfred", "Xavier", "Bob", "Jack", "Flora", "Zack" };
		GameScores gameScores = new GameScores();
		// Generating 10 players with randomly generated scores
		for (int i = 0; i < names.length; i++) {
			String Name = names[i];
			int Score = r.nextInt(100);
			gameScores.AddPlayer(Name, Score);
		}
		// Updating highest scores of 5 randomly selected players
		for (int i = 0; i < 5; i++) {
			int randomIndex = r.nextInt(10);
			int Score = r.nextInt(100);
			String Name = gameScores.getPlayerNames()[randomIndex];
			gameScores.UpdatePlayer(Name, Score);
		}
		// Print all players
		gameScores.FindPlayers(0, 100);
		// Getting player names and scores
		String[] Names = gameScores.getPlayerNames();
		String[] Scores = gameScores.getPlayerScores();
		// Creating a map to sort arrays by key and value
		Map<String, String> arr = new HashMap<String, String>(Names.length);
		for (int i = 0; i < Scores.length; i++) {
			arr.put(Scores[i], Names[i]);
		}
		// Sorting the arrays
		Arrays.sort(Scores);
		// Updating to new array
		for (int i = 0; i < Scores.length; i++) {
			Names[i] = arr.get(Scores[i]);
		}
		// Printing rate table
		System.out.println("Players are rated based on their scores as follows:");
		System.out.println("Names\t\tScores\t\tTag\n");
		for (int i = Scores.length - 1; i >= 0; i--) {
			String tag = "";
			if (Scores.length - 1 == i)
				tag = "Winner";
			else if (Scores.length - 2 == i)
				tag = "Runner-up";
			else if (Integer.parseInt(Scores[i]) >= 80)
				tag = "Pro-player";
			else if (Integer.parseInt(Scores[i]) <= 30)
				tag = "Novice";
			System.out.println(Names[i] + "\t\t" + Scores[i] + "\t\t" + tag);
		}
	}
}
