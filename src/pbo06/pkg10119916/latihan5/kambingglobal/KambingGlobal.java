/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan5.kambingglobal;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * KELAS    : IF10K
 * NIM      : 10119916
 * Deskripsi Program : Set dan get method
 */
public class KambingGlobal {
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }

    public void tambahKambing() {
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah kammbing setelha ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args){
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saaat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menambah jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
