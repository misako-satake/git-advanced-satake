package com.example;
/**
 * 
 * @author satakemisako
 *
 */
public class Car {
	private String name;//好きな名前
	private int speed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", speed=" + speed + "]";
	}
	
}
