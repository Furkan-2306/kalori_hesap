package kalori_hesaplama_uygulaması;
import java.util.ArrayList;
import java.util.Scanner;

public class kbilgi_sistemi {
	static Scanner giris = new Scanner(System.in);
	Scanner Stringgiris = new Scanner(System.in).useDelimiter("/n");
	static usere user=new usere(null,null, null, null, null, 0,0, 0, 0, 0, 0, 0, 0);
	bmr_tee_hesap hesapla = new bmr_tee_hesap();
	static double toplamKalori=0;


	
	//sabah besin 
	static public void sabah() {
		ArrayList<Besin> besinler = new ArrayList<>();
        besinler.add(new haslanmisYumurta());
        besinler.add(new kizarmisYumurta());
        besinler.add(new sahandaYumurta());
        besinler.add(new omlet());
        besinler.add(new sucukluYumurta());
        besinler.add(new kasarliOmlet());
        besinler.add(new salcaliYumurta());
        besinler.add(new menemen());
        besinler.add(new patatesKızartmasi());
        besinler.add(new muzluYulafLapasi());
        besinler.add(new yulafLapası());
        besinler.add(new beyazPeynir());
        besinler.add(new suzmePeynir());
        besinler.add(new tulumPeynir());
        besinler.add(new kasarPeyniri());
        besinler.add(new kremPeynir());
        besinler.add(new siyahZeytin());
        besinler.add(new yesilZeytin());
        besinler.add(new danaSosis());
        besinler.add(new pilicSosis());
        besinler.add(new kasapSucuk());
        besinler.add(new pilicSucuk());
        besinler.add(new domates());
        besinler.add(new biber());
        besinler.add(new aciBiber());
        besinler.add(new karisikTost());
        besinler.add(new kasarliTost());
        besinler.add(new ayvalikTost());
        besinler.add(new kizarmisEkmek());
        besinler.add(new cilekReceli());
        besinler.add(new nutella());
        besinler.add(new ayvaReceli());
        besinler.add(new sigaraBoregi());
        besinler.add(new suBöregi());
        besinler.add(new kutBoregi());
        besinler.add(new pacangaBoregi());
        besinler.add(new gulBoregi());
                
        while (true) {
        	System.out.println();
            System.out.println("Yediğiniz besini seçin (Çıkmak için 'c' tuşlayın): ");
            for (int i = 0; i < besinler.size(); i++) {
                System.out.println((i + 1) + ". " + besinler.get(i).getIsim());
            }
            
            //if döngüsü içinde arrylist seçme
            System.out.print("Lütfen yediğiniz besini seçiniz = ");
            String secim = giris.next();
            if (secim.contentEquals("c")) {
                break;
            }
            
            //arrylist değeri 0 dan başladığı için karşıdan veri alırken  
            //-1 ile çıakrtmamız gerekmektedir. string değerle veri aldığımız
            //için aşağıdaki parametreyi kullanıyoruz 
            int besinList = Integer.parseInt(secim) - 1;
            if (besinList < 0 || besinList >= besinler.size()) {
                System.out.println("Geçersiz seçim, tekrar deneyin.");
                continue;
            }

            Besin secilenBesin = besinler.get(besinList);

            System.out.print("Kaç gram yediniz?");
            double gram = giris.nextDouble();

            toplamKalori += secilenBesin.getKalori(gram);
            user.setToplamKalori(toplamKalori);

            System.out.println(secilenBesin.getIsim() + " için " + secilenBesin.getKalori(gram) + " kalori eklendi.");
            System.out.println("Toplam kalori: " + user.getToplamKalori());
        }

        System.out.println("Günlük toplam kalori alımınız: " + user.getToplamKalori());
        
   }
	
