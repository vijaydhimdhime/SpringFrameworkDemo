package com.vijay.refernceType;

public class Pin {
	private int pin;

	public Pin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pin(int pin) {
		super();
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Pin [pin=" + pin + "]";
	}
	

}
