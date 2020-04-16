package com.company;

public class Printer {
    private int Tonerlevel;
    private int pages_printed;
    private boolean duplexPrinter;

    public Printer(int tonerlevel, boolean duplexPrinter) {
        if(tonerlevel >=0 && tonerlevel<= 100){
            Tonerlevel = tonerlevel;
        }
        this.duplexPrinter = duplexPrinter;
    }
    public void FillToner(){
        this.Tonerlevel = 100;
        System.out.println("Toner filled" + this.Tonerlevel);
    }
    public void Toner_level(){
        this.Tonerlevel = this.Tonerlevel - (pages_printed / 4);
        System.out.println("Toner Level Ramaining "+ this.Tonerlevel);
    }

    public void simulate_printing(int pages){
        if(this.duplexPrinter){
            pages = (pages / 2) + (pages % 2);
            System.out.println("No.of pages printed " + pages);
            this.pages_printed = pages;
        }
        else{
            System.out.println("No. of pages printed "+ pages);
            this.pages_printed += pages;
        }


    }



    public int getTonerlevel() {
        Toner_level();
        return Tonerlevel;
    }

    public int getPages_printed() {
        return pages_printed;
    }

    public boolean getDuplexPrinter() {
        return duplexPrinter;
    }
}
