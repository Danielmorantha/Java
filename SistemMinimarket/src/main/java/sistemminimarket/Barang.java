
        
package sistemminimarket;

import java.util.Date;

/**
 *
 * @author Daniel Morantha (2019231472628)
 * @author Deo andika (2017240048)
 * @author Muhammad Rafli (2020230062)
 * @author Chandra Philanthrope Renomme (2019230041)
 */

public class Barang 
{

    String KodeBarang, NamaBarang;
    float HargaBarang, bayar;
    int JumlahBeli;
    float total, kembalian;
    Date TanggalPembelian;

    
    
    
    public Date getTanggalPembelian() {
        return this.TanggalPembelian;
    }

    public void setKembalian(float kembalian) {
        this.kembalian = kembalian;
    }

    public float getBayar() {
        return bayar;
    }

    public void setBayar(float bayar) {
        this.bayar = bayar;
    }

    public String getKodeBarang() {
        return KodeBarang;
    }

    public void setKodeBarang(String KodeBarang) {
        this.KodeBarang = KodeBarang;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String NamaBarang) {
        this.NamaBarang = NamaBarang;
    }

    public float getHargaBarang() {
        return HargaBarang;
    }

    public void setHargaBarang(float HargaBarang) {
        this.HargaBarang = HargaBarang;
    }

    public int getJumlahBeli() {
        return JumlahBeli;
    }

    public void setJumlahBeli(int JumlahBeli) {
        this.JumlahBeli = JumlahBeli;
    }

    public double getTotal()
    {
        total = HargaBarang * JumlahBeli;
        return total;
    }
    
    public double getKembalian()
    {
        
        kembalian = bayar - total;
        return kembalian;
    
    }
    
    
}
