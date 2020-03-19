import java.util.ArrayList;
import java.util.Arrays;

public class GameScores {

	// region Private fields
	private String gameName;
	private int numberOfPlayers;
	private String[] playerNames;
	private String[] playerScores;
	// endregion

	// region Constructors
	public GameScores() {
		this.gameName = null;
		this.numberOfPlayers = 0;
		this.playerNames = new String[0];
		this.playerScores = new String[0];
	}

	public GameScores(String GameName) {
		this.gameName = GameName;
		this.numberOfPlayers = 0;
		this.playerNames = new String[0];
		this.playerScores = new String[0];
	}
	// endregion

	// region Properties
	public String getGameName() {
		return gameName;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public String[] getPlayerNames() {
		return playerNames;
	}

	public String[] getPlayerScores() {
		return playerScores;
	}
	// endregion

	// region Methods
	public void AddPlayer(String Name, int Score) {
		// Adding player's name and scores to the array
		playerNames = add(playerNames, Name);
		// Converting 0 to 00 format
		String value = (Score < 10 ? "0" : "") + Score;
		playerScores = add(playerScores, value);
	}

	public void RemovePlayer(String Name) {
		// Finding index of removing value
		int index = Arrays.asList(playerNames).indexOf(Name);
		// Removing player's naem from the array
		playerNames = remove(playerNames, Name);
		// Getting removing player's best score from index
		// Then deleting player's best score from the array
		String value = playerScores[index];
		playerScores = remove(playerScores, value);
	}

	public void UpdatePlayer(String Name, int Score) {
		// Finding index of the player
		int index = Arrays.asList(playerNames).indexOf(Name);
		// Updating the highest score
		playerScores[index] = Integer.toString(Score);
	}

	public void FindPlayers(int Min, int Max) {
		// Header of the table
		System.out.println("\nScores between " + Min + " - " + Max + "\n");
		System.out.println("Names\t\tScores\t\n");
		// Loop for controlling players data
		for (int i = 0; i < playerNames.length; i++) {
			// Get player's highest score
			int score = Integer.parseInt(playerScores[i]);
			// Controlling highest score due to that formula
			// 0 <= Min <= score < Max <= 100
			if (score >= 0 && score >= Min && score < Max && score <= 100) {
				// Printing player's name and score
				System.out.println(playerNames[i] + "\t\t" + score);
			}
		}
		System.out.println();

	}
	// endregion

	// region Helpers
	/**
	 * To add an element to array
	 * 
	 * @param arr     Array
	 * @param element Element to be added
	 * @return Array
	 */
	private String[] add(String[] arr, String element) {
		final int N = arr.length;
		arr = Arrays.copyOf(arr, N + 1);
		arr[N] = element;
		return arr;
	}

	/**
	 * To remove an element from array
	 * 
	 * @param arr     Array
	 * @param element Element to be removed
	 * @return Array
	 */
	private String[] remove(String[] arr, String element) {
		ArrayList<String> temp = new ArrayList<>(Arrays.asList(arr));
		temp.remove(element);
		arr = temp.toArray(new String[temp.size()]);
		return arr;
	}
	// endregion

}
