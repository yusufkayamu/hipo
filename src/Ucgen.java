

import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {
        double akenarı  , bkenarı  ;

      Scanner input = new Scanner(System.in);

        System.out.print("A kenarinin uzunlugunu giriniz =");
        akenarı = input.nextInt();

        System.out.print("B kenarinin uzunlugunu giriniz =");
        bkenarı = input.nextInt();

         double akenarınınkaresı = akenarı * akenarı ,
                bkenarınınkaresı = bkenarı * bkenarı ,
                ckenarınınkaresı = akenarınınkaresı + bkenarınınkaresı;


        System.out.println("hipotenus =" + ckenarınınkaresı );

         double ckenarı = Math.sqrt(ckenarınınkaresı),
                ucgenıncevresı = akenarı+bkenarı+ckenarı ;

        System.out.println("ucgenın cevresı =" + ucgenıncevresı );
        System.out.println("ucgenin alanı"+ (akenarı * bkenarı) / 2 );

    }


}
