package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(100,true);
        printer.simulate_printing(20);
        printer.getTonerlevel();
        printer.simulate_printing(40);
        printer.getTonerlevel();
        printer.FillToner();
    }
}
