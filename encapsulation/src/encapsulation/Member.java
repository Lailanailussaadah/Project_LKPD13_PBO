/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Member {
    public DataMember member;
    private int tglPeminjaman;
    private int blnPeminjaman;
    private int thnPeminjaman;
    private int tglPengembalian;
    private int blnPengembalian;
    private int thnPengembalian;
    private LocalDate waktuPeminjaman;
    private LocalDate waktuPengembalian;
    private int lama;

    ArrayList<DataMember> dataMember = new ArrayList<>();
    
    public void tambahMember() {
        dataMember.add(new DataMember("M001", "Mr. X", "Silver"));
        dataMember.add(new DataMember("M002", "Mr. Y", "Gold"));
        dataMember.add(new DataMember("M003", "Mr. Z", "Platinum"));
    }
    
    private void cariMember(String Id) {
        boolean ketemu = false;
        int ke = -1;
            for(int i = 0; i < dataMember.size(); i++) {
                if(dataMember.get(i).Id.equals(Id)){
                    ketemu = true;
                    ke = i;
                    }
            }   
            if(ketemu == true) {
                member = dataMember.get(ke);
            } else {
                System.out.println("Member tidak terdaftar");
                System.exit(0);
            }
    }
    
    public DataMember inputMember() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member Anda : ");
        cariMember(input.nextLine());
        return member;
    }
    
    private void setTanggalPinjam(int tgl) {
        if (tgl > 0 && tgl <= 31) {
        tglPeminjaman = tgl;
        } else {
            System.out.println("Tanggal tidak sesuai");
            System.exit(0);
        }
    }
    
    private void setBulanPinjam(int bln) {
        if (bln > 0 && bln < 13) {
            blnPeminjaman = bln;
        } else {
            System.out.println("Bulan tidak sesuai");
            System.exit(0);
        }
    }
}
