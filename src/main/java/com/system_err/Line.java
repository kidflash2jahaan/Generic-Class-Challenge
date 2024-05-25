package com.system_err;

import java.util.Arrays;

public class Line implements Mappable {
    private final double[][] points;
    private final String name;

    public Line(double[][] points, String name) {
        this.points = points;
        this.name = name;
    }

    @Override
    public String map() {
        return toString();
    }

    @Override
    public String toString() {
        return "RENDER \"" + name + "\" AS " + this.getClass().getSimpleName().toUpperCase() + " (" + Arrays.deepToString(points) + ")";
    }
}
