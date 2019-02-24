package test;

public class Player {
//maybe not use this
	private String username;
	private int gameScore=0;
	private int roundScore=0;
	public Player (String username)
	{
		this.username=username;
		
	}

	public String getUsername() {
		return username;
	}


	public int getGameScore() {
		return gameScore;
	}

	public void setGameScore(int score) {
		this.gameScore = score;
	}
	
	public int getRoundScore() {
		return roundScore;
	}

	public void setRoundScore(int score) {
		this.roundScore = score;
	}
}
