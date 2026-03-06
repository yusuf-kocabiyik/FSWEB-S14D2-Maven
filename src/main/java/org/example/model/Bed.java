package org.example.model;

public class Bed {
    private String style;
    private int pillows,height,sheets,quilts;

    public Bed(String style, int height, int pillows, int quilts, int sheets ) {
        this.height = height;
        this.pillows = pillows;
        this.quilts = quilts;
        this.sheets = sheets;
        this.style = style;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getSheets() {
        return sheets;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "height=" + height +
                ", style='" + style + '\'' +
                ", pillows=" + pillows +
                ", sheets=" + sheets +
                ", quilt=" + quilts +
                '}';
    }
}
