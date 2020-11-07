/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan36.objectorientedtargetsaldotabungan;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFALA AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program target saldo tabungan dengan object oriented
 */
public class PBOIF210119043Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Nasabah tabunganNasabah = new Nasabah();
        
        System.out.println("====Program Target Tabungan====");
        //user input saldo awal
        System.out.print("Masukan Saldo Anda : Rp. ");
        tabunganNasabah.saldoAwal = scanner.nextDouble();
        
        //user input bunga tabungan
        System.out.print("Bunga Tabungan (%): ");
        tabunganNasabah.besarBunga = scanner.nextDouble();
        
        //user input target tabungan
        System.out.print("Target Tabungan : Rp. ");
        tabunganNasabah.target = scanner.nextDouble();
        
        tabunganNasabah.hitungTabungan();
    }
    
}