	//çğlen besin
	static public void Oglen() {
		ArrayList<Besin> besinler = new ArrayList<>();
        besinler.add(new Tavuk());
        besinler.add(new Pilav());
        besinler.add(new makarna());
        besinler.add(new salcaliMakarna());
        besinler.add(new kremaliMantarliMakarna());
        besinler.add(new peynirliMakarna());
        besinler.add(new kiymaliMakarna());
        besinler.add(new tavukluPilav());
        besinler.add(new etliPilav());
        besinler.add(new hamburger());
        besinler.add(new cheeseburger());
        besinler.add(new tavukBurger());
        besinler.add(new islakHamburger());
        besinler.add(new cigKofteDurum());
        besinler.add(new lahmacun());
        besinler.add(new fındıklahmacun());
        besinler.add(new karisikPizza());
        besinler.add(new peynirliPizza());
        besinler.add(new izgaraKofte());
        besinler.add(new firindaKofte());
        besinler.add(new kofteEkemek());
        besinler.add(new izmirKofte());
        besinler.add(new kofteEkemek());
        besinler.add(new iskender());
        besinler.add(new tavukTantıni());
        besinler.add(new karisikYesilSalata());
        besinler.add(new cobanSalata());
        besinler.add(new mevsimSalata());
        besinler.add(new tavukSalatası());
        besinler.add(new sezarSalata());      
        
        while (true) {
        	System.out.println();
            System.out.println("Yediğiniz besini seçin (Çıkmak için 'c' tuşlayın): ");
            for (int i = 0; i < besinler.size(); i++) {
                System.out.println((i + 1) + ". " + besinler.get(i).getIsim());
            }
            
            //if döngüsü içinde arrylist seçme
            System.out.print("Lütfen yediğiniz besini seçiniz = ");
            String secim = giris.next();
            if (secim.contentEquals("c")) {
                break;
            }
            
            //arrylist değeri 0 dan başladığı için karşıdan veri alırken  
            //-1 ile çıakrtmamız gerekmektedir. string değerle veri aldığımız
            //için aşağıdaki parametreyi kullanıyoruz 
            int besinList = Integer.parseInt(secim) - 1;
            if (besinList < 0 || besinList >= besinler.size()) {
                System.out.println("Geçersiz seçim, tekrar deneyin.");
                continue;
            }

            Besin secilenBesin = besinler.get(besinList);

            System.out.print("Kaç gram yediniz?");
            double gram = giris.nextDouble();

            toplamKalori += secilenBesin.getKalori(gram);
            user.setToplamKalori(toplamKalori);

            System.out.println(secilenBesin.getIsim() + " için " + secilenBesin.getKalori(gram) + " kalori eklendi.");
            System.out.println("Toplam kalori: " + user.getToplamKalori());
        }

        System.out.println("Günlük toplam kalori alımınız: " + user.getToplamKalori());
        
   }
	
	//aksam besin
	static public void Aksam() {
		ArrayList<Besin> besinler = new ArrayList<>();
        besinler.add(new Tavuk());
        besinler.add(new Pilav());
        besinler.add(new zeytinYagliTazeFasulye());
        besinler.add(new kiymaliTazeFasulye());
        besinler.add(new kuruFasulye());
        besinler.add(new pilavUstuKuru());
        besinler.add(new etSote());
        besinler.add(new kavurma());
        besinler.add(new danaBonfile());
        besinler.add(new etliGuvec());
        besinler.add(new firindaTavuk());
        besinler.add(new kanat());
        besinler.add(new tavukSote());
        besinler.add(new makarna());
        besinler.add(new salcaliMakarna());
        besinler.add(new kremaliMantarliMakarna());
        besinler.add(new peynirliMakarna());
        besinler.add(new kiymaliMakarna());
        besinler.add(new tavukluPilav());
        besinler.add(new etliPilav());
        besinler.add(new hamburger());
        besinler.add(new cheeseburger());
        besinler.add(new tavukBurger());
        besinler.add(new islakHamburger());
        besinler.add(new cigKofteDurum());
        besinler.add(new lahmacun());
        besinler.add(new fındıklahmacun());
        besinler.add(new karisikPizza());
        besinler.add(new peynirliPizza());
        besinler.add(new izgaraKofte());
        besinler.add(new firindaKofte());
        besinler.add(new kofteEkemek());
        besinler.add(new izmirKofte());
        besinler.add(new kofteEkemek());
        besinler.add(new iskender());
        besinler.add(new tavukTantıni());
        besinler.add(new karisikYesilSalata());
        besinler.add(new cobanSalata());
        besinler.add(new mevsimSalata());
        besinler.add(new tavukSalatası());
        besinler.add(new sezarSalata());
        besinler.add(new mercimekCorbasi());
        besinler.add(new yaylaCorbasi());
        besinler.add(new ezogelinCorbasi());
        besinler.add(new tarhanaCorbasi());
        besinler.add(new tavukCorbasi());
        besinler.add(new domatesCorbasi());
        besinler.add(new iskembeCorbasi());
        besinler.add(new kremaliMantarCorbas());
        besinler.add(new balikCorbasi());
        
        while (true) {
        	System.out.println();
            System.out.println("Yediğiniz besini seçin (Çıkmak için 'c' tuşlayın): ");
            for (int i = 0; i < besinler.size(); i++) {
                System.out.println((i + 1) + ". " + besinler.get(i).getIsim());
            }
            
            //if döngüsü içinde arrylist seçme
            System.out.print("Lütfen yediğiniz besini seçiniz = ");
            String secim = giris.next();
            if (secim.contentEquals("c")) {
                break;
            }
            
            //arrylist değeri 0 dan başladığı için karşıdan veri alırken  
            //-1 ile çıakrtmamız gerekmektedir. string değerle veri aldığımız
            //için aşağıdaki parametreyi kullanıyoruz 
            int besinList = Integer.parseInt(secim) - 1;
            if (besinList < 0 || besinList >= besinler.size()) {
                System.out.println("Geçersiz seçim, tekrar deneyin.");
                continue;
            }

            Besin secilenBesin = besinler.get(besinList);

            System.out.print("Kaç gram yediniz?");
            double gram = giris.nextDouble();

            toplamKalori += secilenBesin.getKalori(gram);
            user.setToplamKalori(toplamKalori);

            System.out.println(secilenBesin.getIsim() + " için " + secilenBesin.getKalori(gram) + " kalori eklendi.");
            System.out.println("Toplam kalori: " + user.getToplamKalori());
        }

        System.out.println("Günlük toplam kalori alımınız: " + user.getToplamKalori());
        
   }
	
