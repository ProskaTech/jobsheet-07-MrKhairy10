/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package jobsheet_7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas_1c {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah = 0;
        do {
            System.out.println(nama);
            jumlah++;
        } while (jumlah < 10);
    }
}
