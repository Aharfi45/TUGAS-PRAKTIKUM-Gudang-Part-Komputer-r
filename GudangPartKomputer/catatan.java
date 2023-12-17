/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisi;

/**
 *
 * @author Aharfi
 */
public class catatan extends Gudang{
    String penjual;
    int ketersedian;
    void dataPenjual(String penjual){
        this.penjual = penjual;
    }
    String cetakPenjual(){
        return penjual;
    }
    catatan(){
        super();
        this.ketersedian = stok;
    }
    void ketersediaan(){
        if(ketersedian < stok){
            System.out.println("Stok Part PC Ini Belum Tersedia");
        }else{
            System.out.println("Stok Part PC Ini Tersedia");
        }
    }
    void CetakCatatan(){
        System.out.println("Jenis Komponen : " + super.cetakJenis());
        System.out.println("Merk Komponen : " + super.cetakMerk());
        System.out.println("Nama Komponen : " + super.cetakNama());
        System.out.println("Stok Komponen : " + super.cetakStok());
        ketersediaan();
    }
}
