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
public class Matrix {

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 0;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        int baris, kolom, sum = 0;
        System.out.println("MATRIX");
        for (baris = 0; baris < matrix.length; baris++) {
            for (kolom = 0; kolom < matrix[0].length; kolom++) {
                System.out.print(matrix[baris][kolom] + "");
            }
            System.out.println("");
        }
        int jml = 0;
        for (int j = 0; j < matrix.length; j++) {
            jml += matrix[j][j];
        }
        System.out.println("Jumlah diagonal kiri atas ke kanan bawah = " + jml);
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][3 - i - 1];
        }
        System.out.println("Jumlah diagonal dari kanan atas ke kiri bawah = " + sum);

        int total = jml - sum;
        System.out.println("Maka hasilnya adalah = " + total);
    }
}
