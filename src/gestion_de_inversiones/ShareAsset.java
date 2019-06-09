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
public abstract class ShareAsset implements Asset {
  protected String symbol;
  protected double total_cost;
  protected double current_price; 
  protected double total_Shares;

    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public double getTotal_cost() {
        return total_cost;
    }
    public void setTotal_cost(double total_cost) {
        this.total_cost = total_cost;
    }
    public double getCurrent_price() {
        return current_price;
    }
    public void setCurrent_price(double current_price) {
        this.current_price = current_price;
    }
    public double getTotal_Shares() {
        return total_Shares;
    }
    public void setTotal_Shares(double total_Shares) {
        this.total_Shares = total_Shares;
    }
    
    @Override
    public double getProfit(){
    return (total_Shares*current_price)-total_cost;
    }
   @Override
    public abstract double getMarketValue();

    public ShareAsset(String symbol, double total_cost, double current_price, double total_Shares) {
        this.symbol = symbol;
        this.total_cost = total_cost;
        this.current_price = current_price;
        this.total_Shares = total_Shares;
    }
    
    
}
