/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodcons;

/**
 *
 * @author Fahmii
 */
public class MethodCons {
    private String kodebarang;
    private String namabarang;
    private short jumlah;
    private double harga;
    
    public MethodCons() {
    }

    public MethodCons(String kodebarang, String namabarang) {
        this.kodebarang = kodebarang;
        this.namabarang = namabarang;        
    }
    
    private void Nama(){
        System.out.println("Nama : Muhammad Fahmi Ayyub");
    }
    
    private void Alamat(String Alamat){
        System.out.println("Alamat : "+Alamat);
    }
            
    public static void main(String[] args) {
      MethodCons kons = new MethodCons("DFTR001", "Kursi");
      System.out.println(kons.kodebarang+" : "+kons.namabarang);
      kons.Nama();
      kons.Alamat("Jl. Pettarani");
    }
}
