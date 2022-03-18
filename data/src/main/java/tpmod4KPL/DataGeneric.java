/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpmod4KPL;

/**
 *
 * @author jeremiacarlo
 */
public class DataGeneric {
    private data T;
    public DataGeneric(String T) {
        this.T = new data(T);
    }
    public void printData(){
        System.out.printf("Data yang tersimpan adalah: %s",this.T.dat);
    }

    public static void main(String[] args) {
        DataGeneric x = new DataGeneric("1302204115");
        x.printData();
    }
}
