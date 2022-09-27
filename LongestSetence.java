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
public class LongestSetence {

    public static int maxValue(String karakter) {
        String[] angkaArray = karakter.split(",");
        int max = angkaArray[0].length();
        for (int i = 0; i < angkaArray.length; i++) {
            if (angkaArray[i].length() > max) {
                max = angkaArray[i].length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String kata = "Saya,sangat,senang,mengerjakan,soal,algoritma";
        int terpanjang = maxValue(kata);
        System.out.println("Kata terpanjang " + terpanjang + " character");
    }
}
