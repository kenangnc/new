package odev4;

public class Games {
	private int gameId;
	private String gameName;
	private String gameCategory;
	
	
	public Games(int gameId,String gameName,String gameCategory) {
		gameId =gameId;
		this.gameName=gameName;
		this.gameCategory=gameCategory;
		
	}
	
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameCategory() {
		return gameCategory;
	}
	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}

}
