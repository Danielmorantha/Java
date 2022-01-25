
package sistemminimarket;

import java.util.Scanner;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Daniel Morantha (2019231472628)
 * @author Deo andika (2017240048)
 * @author Muhammad Rafli (2020230062)
 * @author Chandra Philanthrope Renomme (2019230041)
 */
public class Transaksi 
{

    public static void main(String[] args) 
    {
        Scanner InputUser = new Scanner(System.in);
        System.out.println("Masukan nama kasir :");
        String NamaKasir;
        NamaKasir = InputUser.nextLine();
        float JumlahBayar = 0;
        
        Date Tgl = new Date();
        SimpleDateFormat UbahStrng = new SimpleDateFormat("dd/MM/YY");
        //System.out.println(UbahStrng.format(Tgl));
        
        
        Barang[] DtaBrang = new Barang[0];
        Barang[] a = null;
        int JumlahBeli = 0;
        float Tagihan = 0;
        float Pembayaran = 0;
        float Kembalian = 0;
        int pilihan, JumlahBarang, x = 0;
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        
        do
        {
            System.out.println("Silahkan pilih menu transaksi :");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Pembayaran");
            System.out.println("3. Keluar Program");
            pilihan = InputUser.nextInt();
           
            switch(pilihan)
            {
                case 1:
                    System.out.println("Masukan Jumlah Barang :");
                    JumlahBarang = InputUser.nextInt();
                    System.out.println("Masukan Jumlah Pembayaran");
                    DtaBrang = new Barang[JumlahBarang];
                    for(x = 0; x < DtaBrang.length; x++)
                    {
                        DtaBrang[x] = new Barang();
                        System.out.println("Barang ke : " +(x+1));
                        System.out.println("Masukan kode barang : "); DtaBrang[x].setKodeBarang(InputUser.next());
                        System.out.println("Masukan Nama Barang : "); DtaBrang[x].setNamaBarang(InputUser.next());
                        System.out.println("Masukan Harga Barang : "); DtaBrang[x].setHargaBarang(InputUser.nextFloat());
                        System.out.println("Masukan Jumlah Barang : "); DtaBrang[x].setJumlahBeli(InputUser.nextInt());
                        System.out.println("Masukan Uang Bayar: "); DtaBrang[x].setBayar(InputUser.nextFloat());
                    }
                    break;
                case 2:
                    System.out.println("DATA PENJUALAN BARANG");
                    System.out.println("PT. JALAN AJA DULU");
                    System.out.println("Nama Kelompok : " +NamaKasir);
                    System.out.println("=================================================================================");
                    System.out.println("No. \t Kode Barang \t Nama Barang \t  Harga Barang");
                    System.out.println("====================================================");
                    for(x = 0; x < DtaBrang.length; x++)
                    {
                        System.out.println((x + 1)+ "\t" +DtaBrang[x].getKodeBarang()+ "\t" + "\t" + DtaBrang[x].getNamaBarang() + "\t"+"\t" + DtaBrang[x].getHargaBarang());
                        JumlahBayar = (float) (JumlahBayar +DtaBrang[x].getTotal());
                        JumlahBeli = (JumlahBeli +DtaBrang[x].getJumlahBeli());
                        Pembayaran = (Pembayaran +DtaBrang[x].getBayar());
                        Kembalian = (float) (Kembalian +DtaBrang[x].getKembalian());
                        
                        
                    }
                                    
                    System.out.println("====================================================");
                    System.out.println("Jumlah Beli: " +JumlahBeli);
                    System.out.println("Jumlah Bayar: " +kursIndonesia.format(JumlahBayar));
                    System.out.println("Pembayaran :" +kursIndonesia.format(Pembayaran));
                    System.out.println("Kembalian :" +kursIndonesia.format(Kembalian));
                    System.out.println("Tanggal Pembelian: "+UbahStrng.format(Tgl));
                    
            }
            
        } while(pilihan != 3);
        
        
        
        
        
    }

    
}
