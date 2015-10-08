
package bol28;

import java.util.Scanner;

/**
 *
 * @author julianlinux
 */
public class Bol28 {

    public static void main(String[] args) {
        float centigrados,kelvin,farenheit;
        Scanner dato=new Scanner(System.in);
        System.out.println("Introduce los grados centigrados:");
        centigrados=dato.nextFloat();
        kelvin=centigrados+273;
        farenheit=centigrados*1.8f+32;
        System.out.println("kelvin:"+kelvin);
        System.out.println("farenheit:"+farenheit);
        
        
        
        
        
        
        
        
        
    }
    
}
