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
public class Platinum extends Member {
    private final int diskon = 3;
    private int poin = 10;
    private int totalSewa;
    private final int cashback = 10000;
    private int bnsPulsa = 5000;
    private final int hargaSewa = 45000;

    
    Platinum(DataMember member) {
        super.member = member;
//        super.hargaSewa = 45000;
    }
    
    void hitungLayanan() {
        hitungPeminjaman();
        totalSewa = hargaSewa * getLama();
        int potongan = diskon/100 * totalSewa;
        totalSewa -= potongan;
        poin = poin * getLama();
        bnsPulsa = bnsPulsa * getLama();
    }
    
    
    void printPlatinum() {
        this.pinjamKembali();
        System.out.println("Total Biaya Rental : Rp." + totalSewa);
        System.out.println("Jumlah Poin : " + poin);
        System.out.println("Cashback : Rp. " + cashback);
        System.out.println("Bonus Pulsa : Rp. " + bnsPulsa);
    }

    private int getLama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void hitungPeminjaman() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pinjamKembali() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
