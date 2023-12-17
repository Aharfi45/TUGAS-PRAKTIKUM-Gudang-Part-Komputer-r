/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisi;

/**
 *
 * @author Aharfi
 */
public class warehouse extends penyimpanan{
    String nama,merk,jenis;
    double harga;
    int stok,restok;
    
    void dataName(String nama){
        this.nama = nama;
    }
    void dataMerk(String merek){
        this.merk = merek;
    }
    void dataJenis(String jenis){
        this.jenis = jenis;
    }
    void dataHarga(double harga){
        this.harga = harga;
    }
    void dataStok(int stok){
        this.stok = stok;
    }
    void dataRestok(int restok){
        this.restok = restok;
    }
    String cetakNama(){
        return nama;
    }
    String cetakMerk(){
        return merk;
    }
    String cetakJenis(){
        return jenis;
    }
    double cetakHarga(){
        return harga;
    }
    int cetakStok(){
        return stok;
    }
    int cetakRestok(){
        restok = stok + restok;
        return restok;
    }
    
    @Override
    void Pengecekan() {
        if(stok > 0){
            System.out.println("Barang " + nama + " Tersedia.");
        }else{
            System.out.println("Barang " + nama + " Tidak tersedia.");
        }
    }

    @Override
    double hitungPajak() {
        double pajak = 0.05 * harga;
        return pajak;
    }

    @Override
    int kelola() {
        stok = cetakStok();
        if (stok == 0) {
            System.out.println("Stok Part pc : Barang tidak tersedia");
        } else {
            System.out.println("Stok Part pc : " + stok );
        }
        return stok;
    }
}
