/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_de_inversiones;
import java.util.*;
import java.io.*;
public class EjercicioProgramacion {
    public static void main(String[] args) throws FileNotFoundException {
   Empresa empresa1=new Empresa (new File ("datos.txt"),new File("datos_desencriptados.txt"));
   empresa1.decrypt_write();
   empresa1.add_see_info();
        System.out.println("Google and Samsung Stock profit:"+empresa1.google_samsung_total_MarketValue_profit());
        System.out.println("Total Profit:"+empresa1.total_profit());
        empresa1.each_asset_profit();
    
    }
    
}
