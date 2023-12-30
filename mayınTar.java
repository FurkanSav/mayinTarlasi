import java.util.Scanner;
public class mayınTar {

    public static void main(String[] args) {
        int row , column , controlgame=0;
        Scanner input = new Scanner(System.in);
        while(controlgame <= 3){
            System.out.println("----------MAYIN TARLASI OYUNUNA HOŞ GELDİNİZ----------");
            System.out.println("");
            System.out.println(" "+"OYUNU BAŞLATMAK İÇİN : 1 \n OYUN KLAVUZU İÇİN : 2 \n YAPIMCISI HAKKINDA BİLGİ ALMAK İÇİN : 3 \n OYUNDAN ÇIKMAK İÇİN : 4  ");
            System.out.println("");
            System.out.print("SEÇİMİNİZİ GİRİNİZ : ");
            controlgame = input.nextInt();
            if(controlgame == 1){
                System.out.println("---- OYNAMAK İSTEDİĞİNİZ BOYUTLARI GİRİNİZ---- ");
                System.out.println("");
                System.out.print("SATIR SAYISINI GİRİNİZ :  ");
                row = input.nextInt();
                System.out.print("SÜTUN SAYISINI GİRİNİZ :  ");
                column = input.nextInt();
                mayinTarla may = new mayinTarla(row,column);
                may.start();
            }
            else if (controlgame == 2){
                System.out.println("Merhabalar  mayın tarlası oyunuma hoşgeldiniz.. \n Amacımız belirlenen tablodaki rastgele yerşeltirilmiş mayınlara denk gelmemek \n girdiğiniz değerler ile tablo oluşutulur. \n Kullanıcıdan bir satır ve sütun sayısı istenir. \n Girilen satır ve sütun değerlerinde eğer mayın yoksa oyun devam eder.. \n Girilen değerlerde mayın varsa oyunu kaybeder..  ");
                System.out.println("");
                System.out.println("---- OYUNUN İPUÇLARI----");
                System.out.println("Girilen kordinatlardaki çıkan sayı çevresinde olan mayını ifade eder.. \n Eğer bu negatif bir sayıyısa belirtilen sayı kadar etrafı temizdir. \n Eğer pozitif bir sayıysa çevresinde o kadar mayın vardır.. \n Şimdiden başarılar :)");
            }
            else if (controlgame == 3  ){
                System.out.println(" ");
                System.out.println("BU OYUN FURKAN SARI TARAFINDAN YAPILMIŞTIR.. \n Görüş ve Önerileriniz için : furkansari3460@gmail.com adresine mail atabilirsiniz..  ");
                System.out.println(" ");
            }
            else if(controlgame == 4) {
                System.out.println("OYUNDAN ÇIKILIYOR .. GÖRÜŞMEK ÜZERE .. :) ");
                break;
            }
            else{
                System.out.println("seçim işleminde hata yaptınız.. lütfen tekrar deneyiniz.");
            }



        }

    }

}