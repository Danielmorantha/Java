/*
NAMA    : DANIEL MORANTHA
NIM     : 2019230088
 */
public class main 
{
 
  public static void main(String[] args)
  {
      //Objek Class Manusia
      ClassManusia Manusia = new ClassManusia();

      System.out.println("Nama Saya "+Manusia.nama+ "\nLahir Tahun : " +Manusia.TahunLahir);
      System.out.println("Jenis Kelamin : "+Manusia.JenisKelamin+"\n Berat badan : "+Manusia.Berat+ " Kg");
      System.out.println("Status :\n" +Manusia.Status);
      System.out.println("");
      
      //Method
      Manusia.belajar();
      Manusia.berdoa();
      Manusia.berlari();
      Manusia.makan();
      Manusia.minum();

      System.out.println("");
      
      
      //Objek Class Mobil
      Mobil mobil = new Mobil();
      
      System.out.println("Merek Mobil : " +mobil.merek+ "\nTipe mobil : " +mobil.Tipe);
      System.out.println("Tahun Mobil : " +mobil.year+ "\nWarna Mobil : " +mobil.Warna);
      System.out.println("Harga Mobil Rp." +mobil.Harga);
      System.out.println("");
      
      
      /*Method*/
      mobil.Maju();
      mobil.Mundur();
      mobil.Belok_kanan();
      mobil.Belok_kiri();
      mobil.isi_bensin();
      mobil.isi_angin_ban();
     
      
      System.out.println("");
      
      /*Objek Class Rumah*/
      ClassRumah Rumah  = new ClassRumah();
      
      System.out.println("Rumah Mempunyai " +Rumah.Kamar+ " Kamar\n"+" Rumah Mempunyai " +Rumah.Kamar_Mandi+ " Kamar Mandi");
      System.out.println("\nRumah Mempunyai" +Rumah.Ruang_Makan+ "Ruang Makan" + "\n Rumah Mempunyai " +Rumah.Ruang_Tamu+ " Ruang Tamu");
      System.out.println("\nRumah Mempunyai " +Rumah.Garasi+ " Garasi");
      System.out.println("");
      
      /*Method*/
      Rumah.Melindungi_Segala_Cuaca();
      Rumah.Membuka_Pintu();
      Rumah.Menyalakan_Lampu();
      Rumah.cat_rumah();
      Rumah.perbaikan();
      
      System.out.println("");
      
      
      /* Objek Class Komputer */
      ClassKomputer Komputer    = new ClassKomputer();
      
      System.out.println("Merek Komputer : " +Komputer.Merek+ "\nDengan Graphic : " +Komputer.Graphic);
      System.out.println("Motherboard Komputer : " +Komputer.Motherboard+ "\nMouse Komputer" +Komputer.Mouse);
      System.out.println("Graphic Komputer : " +Komputer.Graphic+ "OS Komputer : " +Komputer.Operator_System);
      System.out.println("");
      
      /* Method */
      Komputer.Bermain_Game();
      Komputer.Membuat_Permainan();
      Komputer.Mendownload_APP();
      Komputer.Menonton_Video();
      Komputer.mengetik();
      
      
      System.out.println("");
      
      
      /* Objek Class Handphone */
      ClassHP Handphone = new ClassHP();
      
      System.out.println("Merek Handphone : " +Handphone.Merek+ "\nRAM Handphone : " +Handphone.RAM);
      System.out.println("Volume Handphone : " +Handphone.Volume_Baterai+ " mAH"+ "\nROM Handphone" +Handphone.ROM);
      System.out.println("OS Handphone : " +Handphone.Operator_System);
      System.out.println("");
      
      /* Method */
      Handphone.Bermain_Game();
      Handphone.Membuat_Program();
      Handphone.Mendownload_APP();
      Handphone.Menonton_Video();
      Handphone.mengetik();
  }
  
  
      
}
