/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1pbo;

import static tugas1pbo.Main.suhuCelci;

/**
 *
 * @author MSI1
 */
public class Konversi {
    double konversiFahrenheit(){
        return(Main.suhuCelci*9/5+32);
    }
    double konversiReamur(){
        return(Main.suhuCelci*4/5);
    }
    double konversiKelvin(){
        return(Main.suhuCelci+273.15);
    }
}
