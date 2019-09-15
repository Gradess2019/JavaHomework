package com.gradess.company;

public class Hand {

	private float length;

	public Hand(float length) {
		this.length = length;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Длина руки: " + length;
	}
}
