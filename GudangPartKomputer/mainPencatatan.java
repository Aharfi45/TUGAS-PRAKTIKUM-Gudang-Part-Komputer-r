/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisi;

import java.util.Scanner;

/**
 *
 * @author Aharfi
 */
public class mainPencatatan {
    public static void main (String[]args){
        catatan pencatatan = new catatan();
        Scanner input = new Scanner(System.in);
        System.out.println("Berikut Adalah Catatan Part PC ");
        pencatatan.CetakCatatan();
        System.out.print("Apakah anda ingin mengirim hasil catatan tersebut kepada penjual pakai? (y/n)");
        String pilihan = input.next();
        
        if(pilihan.equalsIgnoreCase("y")){
            System.out.print("Masukkan nama penjual:");
            String namaPenjual = input.next();
            System.out.print("Hasil catatan telah berhasil terkirim kepada penjual atas nama " + namaPenjual);
        }else{
            input.close();
        }
    }
}
