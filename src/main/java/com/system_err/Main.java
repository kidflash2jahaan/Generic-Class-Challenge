package com.system_err;

public class Main {
    public static void main(String[] args) {
        Layer<Mappable> layer = new Layer<>("Gyatt");
        
        layer.addElement(new Park(new double[]{1, 1}, "Gyatt Park"));
        layer.addElement(new River(new double[][]{{2, 2}, {3, 3}}, "Gyatt River"));

        System.out.println(layer.map());
    }
}