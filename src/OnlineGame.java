
public class OnlineGame {
	
	//region Private Fields
	private String gameName;
	private int numberOfOnlinePlayers;
	private int maxNumberOfSimultaneousPlayers;
	//endregion
	
	//region Getter Setters
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
	//endregion
	
	//region Methods
	public void join_leave() {
		if(numberOfOnlinePlayers >= maxNumberOfSimultaneousPlayers && numberOfOnlinePlayers > 0) {
			
		}
		else if(numberOfOnlinePlayers <= 0) {
			System.out.println("Number of players should be greater than zero");
		}
		else {
			System.out.println("Maximum number of player has reached.");
		}
		//numberOfOnlinePlayers ++ --
	}
	//endregion
}
