package org.example;

import org.example.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape() {}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color c) {
        this.color = c;
    }

    public abstract Double area();
}
