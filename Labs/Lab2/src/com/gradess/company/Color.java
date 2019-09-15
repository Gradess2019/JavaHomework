package com.gradess.company;



public class Color extends java.awt.Color {

	public Color(int r, int g, int b) {
		super(r, g, b);
	}

	@Override
	public String toString() {
		return "R = " + getRed() + "\tG = " + getGreen() + "\tB = " + getBlue();
	}
}
