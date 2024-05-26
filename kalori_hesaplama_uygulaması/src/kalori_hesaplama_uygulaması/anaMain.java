package kalori_hesaplama_uygulaması;
import java.util.Scanner;


public class anaMain {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		Scanner Stringgiris = new Scanner(System.in).useDelimiter("/n");
		kullanici_islem yaz=new kullanici_islem();
		alisveris market = new alisveris();
		
		
        System.out.println("    ***** Günlük Kalori Hesaplama Uygulaması *****");
        System.out.println();
        
        //kullanıcı kayıt bilgi sistemi 
        yaz.kayit();
        
        boolean dongu =true;
        while (dongu) {
        	//ana menü
        	System.out.println();
        	System.out.println("********* Ana Menü *********");
            System.out.println("1. Profil");
            System.out.println("2. Gümlük");
            System.out.println("3. Alışveriş");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen gidilecek yer seçiniz : ");
            int deger1 = giris.nextInt();

            switch (deger1) {
                case 1:
                	System.out.print("kullanıcı kalori değerlerini görmek istermisiniz =");
                	String deger =Stringgiris.nextLine().toLowerCase();;
                	//kullanıcı profili
                	if (deger.contentEquals("hayır")) {
                		yaz.userProfiles();
                	}
                	else if(deger.contentEquals("evet")) {
                	yaz.userProfiles(true);
                	}
                	else {
                		
                	}
                    break;
                case 2:
                	yaz.gunluk();
                    break;
                case 3:
                	market.market();
                	break;
                case 4:
                    dongu = false;
                    break;
                default:
                    System.out.println("Geçersiz seçenek!");
                    break;
            }
            }
        }
        }
	
        
	



