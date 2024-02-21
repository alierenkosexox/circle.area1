import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     // Değer kaydeymek için scanner oluştur ve tanımla
        double r , alan , angle , cevre ,daireDilimAlan;  // denklende kullanacağımız değerleri tanımla

        System.out.print("Yari capi giriniz : ");       // yarı çap sorusu
        r = input.nextDouble();                          // yarı çap cevabını kaydet
        System.out.print("Merkez acinin derecesini giriniz : ");      // açı sorusu
        angle= input.nextDouble();                      //açıyı içe kaydet

        alan=Math.PI*r*r;       // alan denklemi
        cevre=2*Math.PI*r;         // cevre denklemi
        daireDilimAlan=(Math.PI*(r*r)*angle)/360;   // daire dilim alanı denklemi

        System.out.println("Dairenin cevresi : "+cevre);    // cevre sonucunu yazdırma
        System.out.println("Dairenin Alani : "+alan);       // alanın sonucunu yazdırma
        System.out.println("Daire diliminin alanı : "+ daireDilimAlan);    //darire dilim alanı sonucu yazdırma

    }
}  // Ali Eren KÖSE 21/02/2024 04:57   İnsanlar hiç bir şeye inanmamaktansa Tanrı'ya inanmayı yeğlerler.
