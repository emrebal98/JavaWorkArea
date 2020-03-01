
public class Combat extends OnlineGame {

	public Combat(String GameName, int MaxNumberOfPlayers) {
		setGameName(GameName);
		setMaxNumberOfSimultaneousPlayers(MaxNumberOfPlayers);
	}

	/**
	 * 
	 * @param Age  Age of the player
	 * @param Type Join=true,Leave=false
	 */
	protected void join_leave(int Age, boolean Type) {

		if (Age >= 10) {
			boolean Success = join_leave(Type);
			if (Type && Success)
				System.out.println("Player joined the game. Age: " + Age);
			else if(Success)
				System.out.println("Player left the game. Age: " + Age);
		} else
			System.out.println("Under age of 10 is not allowed to join the game.");

	}
}
