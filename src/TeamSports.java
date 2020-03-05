
public class TeamSports extends OnlineGame {

	// region Private Fields
	private int teamA;
	private int teamB;
	// endregion

	// region Constructor
	public TeamSports(String GameName, int TeamSize) {
		setGameName(GameName);
		setMaxNumberOfSimultaneousPlayers(TeamSize * 2);
	}
	// endregion

	// region Getter Setters
	public int getTeamA() {
		return teamA;
	}

	public int getTeamB() {
		return teamB;
	}
	// endregion

	// region Methods
	/**
	 * 
	 * @param Team Team A=true, Team B=false
	 * @param Type Join=true, Leave=false
	 */
	protected void join_leave(boolean Team, boolean Type) {
		
		if (Type) {//Join stuff
			
			if (Team && teamA < getMaxNumberOfSimultaneousPlayers() / 2) {//Team A Join stuff
				 join_leave(Type);
				if (!getErrorMessage().isEmpty())
					return;
				teamA++;
				System.out.println("Player joined the game for Team A");
			} else if (!Team && teamB < getMaxNumberOfSimultaneousPlayers() / 2) {//Team B Join stuff
				 join_leave(Type);
				if (!getErrorMessage().isEmpty())
					return;
				teamB++;
				System.out.println("Player joined the game for Team B");
			} else {
				String endText = Team ? "Team A" : "Team B";
				System.out.println("Player can't join the game because maximum number of player has reached for " + endText);
			}
		} else {//Leave stuff

			if (Team && teamA > 0) {//Team A Leave stuff
				 join_leave(Type);
				if (!getErrorMessage().isEmpty())
					return;
				teamA--;
				System.out.println("Player left the game from Team A");
			} else if (!Team && teamB > 0) {//Team B Leave stuff
				 join_leave(Type);
				if (!getErrorMessage().isEmpty())
					return;
				teamB--;
				System.out.println("Player left the game from Team B");
			} else {
				String endText = Team ? "Team A" : "Team B";
				System.out.println("Number of " + endText + " players should be greater than zero");
			}
		}
	}
	// endregion
}
