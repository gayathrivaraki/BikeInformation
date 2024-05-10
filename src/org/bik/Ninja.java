package org.bik;

public class Ninja extends BMW {
@Override
	public void mileage(float km)
	{
		System.out.println("Mileage : " +km);
	}
@Override
	public void enginePower(int cc)
	{
		System.out.println("EnginePower : " + cc);
	}

private void price(float price)
{
	System.out.println("price : " + price);
	}
private void model(String model)
{
	System.out.println("model : " + model);
	}
private void speed(int speed)
{
	System.out.println("speed : " + speed);
	}

	public static void main(String[] args) {
		
		Ninja obj=new Ninja();
		obj.mileage(150);
		obj.enginePower(76);
		obj.price(15057.8f);
		obj.model("A7");
		obj.speed(200);
	}

}
