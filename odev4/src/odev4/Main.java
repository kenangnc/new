package odev4;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] gamers = {new VerifyGamerInfo()};
		GamerService gameService = new GamerService(gamers);
		Gamer kenan = new Gamer (1,"kenan","genç","11.22.2223");
		gameService.ekle(kenan);
	}

}
