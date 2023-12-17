/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package revisi;

/**
 *
 * @author Aharfi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Gudang part = new Gudang();
        
        System.out.println("***************************************");
        System.out.println("          Gudang Part PC");
        System.out.println("***************************************");
        System.out.println("Nama Part Pc : " + part.cetakNama());
        System.out.println("Merk Part pc : " + part.cetakMerk());
        System.out.println("Jenis Part pc : " + part.cetakJenis());
        System.out.println("Harga Part pc : " + part.cetakHarga());
        System.out.println("Stok Part pc : " + part.cetakStok());
        
        part.Pengecekan();
        
        System.out.println("***************************************");
        System.out.println("          Data Setelah Perubahan");
        System.out.println("***************************************");
        System.out.println("Nama Part Pc : " + part.cetakNama());
        System.out.println("Merk Part pc : " + part.cetakMerk());
        System.out.println("Jenis Part pc : " + part.cetakJenis());
        System.out.println("Harga Part pc : " + part.cetakHarga());
        System.out.println("Stok Part pc : " + part.cetakStok());
    }
}
