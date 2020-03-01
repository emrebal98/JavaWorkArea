
public class OnlineGame {

	// region Private Fields
	private String gameName;
	private int numberOfOnlinePlayers;
	private int maxNumberOfSimultaneousPlayers;
	// endregion

	// region Getter Setters
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
	protected boolean join_leave(boolean type) {

		if (type) {

			if (numberOfOnlinePlayers < maxNumberOfSimultaneousPlayers && numberOfOnlinePlayers >= 0) {
				numberOfOnlinePlayers++;
				return true;
			} else if (numberOfOnlinePlayers < 0) {
				System.out.println("Number of players should be greater than zero");
				return false;
			} else {
				System.out.println("Maximum number of player has reached.");
				return false;
			}

		} else {

			if (numberOfOnlinePlayers > 0) {
				numberOfOnlinePlayers--;
				return true;
			} else {
				System.out.println("Number of players should be greater than zero");
				return false;
			}

		}		
	}
	// endregion
}
