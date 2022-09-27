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
public class Input_Query {

    public static void main(String[] args) {
        String[] kata = {"xc", "dz", "bbb", "dz"};
        int Count = 0;
        int Count2 = 0;
        int Count3 = 0;
        for (int i = 0; i < kata.length; i++) {
            if (kata[i] == "bbb") {
                Count++;
            }
            if (kata[i] == "dz") {
                Count2++;
            } else if (kata[i] == "ac") {
                Count3++;
            }
        }
        System.out.println("INPUT : xc, dz, bbb, dz");
        System.out.println("QUERY : ac, dz, bbb");
        System.out.println("Jumlah huruf bbb yang ada di kata tersebut adalah: " + Count);
        System.out.println("Jumlah huruf dz yang ada di kata tersebut adalah: " + Count2);
        System.out.println("Jumlah huruf ac yang ada di kata tersebut adalah: " + Count3);
    }
}
