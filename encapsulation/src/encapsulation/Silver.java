/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author ASUS
 */
public class Silver extends Member {
    private final int diskon = 1;
    private int poin = 1;
    private final int hargaSewa = 25000;
    private int totalSewa;
    
    Silver(DataMember member) {
        super.member = member;
    }
    
    protected void hitungLayanan() {
        hitungPeminjaman();
        totalSewa = hargaSewa * getLama();
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
        poin = poin * getLama();
    }
    
    protected void printSilver() {
        this.pinjamKembali();
        System.out.println("Total Biaya Rental : Rp. " + totalSewa);
        System.out.println("Jumlah Poin : " + poin);
    }

    private void hitungPeminjaman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getLama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pinjamKembali() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
