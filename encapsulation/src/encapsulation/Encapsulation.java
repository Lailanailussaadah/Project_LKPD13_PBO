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
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Member m = new Member();
        
        m.tambahMember();
        
        DataMember data = m.inputMember();
        switch(data.Jenis) {
            case "Silver":
                Silver s = new Silver(data);
                s.hitungLayanan();
                s.printSilver();
                break;
            case "Gold":
                Gold g = new Gold(data);
                g.hitungLayanan();
                g.printGold();
                break;
            case "Platinum":
                Platinum p = new Platinum(data);
                p.hitungLayanan();
                p.printPlatinum();
                break;
            }
    }
    
}
