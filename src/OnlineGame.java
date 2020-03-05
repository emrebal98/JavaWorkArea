
public class OnlineGame {

	// region Private Fields
	private String ErrorMessage = "";
	private String gameName;
	private int numberOfOnlinePlayers;
	private int maxNumberOfSimultaneousPlayers;
	// endregion

	// region Getter Setters
	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage() {
		//to just erase the previous error message;
		ErrorMessage = "";
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getNumberOfOnlinePlayers() {
		return numberOfOnlinePlayers;
	}

	public void setNumberOfOnlinePlayers(int numberOfOnlinePlayers) {
		this.numberOfOnlinePlayers = numberOfOnlinePlayers;
	}

	public int getMaxNumberOfSimultaneousPlayers() {
		return maxNumberOfSimultaneousPlayers;
	}

	public void setMaxNumberOfSimultaneousPlayers(int maxNumberOfSimultaneousPlayers) {
		this.maxNumberOfSimultaneousPlayers = maxNumberOfSimultaneousPlayers;
	}
	// endregion

	// region Methods
	/**
	 * 
	 * @param type Join=true,Leave=false
	 */
	protected void join_leave(boolean Type) {

		if (Type) {

			if (numberOfOnlinePlayers < maxNumberOfSimultaneousPlayers && numberOfOnlinePlayers >= 0) {
				numberOfOnlinePlayers++;
			} else if (numberOfOnlinePlayers < 0) {
				ErrorMessage = "Number of players should be greater than zero";
			} else {
				ErrorMessage = "Maximum number of player has reached.";
			}

		} else {

			if (numberOfOnlinePlayers > 0) {
				numberOfOnlinePlayers--;
			} else {
				ErrorMessage = "Number of players should be greater than zero";
			}

		}
	}
	// endregion
}
