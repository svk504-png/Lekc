package org.example.pages;

public class Box {
    private double width;
    private double height;
    private double depth;

        public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Box{" + "ширина=" +width +", высота=" +height +", глубина=" +depth +"}";
    }
}
