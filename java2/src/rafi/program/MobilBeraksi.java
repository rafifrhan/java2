/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafi.program;

/**
 *
 * @author 62812
 */
public class MobilBeraksi {
    public static void main(String[]args){
        
        Mobil mobilku = new Mobil();
        Mobil mobilrafi = new Mobil();
        
        mobilku.warna = "Hitam"; mobilrafi.warna = "Merah";
        mobilku.tahunProduksi = 2006; mobilku.tahunProduksi = 2022;
        System.out.println("Warna:"+mobilku.warna);
        System.out.println("Tahun:"+mobilku.tahunProduksi);
}
}
 
