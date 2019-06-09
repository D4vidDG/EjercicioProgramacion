/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_de_inversiones;

import java.util.*;
import java.io.*;

public class Empresa {
    private ArrayList stocks;
    private ArrayList cash;
    private ArrayList divstocks;
    private Scanner read_entry; 
    private PrintStream out;
    private Scanner read_out;
    public Empresa(File entrada,File salida) throws FileNotFoundException {
        this.read_entry=new Scanner (entrada);
        this.read_entry.useDelimiter(",");
        this.read_out=new Scanner (salida);
        this.read_out.useDelimiter(",");
        this.out=new PrintStream (salida);
    }
    
    
    public void decrypt_write(){
        while(read.hasNext()){
        if(!read.hasNextInt()){
        String word=read.next(); 
        char[] word_array = word.toCharArray();
        for(int i=0;i<word.length();i++){
        if(word_array[i]=='\n'){
        out.print("\n");
        }else{
         int new_char= (word_array[i]-68)%26;
         if(new_char >= 0){
         word_array[i]=(char) (new_char+65);
         out.print(word_array[i]);
         out.flush();
        }else{
         word_array[i]=(char) (new_char+91);
         out.print(word_array[i]);
         out.flush(); 
         }
        }
        }
        out.print(",");
        out.flush();           
}
        if(read.hasNextInt()){
     out.print(read.nextInt()+",");
     out.flush();
    }  
    }
        out.close();
}  
    public void add_see_info(boolean ver_info){
        int count_cash=1;
        int stock=1;
        int div=1;
        while(this.read_out.hasNext()){
            String asset=read_out.next().trim();
           switch(asset){
               case "CASH":
                   int amount=read_out.nextInt();
                   this.cash.add(new Cash(amount));
                   System.out.println("Cash"+" "+cash+"------------");
                   System.out.println("Amount:"+amount);
                   count_cash++;
                   break;
               case "STOCK":
                   String symbol=read_out.next();
                   double cost=read_out.nextDouble();
                   double price=read_out.nextDouble();
                   int shares=read_out.nextInt();
                   this.stocks.add(new Stock (symbol,cost,price,shares));
                   System.out.println("Stock"+" "+stock+"------------");
                   System.out.println("Symbol:"+symbol);
                   System.out.println("Total cost:"+cost);
                   System.out.println("Current price:"+price);
                   System.out.println("Total shares:"+shares);
                   stock++;
                   break;
               case "DIVSTOCK":
                   String div_symbol=read_out.next();
                   double div_cost=read_out.nextDouble();
                   double div_price=read_out.nextDouble();
                   int div_shares=read_out.nextInt();
                   double dividends=read_out.nextDouble();
                   this.divstocks.add(new DividendStock(div_symbol, div_cost, div_price, div_shares, dividends));
                   System.out.println("DividendStock"+" "+stock+"------------");
                   System.out.println("Symbol:"+div_symbol);
                   System.out.println("Total cost:"+div_cost);
                   System.out.println("Current price:"+div_price);
                   System.out.println("Total shares:"+div_shares);
                   div++;
                   break;
           } 
        }
    }
   
}