	//atistirmalik besin
	static public void Atistirmalik() {
		ArrayList<Besin> besinler = new ArrayList<>();
        besinler.add(new Elma());
        besinler.add(new Muz());
        besinler.add(new portakal());
        besinler.add(new yesilElma());
        besinler.add(new cilek());
        besinler.add(new mandalina());
        besinler.add(new kivi());
        besinler.add(new armut());
        besinler.add(new nar());
        besinler.add(new cagla());
        besinler.add(new ananas());
        besinler.add(new vanilyaliMilkShake());
        besinler.add(new cikolataliMilkShake());
        besinler.add(new cilekliMilkShake());
        besinler.add(new coloCola());
        besinler.add(new fanta());
        besinler.add(new sprite());
        besinler.add(new kakaoluKek());
        besinler.add(new sadeKeki());
        besinler.add(new portakallıKek());
        besinler.add(new islakKek());
        besinler.add(new potiborBiskuvi());
        besinler.add(new tutku());
        besinler.add(new hanimeller());
        besinler.add(new negro());
        besinler.add(new oreo());
        besinler.add(new tuzluKurabiye());
        besinler.add(new unKurabiyesi());
        besinler.add(new patatesCipsi());
        besinler.add(new klasikCips());
        besinler.add(new haslanmisMisir());
        besinler.add(new patlamisMisir());
        
        while (true) {
        	System.out.println();
            System.out.println("Yediğiniz besini seçin (Çıkmak için 'c' tuşlayın): ");
            for (int i = 0; i < besinler.size(); i++) {
                System.out.println((i + 1) + ". " + besinler.get(i).getIsim());
            }
            
            //if döngüsü içinde arrylist seçme
            System.out.print("Lütfen yediğiniz besini seçiniz = ");
            String secim = giris.next();
            if (secim.contentEquals("c")) {
                break;
            }
            
            //arrylist değeri 0 dan başladığı için karşıdan veri alırken  
            //-1 ile çıakrtmamız gerekmektedir. string değerle veri aldığımız
            //için aşağıdaki parametreyi kullanıyoruz 
            int besinList = Integer.parseInt(secim) - 1;
            if (besinList < 0 || besinList >= besinler.size()) {
                System.out.println("Geçersiz seçim, tekrar deneyin.");
                continue;
            }

            Besin secilenBesin = besinler.get(besinList);

            System.out.print("Kaç gram yediniz?");
            double gram = giris.nextDouble();

            toplamKalori += secilenBesin.getKalori(gram);
            user.setToplamKalori(toplamKalori);

            System.out.println(secilenBesin.getIsim() + " için " + secilenBesin.getKalori(gram) + " kalori eklendi.");
            System.out.println("Toplam kalori: " + user.getToplamKalori());
        }

        System.out.println("Günlük toplam kalori alımınız: " + user.getToplamKalori());
        
   }
	static void deneme () {
		System.out.println("Harcanan kalori değeri = " + toplamKalori);
	}

}
