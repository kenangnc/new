package odev4;

public class GamerService {
	
	private Logger[] loggers;
	
	public GamerService(Logger[] loggers) {
		this.loggers=loggers;
		
	}
	
	public void ekle(Gamer gamer) {
		System.out.println(gamer.getId()+" Id numaralý "+gamer.getAdi()+" oyuncusu sisteme eklendi");
		Utils.dogrulama(loggers, " " +gamer.getAdi()+ gamer.getSoyadi() );
		System.out.println("------------------------------------------------------");
	}
		
	public void sil(Gamer gamer) {
		System.out.println(gamer.getId()+"Id numaralý "+gamer.getAdi()+" oyuncusu sistemden silindi");
		System.out.println("------------------------------------------------------");
		
	}
	public void guncelle(Gamer gamer) {
		System.out.println(gamer.getId()+"Id numaralý "+gamer.getAdi()+" oyuncusu sistemde þu þekilde güncellendi ");
		System.out.println("------------------------------------------------------");

	}
}
