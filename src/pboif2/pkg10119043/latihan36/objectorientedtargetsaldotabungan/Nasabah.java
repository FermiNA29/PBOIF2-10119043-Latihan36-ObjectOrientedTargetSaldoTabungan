/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan36.objectorientedtargetsaldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFALA AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program target saldo tabungan dengan object oriented
 */
public class Nasabah {
    public double saldoAwal;
    public double besarBunga;
    public double target;
    private double saldoAkhir;
    private int i = 1;
    private double bunga;
    
    public void hitungTabungan() {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        besarBunga = besarBunga/100;
        System.out.println();
        do{
            saldoAkhir = saldoAwal;
            bunga = saldoAkhir * besarBunga;
            saldoAwal = bunga + saldoAkhir;
            System.out.printf("Saldo di bulan ke-"+i+" Rp. %s %n", kursIndonesia.format(saldoAwal));
            i++;
            saldoAwal++;
        } while(saldoAwal < target);
        System.out.println();
    }
}
