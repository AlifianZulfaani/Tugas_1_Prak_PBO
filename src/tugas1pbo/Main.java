/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1pbo;
import java.util.Scanner;

/**
 *
 * @author MSI1
 */
public class Main {
    static double suhuCelci;
    static int pilih;
    
    public static void main(String[] args) {
        Konversi suhu = new Konversi();
        
        double celcius ,fahrenheit, reamur, kelvin;
        boolean kondisi = false;
        Scanner input = new Scanner(System.in);
        
        System.out.println("|-------------------------|");
        System.out.println("+Program Konversi Suhu Air+");
        System.out.println("|-------------------------|");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Masukkan suhu celcius = ");
        suhuCelci = input.nextDouble();
        
        while(kondisi!=true){                        
            System.out.println("\nOpsi");
            System.out.println("-----");
            System.out.println("1. Lihat");
            System.out.println("2. Edit");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    fahrenheit = suhu.konversiFahrenheit();
                    reamur = suhu.konversiReamur();
                    kelvin = suhu.konversiKelvin();
                    if(suhuCelci<=0){
                        System.out.println("\nCelcius = "+suhuCelci+" C");
                        System.out.println("Fahrenheit = "+fahrenheit+" F");
                        System.out.println("Reamur = "+reamur+" R");
                        System.out.println("Kelvin = "+kelvin+" K");
                        System.out.println("Kondisi air membeku");
                    }
                    else if(suhuCelci<100){
                        System.out.println("\nCelcius = "+suhuCelci+" C");
                        System.out.println("Fahrenheit = "+fahrenheit+" F");
                        System.out.println("Reamur = "+reamur+" R");
                        System.out.println("Kelvin = "+kelvin+" K");
                        System.out.println("Kondisi air normal");
                    }
                    else if(suhuCelci>=100){
                        System.out.println("\nCelcius = "+suhuCelci+" C");
                        System.out.println("Fahrenheit = "+fahrenheit+" F");
                        System.out.println("Reamur = "+reamur+" R");
                        System.out.println("Kelvin = "+kelvin+" K");
                        System.out.println("Kondisi air mendidih");
                    }
                    break;
                case 2:
                    System.out.println("\nInput Data");
                    System.out.println("----------");
                    System.out.print("Masukkan suhu celcius = ");
                    suhuCelci = input.nextDouble();
                    break;
                case 3:
                    kondisi=true;
                    break;
                default:
                    System.out.println("\nOpsi tidak ada, mohon masukkan opsi dengan benar!");
            }
        }
    }
}
