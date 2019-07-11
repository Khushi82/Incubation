package com.epam.incubation;


interface Vehicle
{
	String getName();
	float getSpeed();
	float getAverage();
	default void status ()
	{
		System.out.println("The status of the vehicle is good");
	}
		
}

class Car implements Vehicle
{

	String name;
	float speed;
	float average;

	Car(String name, float speed, float average)
	{
		this.name=name;
		this.speed=speed;
		this.average=average;
	}
	public String getName() {
		
		return name;
	}

	public float getSpeed() {
		
		return speed;
	}

	public float getAverage() {
		
		return average;
	}
	
}



public class CarImplement {
	
	
	public static void main(String[] args) {
		
		Vehicle car = new Car("Honda",25,10);
		System.out.println(car.getName());
		System.out.println(car.getSpeed());
		car.status();
		
	}
	
	
	

}
