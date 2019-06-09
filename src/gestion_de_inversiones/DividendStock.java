/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_de_inversiones;

/**
 *
 * @author jdiazga
 */
public class DividendStock extends Stock {
    private double dividends;
    
    public DividendStock(String symbol, double total_cost, double current_price,int total_shares,double dividends) {
        super(symbol, total_cost, current_price,total_shares);
        this.dividends = dividends;
    }
    
    @Override
    public double getMarketValue(){
        return super.getMarketValue()+dividends;
    }
}
