package kalori_hesaplama_uygulaması;


	class Besin {
	    private String isim;
	    private double kalori; // 100 gramdaki kalori miktarı

	    public Besin(String isim, double kalori) {
	        this.isim = isim;
	        this.kalori = kalori;
	    }
	    

	    public String getIsim() {
	        return isim;
	    }

	    public double getKalori(double gram) {
	        return (kalori / 100) * gram;
	    }
	}

	// Örnek Besin sınıfları

	class Tavuk extends Besin {
	    public Tavuk() {
	        super("Tavuk", 239);
	    }
	}

	class Pilav extends Besin {
	    public Pilav() {
	        super("Pilav", 130); 
	    }
	}

	class haslanmisYumurta extends Besin {
	    public haslanmisYumurta() {
	        super("Haşlanmış Yumurta", 78); 
	    }
	}
	
	class kizarmisYumurta extends Besin {
	    public kizarmisYumurta() {
	        super("Kızarmış Yumurta", 89); 
	    }
	}
	
	class sahandaYumurta extends Besin {
	    public sahandaYumurta() {
	        super("Sahanda Yumurta", 277); 
	    }
	}
	
	class omlet extends Besin {
	    public omlet() {
	        super("Omlet", 98); 
	    }
	}
	
	class sucukluYumurta extends Besin {
	    public sucukluYumurta() {
	        super("Sucuklu Yumurta", 348); 
	    }
	}
	
	class kasarliOmlet extends Besin {
	    public kasarliOmlet() {
	        super("Kaşarlı Omlet", 204); 
	    }
	}
	
	class salcaliYumurta extends Besin {
	    public salcaliYumurta() {
	        super("Salçalı Yumurta", 134); 
	    }
	}
	
	class menemen extends Besin {
	    public menemen() {
	        super("Menemen", 161); 
	    }
	}
	
	class patatesKızartmasi extends Besin {
	    public patatesKızartmasi() {
	        super("Patates Kızartması", 359); 
	    }
	}
	
	class muzluYulafLapasi extends Besin {
	    public muzluYulafLapasi() {
	        super("Muzlu Yulaf Lapası", 304); 
	    }
	}
	
	class yulafLapası extends Besin {
	    public yulafLapası() {
	        super("Yulaf Lapası", 137); 
	    }
	}
	
	class beyazPeynir extends Besin {
	    public beyazPeynir() {
	        super("Beyaz Peynir", 264); 
	    }
	}
	
	class suzmePeynir extends Besin {
	    public suzmePeynir() {
	        super("Suzme Peynir", 103); 
	    }
	}
	
	class tulumPeynir extends Besin {
	    public tulumPeynir() {
	        super("Tulum Peynir", 251); 
	    }
	}
	
	class kasarPeyniri extends Besin {
	    public kasarPeyniri() {
	        super("Kaşar Peyniri", 325); 
	    }
	}
	
	class kremPeynir extends Besin {
	    public kremPeynir() {
	        super("Krem Peynir", 51); 
	    }
	}
	
	class siyahZeytin extends Besin {
	    public siyahZeytin() {
	        super("Siyah Zeytin", 36); 
	    }
	}
	
	class yesilZeytin extends Besin {
	    public yesilZeytin() {
	        super("Yesil Zeytin", 42); 
	    }
	}
	
	class danaSosis extends Besin {
	    public danaSosis() {
	        super("Dana Sosis", 217); 
	    }
	}
	
	class pilicSosis extends Besin {
	    public pilicSosis() {
	        super("Piliç Sosis", 227); 
	    }
	}
	
	class kasapSucuk extends Besin {
	    public kasapSucuk() {
	        super("Kasap Sucuk", 432); 
	    }
	}
	
	class pilicSucuk extends Besin {
	    public pilicSucuk() {
	        super("Piliç Sucuk", 355); 
	    }
	}
	
	class domates extends Besin {
	    public domates() {
	        super("Domates", 22); 
	    }
	}
	
	class salata extends Besin {
	    public salata() {
	        super("Salata", 15); 
	    }
	}
	
	class biber extends Besin {
	    public biber() {
	        super("Biber", 26); 
	    }
	}
	
	class aciBiber extends Besin {
	    public aciBiber() {
	        super("Acı Biber", 18); 
	    }
	}
	
	class kasarliTost extends Besin {
	    public kasarliTost() {
	        super("Kaşarlı Tost", 270); 
	    }
	}
	
	class karisikTost extends Besin {
	    public karisikTost() {
	        super("Karışık Tost", 256); 
	    }
	}
	
	class ayvalikTost extends Besin {
	    public ayvalikTost() {
	        super("Ayvalık Tost", 751); 
	    }
	}
	
	class kizarmisEkmek extends Besin {
	    public kizarmisEkmek() {
	        super("Kızarmış Ekmek", 64); 
	    }
	}
	
	class cilekReceli extends Besin {
	    public cilekReceli() {
	        super("Çilek Reçeli", 20); 
	    }
	}
	
	class ayvaReceli extends Besin {
	    public ayvaReceli() {
	        super("Ayva Reçeli", 29); 
	    }
	}
	
	class nutella extends Besin {
	    public nutella() {
	        super("Nutella", 539); 
	    }
	}
	
	class sigaraBoregi extends Besin {
	    public sigaraBoregi() {
	        super("Sigara Böreği", 98); 
	    }
	}
	
	class suBöregi extends Besin {
	    public suBöregi() {
	        super("Su Böreği", 300); 
	    }
	}
	
	class kutBoregi extends Besin {
	    public kutBoregi() {
	        super("Küt Böreği", 448); 
	    }
	}
	
	class pacangaBoregi extends Besin {
	    public pacangaBoregi() {
	        super("Paçanga 	Böreği", 254); 
	    }
	}
	
	class gulBoregi extends Besin {
	    public gulBoregi() {
	        super("Gül Böreği", 246); 
	    }
	}
	
	class makarna extends Besin {
	    public makarna() {
	        super("Makarna", 124); 
	    }
	} 
	
	class salcaliMakarna extends Besin {
	    public salcaliMakarna() {
	        super("Salcalı Makarna", 127); 
	    }
	} 
	
	class kremaliMantarliMakarna extends Besin {
	    public kremaliMantarliMakarna() {
	        super("Kremalı Mantarlı Makarna", 253); 
	    }
	} 
	
	class peynirliMakarna extends Besin {
	    public peynirliMakarna() {
	        super("Peynirli Makarna", 203); 
	    }
	} 
	
	class kiymaliMakarna extends Besin {
	    public kiymaliMakarna() {
	        super("Kıymalı Makarna", 219); 
	    }
	} 
	
	class etliPilav extends Besin {
	    public etliPilav() {
	        super("Etli Pilav", 377); 
	    }
	} 
	
	class tavukluPilav extends Besin {
	    public tavukluPilav() {
	        super("Tavuklu Pilav", 351); 
	    }
	} 
	
	class hamburger extends Besin {
	    public hamburger() {
	        super("Hamburger", 246); 
	    }
	} 
	
	class cheeseburger extends Besin {
	    public cheeseburger() {
	        super("Cheeseburger", 292); 
	    }
	} 
	
	class tavukBurger extends Besin {
	    public tavukBurger() {
	        super("Tavuk Burger", 303); 
	    }
	} 
	
	class islakHamburger extends Besin {
	    public islakHamburger() {
	        super("Islak Hamburger", 320); 
	    }
	} 
	
	class cigKofteDurum extends Besin {
	    public cigKofteDurum() {
	        super("Çiğ Köfte Dürüm", 347); 
	    }
	} 
	
	class lahmacun extends Besin {
	    public lahmacun() {
	        super("Lahmacun", 449); 
	    }
	} 
	
	class fındıklahmacun extends Besin {
	    public fındıklahmacun() {
	        super("Fındık Lahmacun", 121); 
	    }
	} 
	
	class karisikPizza extends Besin {
	    public karisikPizza() {
	        super("Karışık Pizza", 260); 
	    }
	} 
	
	class peynirliPizza extends Besin {
	    public peynirliPizza() {
	        super("Peynirli Pizza", 192); 
	    }
	} 
	
	class izgaraKofte extends Besin {
	    public izgaraKofte() {
	        super("Izgara Köfte", 204); 
	    }
	} 
	
	class firindaKofte extends Besin {
	    public firindaKofte() {
	        super("Fırında Köfte", 187); 
	    }
	} 
	
	class izmirKofte extends Besin {
	    public izmirKofte() {
	        super("İzmir Köfte", 53); 
	    }
	} 
	
	class kofteEkemek extends Besin {
	    public kofteEkemek() {
	        super("Köfte Ekemek", 563); 
	    }
	} 
	
	class iskender extends Besin {
	    public iskender() {
	        super("İskender", 589); 
	    }
	} 
	
	class tavukTantıni extends Besin {
	    public tavukTantıni() {
	        super("Tavuk Tantıni", 413); 
	    }
	} 
	
	class karisikYesilSalata extends Besin {
	    public karisikYesilSalata() {
	        super("karışık Yeşil Salata", 17); 
	    }
	} 
	
	class cobanSalata extends Besin {
	    public cobanSalata() {
	        super("Çoban Salata", 85); 
	    }
	} 
	
	class mevsimSalata extends Besin {
	    public mevsimSalata() {
	        super("Mevsim Salata", 24); 
	    }
	} 
	
	class tavukSalatası extends Besin {
	    public tavukSalatası() {
	        super("Tavuk Salatası", 132); 
	    }
	} 
	
	class sezarSalata extends Besin {
	    public sezarSalata() {
	        super("Sezar Salata", 170); 
	    }
	} 
