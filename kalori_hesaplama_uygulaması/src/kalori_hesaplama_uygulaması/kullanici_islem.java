package kalori_hesaplama_uygulaması;
import java.util.Scanner;

public class kullanici_islem {
	Scanner giris = new Scanner(System.in);
	Scanner Stringgiris = new Scanner(System.in).useDelimiter("/n");
	usere user=new usere(null,null, null, null, null, 0,0, 0, 0, 0, 0, 0, 0);
	bmr_tee_hesap hesapla = new bmr_tee_hesap();
	kbilgi_sistemi bilgi = new kbilgi_sistemi();

	//kayıt olma ve giriş yapma
		public void kayit() {
			boolean dongu = true;
			while(dongu) {
				System.out.println("***** kalori hesaplama uygulamasına hoşgeldiniz *****");
		        System.out.println("1. Kayıt ol ");
		        System.out.println("2. Giriş yap ");
		        System.out.print("Lütfen giriş yapınız (hesabınız yoksa kayıt olunuz) = ");
		        int deger=giris.nextInt();
		        
	    	switch (deger) {
	    	
	    	//kayıt
	    	case 1:
	    		giris.nextLine();
	    		System.out.println();
	    		System.out.print("Lütfen kullanıcı adınızı belirleyiniz = ");
	    		String kA = giris.nextLine();
	    		user.setKullanıcıAdı(kA);
	    		System.out.println();
		        
		        System.out.print("Lütfen şifrenizi giriniz = ");
		        String s =giris.nextLine();
		        user.setSifre(s);
		        System.out.println();		        
		        break;
		        
		    //giriş
	    	case 2:
	    	    boolean dongu1 = true;
	    	    while(dongu1) {
	    	    	giris.nextLine();
	    	    	System.out.println();
	    	    	System.out.println(user.kullanıcıAdı +" adlı kullanıcı hoşgeldiniz..");
		    	    System.out.print("Şifrenizi giriniz");
			    	String sifreGiris = giris.nextLine();
			    	System.out.println();
		    	        if(user.getSifre().contentEquals(sifreGiris)){
		    	             System.out.println("Giriş başarılı");
		    	             System.out.println("Lütfen bilgi formunu doldurunuz...");
		    	             System.out.println();
		    	             dongu1 = false;
		    	        }
			    	    else{
			    	         System.out.println("Şifre yanlış");
			    	    }
		    	      }
	    	    System.out.print("Adınızı Girinizi: ");
	    	    String ad = Stringgiris.nextLine();
	    	    user.setAd(ad);
	    	    System.out.println();
	    	    
	    	    System.out.print("yaşınız Girinizi : ");
	    	    String soyAd = Stringgiris.nextLine();
	    	    user.setSoyAd(soyAd);
	    	    System.out.println();
	    	    
	    	    System.out.print("Cinsiyetiniz Girinizi (Erkek/Kadın) : ");
	    	    String cinsiyet = Stringgiris.nextLine().toUpperCase();
	    	    user.setCinsiyet(cinsiyet);
	    	    System.out.println();
	    	    
	    	    System.out.print("Yaşınız Girinizi : ");
	    	    int yas = giris.nextInt();
	    	    user.setYas(yas);
	    	    System.out.println();
	    	    
	    	    System.out.print("Kilonuz Girinizi (kg): ");
	    	    double kilo = giris.nextDouble();
	    	    user.setKilo(kilo);
	    	    System.out.println();
	    	    
	    	    System.out.print("Boyunuz Girinizi (cm): ");
	    	    double boy = giris.nextDouble();
	    	    user.setBoy(boy);
	    	    System.out.println();
	    	    
	    	    System.out.println("1. Aktivite Yok");
	    	    System.out.println("2. Az Aktif");
	    	    System.out.println("3. Orta Aktif");
	    	    System.out.println("4. Aktif");
	    	    System.out.println("5. Çok Aktif");
	    	    System.out.print("Aktivite düzeyinizi seçiniz = ");
	    	    int aktivite = giris.nextInt();
	    	    user.setAktivite(aktivite);
	    	    System.out.println();
	    		dongu = false;
	    		break;
	    		default:
	    			System.out.println();
	    			System.out.println("Yanlış değer girdiiniz...");
	    			System.out.println("Lütfen tekrar deneyin...");
	    			System.out.println();
	    	}
		}
}

		    public void userProfiles() {
		        double tmh = hesapla.tmhHesapla(user.getCinsiyet(), user.getKilo(), user.getBoy(), user.getYas());
		        user.setTmh(tmh);
		        double teh = hesapla.tehHesapla(user.getTmh(), user.getAktivite());
		        user.setTeh(teh);
		        System.out.println();
		        System.out.println(" Adınız ve Soyadınız = " + user.getAd() + " " + user.getSoyAd());
		        System.out.println(" Cinsiyetiniz = " + user.getCinsiyet());
		        System.out.println(" Yaşınız = " + user.getYas());
		        System.out.println(" Kilonuz = " + user.getKilo());
		        System.out.println(" Boyunuz = " + user.getBoy());
		        
		    }

		    public void userProfiles(boolean showTmh) {
		        double tmh = hesapla.tmhHesapla(user.getCinsiyet(), user.getKilo(), user.getBoy(), user.getYas());
		        user.setTmh(tmh);
		        double teh = hesapla.tehHesapla(user.getTmh(), user.getAktivite());
		        user.setTeh(teh);
		        System.out.println();
		        System.out.println(" Adınız ve Soyadınız = " + user.getAd() + " " + user.getSoyAd());
		        System.out.println(" Cinsiyetiniz = " + user.getCinsiyet());
		        System.out.println(" Yaşınız = " + user.getYas());
		        System.out.println(" Kilonuz = " + user.getKilo());
		        System.out.println(" Boyunuz = " + user.getBoy());
		        if (showTmh) {
		            System.out.println(" Günlük temel metabolizma hızınız (BMR): " + user.getTmh() + " kalori");
		        }
		        System.out.println(" Günlük toplam kalori değeri (TDEE): " + user.getTeh() + " kalori");
		    }

		public void gunluk() {
			
			boolean dongu =true;
			while(dongu) {
				System.out.println();
				
				System.out.println("Günlük kalori değeri = " + user.getTeh());
				bilgi.deneme();
				
				System.out.println();
				System.out.println("1) Sabah");
				System.out.println("2) Öğlen");
				System.out.println("3) Akşam");
				System.out.println("4) Atıştırmalık");
				System.out.println("5) Çıkış");
				System.out.println("Lütfen hangi zaman yediğinizi seçiniz = ");
				int deger =giris.nextInt();
				switch (deger) {
				case 1:
					bilgi.sabah();
					break;
				case 2:
					bilgi.Oglen()
;					break;
				case 3:
					bilgi.Aksam();
					break;
				case 4:
					bilgi.Atistirmalik();
					break;
				case 5:
					dongu = false;
					break;
	
				}
			}
	    }	
		
		
}


	        

