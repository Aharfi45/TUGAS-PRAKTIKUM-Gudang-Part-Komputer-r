/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisi;

/**
 *
 * @author Aharfi
 */
public class Motherboard extends Gudang{
    public Motherboard(){
        this.nama = "Motherboard B550M";
        this.merk = "ASUS";
        this.jenis = "Motherboard";
        this.harga = 3000000;
        this.stok = 3;
    }
    void cekBarang(){
        if(stok > 0){
            System.out.println(nama + " Barang tersedia digudang");
        }else{
            System.out.println(nama + " Barang tidak tersedia digudang");
        }
    }
}
