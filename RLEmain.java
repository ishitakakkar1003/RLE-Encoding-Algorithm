package app;

public class RLEmain {

   public static void main(String[] args) throws Exception{
   
      RLEconverter con = new RLEconverter ();
      /* run main to call compress to generate RLE_java.txt  */
      con.compressFile("java.txt");
      /* then comment out the call to compress, uncomment the call to decompress.
         then run main to generate RLE_java.txt  */
   //   con.decompressFile("RLE_java.txt");
   }
}