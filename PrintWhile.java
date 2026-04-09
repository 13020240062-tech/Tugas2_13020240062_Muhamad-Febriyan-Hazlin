/*Nim : 13020240062
 Nama :	Muhamad Febriyan Hazlin
 Tanggal & Waktu : 09 April 2026 / 10.27
*/
import java.util.Scanner; 
 
/* Baca N, Print i = 1 s/d N dengan WHILE */  
public class PrintWhile { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* Kamus : */  
  int N; 
  int i; 
  Scanner masukan=new Scanner(System.in); 
  /* Program */ 
 
  System.out.print ("Nilai N >0 = "); /* Inisialisasi */  
  N = masukan.nextInt();  
  i = 1; /* First Elmt */ 
 
  System.out.print ("Print i dengan WHILE: \n");  
  while (i <= N) /* Kondisi pengulangan */ 
  { System.out.println (i); /* Proses */ 
 
  i++; /* Next Elmt */ 
 
  }; /* (i > N) */ 
 
 } 
 
}