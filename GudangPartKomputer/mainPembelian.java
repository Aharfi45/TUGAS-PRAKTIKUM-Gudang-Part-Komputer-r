/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package revisi;

/**
 *
 * @author Aharfi
 */
public class mainPembelian extends Gudang {

    public mainPembelian() {
        super();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        objPembelian pembeli = new objPembelian();
        
        System.out.println("***************************************");
        System.out.println("          Data Pembeli Barang");
        System.out.println("***************************************");
        pembeli.dataPembeli("Aharfi");
        pembeli.dataAlamat("jl.sembako");
        pembeli.dataJumlah(5);
        System.out.println("Nama Pembeli: " + pembeli.cetakPembeli());
        System.out.println("Alamat Pembeli: " + pembeli.cetakAlamat());
        System.out.println("Nama Barang : " + pembeli.cetakNama());
        System.out.println("Jumlah Barang yang Dibeli: " + pembeli.cetakJumlah());
        
        Gudang penjual = new Gudang();
        
        System.out.println("***************************************");
        System.out.println("          Transaksi Pembelian");
        System.out.println("***************************************");
        pembeli.beliBarang(5);
        
        System.out.println("***************************************");
        System.out.println("          Pemberian Barang");
        System.out.println("***************************************");
        pembeli.pemberianBarang(penjual, 5);

    }
}
