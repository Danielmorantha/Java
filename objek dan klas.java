/*  NAMA    : DANIEL MORANTHA
    NIM     : 2019230088
*/


/*class box*/
class Box 
{
    /*atribut*/
    double lebar;
    double tinggi;
    double kedalaman;
        
}

/*objek*/
class BoxHitung
{
    public static void main (String args[]) 
    {
        Box boxsaya    = new Box(); /*mencipyakan objek dari suatu kelas*/
        double vol;
        
        /*objek*/
        boxsaya.lebar     = 10;
        boxsaya.tinggi    = 20;
        boxsaya.kedalaman = 15;
        

        vol = boxsaya.lebar * boxsaya.tinggi * boxsaya.kedalaman;
        
        System.out.println("Luas Box Adalah "+vol);
    }
   
}