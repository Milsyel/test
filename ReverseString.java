/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritma;

/**
 *
 * @author ASUS
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat = "NEGIE", hasil = "";
        char ch;

        System.out.print("Kalimat: ");
        System.out.println("NEGIE1");

        for (int i = 0; i < kalimat.length(); i++) {
            ch = kalimat.charAt(i);
            hasil = ch + hasil;
        }
        System.out.println("Hasil: " + hasil + "1");
    }
}