//	
	class zeytinYagliTazeFasulye extends Besin {
	    public zeytinYagliTazeFasulye() {
	        super("Zeytin Yağlı Taze Fasulye", 85); 
	    }
	} 
	
	class kiymaliTazeFasulye extends Besin {
	    public kiymaliTazeFasulye() {
	        super("Kıymalı Taze Fasulye", 91); 
	    }
	} 
	
	class kuruFasulye extends Besin {
	    public kuruFasulye() {
	        super("Kuru Fasulye", 232); 
	    }
	} 
	
	class pilavUstuKuru extends Besin {
	    public pilavUstuKuru() {
	        super("Pilav Üstü Kuru", 164); 
	    }
	} 
	
	class etSote extends Besin {
	    public etSote() {
	        super("Et Sote", 133); 
	    }
	} 
	
	class kavurma extends Besin {
	    public kavurma() {
	        super("Kavurma", 345); 
	    }
	} 
	
	class danaBonfile extends Besin {
	    public danaBonfile() {
	        super("Dana Bonfile", 169); 
	    }
	} 
	
	class etliGuvec extends Besin {
	    public etliGuvec() {
	        super("Etli Güveç", 83); 
	    }
	} 
	
	class firindaTavuk extends Besin {
	    public firindaTavuk() {
	        super("Fırında Tavuk", 237); 
	    }
	} 
	
	class tavukSote extends Besin {
	    public tavukSote() {
	        super("Tavuk Sote", 101); 
	    }
	} 
	
	class kanat extends Besin {
	    public kanat() {
	        super("Kanat", 81); 
	    }
	}
	
	class vanilyaliMilkShake extends Besin {
	    public vanilyaliMilkShake() {
	        super("Vanilyalı MilkShake", 275); 
	    }
	}
	
	class cikolataliMilkShake extends Besin {
	    public cikolataliMilkShake() {
	        super("Çikolatalı MilkShake", 515); 
	    }
	}
	
	class cilekliMilkShake extends Besin {
	    public cilekliMilkShake() {
	        super("Çilekli MilkShake", 381); 
	    }
	}
	
	class coloCola extends Besin {
	    public coloCola() {
	        super("Colo-Cola", 42); 
	    }
	}
	
	class fanta extends Besin {
	    public fanta() {
	        super("Fanta", 30); 
	    }
	}
	
	class sprite extends Besin {
	    public sprite() {
	        super("Sprite", 13); 
	    }
	}
	
	class kakaoluKek extends Besin {
	    public kakaoluKek() {
	        super("Kakaolu Kek", 304); 
	    }
	}
	
	class sadeKeki extends Besin {
	    public sadeKeki() {
	        super("Sade Kek", 396); 
	    }
	}
	
	class portakallıKek extends Besin {
	    public portakallıKek() {
	        super("Portakallı Kek", 255); 
	    }
	}
	
	class islakKek extends Besin {
	    public islakKek() {
	        super("Islak Kek", 360); 
	    }
	}
	
	class potiborBiskuvi extends Besin {
	    public potiborBiskuvi() {
	        super("Potibor Bisküvi", 451); 
	    }
	}
	
	class tutku extends Besin {
	    public tutku() {
	        super("Tutku", 50); 
	    }
	}
	
	class hanimeller extends Besin {
	    public hanimeller() {
	        super("Hanimeller", 81); 
	    }
	}
	
	class negro extends Besin {
	    public negro() {
	        super("Negro", 480); 
	    }
	}
	
	class oreo extends Besin {
	    public oreo() {
	        super("Oreo", 52); 
	    }
	}
	
	class tuzluKurabiye extends Besin {
	    public tuzluKurabiye() {
	        super("tuzlu Kurabiye", 90); 
	    }
	}
	
	class unKurabiyesi extends Besin {
	    public unKurabiyesi() {
	        super("un Kurabiyesi", 72); 
	    }
	}
	
	class patatesCipsi extends Besin {
	    public patatesCipsi() {
	        super("Patates Cipsi", 153); 
	    }
	}
	
	class klasikCips extends Besin {
	    public klasikCips() {
	        super("Klasik Cips", 548); 
	    }
	}
	
	class haslanmisMisir extends Besin {
	    public haslanmisMisir() {
	        super("Haşlanmiş Mısır", 96); 
	    }
	}
	
	class patlamisMisir extends Besin {
	    public patlamisMisir() {
	        super("Patlamış Mışır", 387); 
	    }
	}
	
	class Elma extends Besin {
	    public Elma() {
	        super("Elma", 52);
	    }
	}

	class Muz extends Besin {
	    public Muz() {
	        super("Muz", 89);
	    }
	}
	
	class portakal extends Besin {
	    public portakal() {
	        super("Portakal", 62); 
	    }
	}
	
	class yesilElma extends Besin {
	    public yesilElma() {
	        super("Yeşil Elma", 73); 
	    }
	}
	
	class cilek extends Besin {
	    public cilek() {
	        super("Çilek", 32); 
	    }
	}
	
	class mandalina extends Besin {
	    public mandalina() {
	        super("Mandalina", 53); 
	    }
	}
	
	class kivi extends Besin {
	    public kivi() {
	        super("Kivi", 46); 
	    }
	}
	
	class armut extends Besin {
	    public armut() {
	        super("Armut", 96); 
	    }
	}
	
	class nar extends Besin {
	    public nar() {
	        super("Nar", 68); 
	    }
	}
	
	class ananas extends Besin {
	    public ananas() {
	        super("Ananas", 48); 
	    }
	}
	
	class cagla extends Besin {
	    public cagla() {
	        super("Çağla", 573); 
	    }
	}
	
	class mercimekCorbasi extends Besin {
	    public mercimekCorbasi() {
	        super("Mercimek Çorbası", 186); 
	    }
	}
	
	class yaylaCorbasi extends Besin {
	    public yaylaCorbasi() {
	        super("Yayla Çorbası", 156); 
	    }
	}
	
	class ezogelinCorbasi extends Besin {
	    public ezogelinCorbasi() {
	        super("Ezogelin Çorbası", 129); 
	    }
	}
	
	class tarhanaCorbasi extends Besin {
	    public tarhanaCorbasi() {
	        super("Tarhana Çorbası", 197); 
	    }
	}
	
	class tavukCorbasi extends Besin {
	    public tavukCorbasi() {
	        super("Tavuk Çorbası", 81); 
	    }
	}
	
	class domatesCorbasi extends Besin {
	    public domatesCorbasi() {
	        super("Domates Çorbası", 102); 
	    }
	}
	
	class iskembeCorbasi extends Besin {
	    public iskembeCorbasi() {
	        super("İşkembe Çorbası", 112); 
	    }
	}
	
	class kremaliMantarCorbas extends Besin {
	    public kremaliMantarCorbas() {
	        super("kremali Mantar Çorbası", 50); 
	    }
	}
	
	class balikCorbasi extends Besin {
	    public balikCorbasi() {
	        super("Balık Corbası", 47); 
	    }
	}
