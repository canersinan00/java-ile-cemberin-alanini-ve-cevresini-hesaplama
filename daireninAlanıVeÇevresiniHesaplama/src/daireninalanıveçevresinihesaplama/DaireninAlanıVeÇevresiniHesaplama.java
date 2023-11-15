
package daireninalanıveçevresinihesaplama;

import java.util.Scanner;


public class DaireninAlanıVeÇevresiniHesaplama {

    public static void main(String[] args) {

        double pi=3.14,alan,çevre,açı,r;
           Scanner scn=new Scanner(System.in);
        
        System.out.print("Lutfen Dairenin Yaricapini Giriniz : ");
        r=scn.nextInt();
        
        
        çevre=2*pi*r;
        System.out.println("Dairenizin Cevresi : "+çevre);
        
        System.out.print("Lutfen Dairenin Istenilen Alanın Acısını Giriniz : ");
        açı=scn.nextDouble();
        
        alan=(pi*(r*r))*açı/360;
        System.out.println("Dairenizin İstenilen Alanı : "+alan);

        
        
                
           


    }
    
}
