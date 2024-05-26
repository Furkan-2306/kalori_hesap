package kalori_hesaplama_uygulaması;
import java.util.Scanner;

public class usere {
	Scanner giris = new Scanner(System.in);

	String kullanıcıAdı;
	private String sifre ;
	private String ad;
	private String soyAd;
	private String cinsiyet;
	private int yas;
	private double kilo;
	private double boy;
	private int aktivite;
	private int butce;
	double toplamKalori;
	double tmh;
	double teh;
	
	public usere(String kullanıcıAdı, String sifre, String ad, String soyAd, String cinsiyet, int yas, int butce,double kilo, double boy, int aktivite, double teh, double tmh, double toplamKalori) {
		this.kullanıcıAdı=kullanıcıAdı;
		this.sifre=sifre;
		this.ad=ad;
		this.soyAd=soyAd;
		this.cinsiyet=cinsiyet;
		this.yas=yas;
		this.kilo=kilo;
		this.boy=boy;
		this.butce=butce;
		this.aktivite=aktivite;
		this.tmh=tmh;
		this.teh=teh;
		this.toplamKalori=toplamKalori;
	}
	
	public int getButce() {
		return butce;
	}

	public void setButce(int butce) {
		this.butce = butce;
	}
	
	public double getToplamKalori() {
		return toplamKalori;
	}


	public void setToplamKalori(double toplamKalori) {
		this.toplamKalori = toplamKalori;
	}

	public double getTmh() {
		return toplamKalori;
	}


	public void setTmh(double toplamKalori) {
		this.toplamKalori = toplamKalori;
	}


	public double getTeh() {
		return teh;
	}


	public void setTeh(double teh) {
		this.teh = teh;
	}


	public String getKullanıcıAdı() {
		return kullanıcıAdı;
	}

	public void setKullanıcıAdı(String kullanıcıAdı) {
		this.kullanıcıAdı = kullanıcıAdı;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd=soyAd;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet=cinsiyet;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas=yas;
	}

	public double getKilo() {
		return kilo;
	}

	public void setKilo(double kilo) {
		this.kilo=kilo;
	}

	public double getBoy() {
		return boy;
	}

	public void setBoy(double boy) {
		this.boy=boy;
	}

	public int getAktivite() {
		return aktivite;
	}

	public void setAktivite(int aktivite) {
		this.aktivite=aktivite;
	}	
	
}

	


