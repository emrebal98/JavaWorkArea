
public class Combat extends OnlineGame {

	// region Constructor
	public Combat(String GameName, int MaxNumberOfPlayers) {
		setGameName(GameName);
		setMaxNumberOfSimultaneousPlayers(MaxNumberOfPlayers);
	}
	// endregion

	// region Methods
	/**
	 * 
	 * @param Age  Age of the player
	 * @param Type Join=true,Leave=false
	 */
	protected void join_leave(int Age, boolean Type) {

		if (Age >= 10 && Type) {//Join stuff
			join_leave(Type);
			if (getErrorMessage().isEmpty())
				System.out.println("Player joined the game. Age: " + Age);
			else {
				System.out.println("Player can't join the game because of Error: " + getErrorMessage());
				setErrorMessage();// to clear error message
			}
		} else if (!Type) {//Leave stuff
			join_leave(Type);
			if (getErrorMessage().isEmpty())
				System.out.println("Player left the game.");
			else {
				System.out.println("Player can't join the game because of Error: " + getErrorMessage());
				setErrorMessage();// to clear error message
			}
		}
		else
			System.out.println("Player can't join the game because of Reason: Under age of 10 is not allowed to join the game.");
	}
	// endregion
}
