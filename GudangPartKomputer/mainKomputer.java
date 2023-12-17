/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisi;

/**
 *
 * @author Aharfi
 */
public class mainKomputer {
    public static void main(String[]args){
        Komputer comp = new Komputer();
        Gudang mobo = new Motherboard();
        
        comp.cekBarang(mobo);
    }
}
