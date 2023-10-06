package InheritanceAssignment;
class Vehicle{
	float mileage;
	int price;
	public Vehicle(float mileage, int price) {
		super();
		this.mileage = mileage;
		this.price = price;
	}
}
class Car extends Vehicle{
	int ownershipCost;
	int warranty;
	int seatingCapacity;
	String fuelType;
	public Car( float mileage, int price, int ownershipCost, int warranty, int seatingCapacity, String fuelType) {
		super(mileage, price);
		this.ownershipCost = ownershipCost;
		this.warranty = warranty;
		this.seatingCapacity = seatingCapacity;
		this.fuelType = fuelType;
	}
	
}
class Bike extends Vehicle{
	int numOfCylinders;
	int numOfGears;
	String coolingType;
	String wheelType;
	int fuelTankSize;
	public Bike( float mileage, int price, int numOfCylinders, int numOfGears, String coolingType, String wheelType, int fuelTankSize) {
		super(mileage, price);
		this.numOfCylinders = numOfCylinders;
		this.numOfGears = numOfGears;
		this.coolingType = coolingType;
		this.wheelType = wheelType;
		this.fuelTankSize = fuelTankSize;
	}
	
}
class Audi extends Car{
	String ModelType;
	public Audi(float mileage, int price, int ownershipCost, int warranty, int seatingCapacity, String fuelType,String ModelType) {
		super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
		this.ModelType=ModelType;
	}
	@Override
	public String toString() {
		return "Audi ownershipCost=" + ownershipCost + ", warranty=" + warranty + ", seatingCapacity="
				+ seatingCapacity + ", fuelType=" + fuelType + ", mileage=" + mileage + ", price=" + price
				+ ", ModelType=" + ModelType;
	}
	
}
class Ford extends Car{
	String ModelTYpe;
	public Ford(float mileage, int price, int ownershipCost, int warranty, int seatingCapacity, String fuelType, String ModelType) {
		super(mileage, price, ownershipCost, warranty, seatingCapacity, fuelType);
		this.ModelTYpe=ModelType;
	}
	@Override
	public String toString() {
		return "Ford OwnershipCost=" + ownershipCost + ", warranty=" + warranty + ", seatingCapacity="
				+ seatingCapacity + ", fuelType=" + fuelType + ", mileage=" + mileage + ", price=" + price
				+ ", ModelTYpe=" + ModelTYpe;
	}
	
}
class Bajaj extends Bike{
	String MakeType;
	public Bajaj(float mileage, int price, int numOfCylinders, int numOfGears, String coolingType, String wheelType,
			int fuelTankSize, String MakeType) {
		super(mileage, price, numOfCylinders, numOfGears, coolingType, wheelType, fuelTankSize);
		this.MakeType=MakeType;
	}
	@Override
	public String toString() {
		return "Bajaj Mileage=" + mileage + ", price=" + price + ", numOfCylinders=" + numOfCylinders + ", numOfGears="
				+ numOfGears + ", coolingType=" + coolingType + ", wheelType=" + wheelType + ", fuelTankSize="
				+ fuelTankSize + ", MakeType=" + MakeType;
	}
	
	
}
class TVS extends Bike{
	String MakeType;
	public TVS(float mileage, int price, int numOfCylinders, int numOfGears, String coolingType, String wheelType,
			int fuelTankSize, String MakeType) {
		super(mileage, price, numOfCylinders, numOfGears, coolingType, wheelType, fuelTankSize);
		this.MakeType=MakeType;
	}
	@Override
	public String toString() {
		return "TVS Mileage=" + mileage + ", price=" + price + ", numOfCylinders=" + numOfCylinders + ", numOfGears="
				+ numOfGears + ", coolingType=" + coolingType + ", wheelType=" + wheelType + ", fuelTankSize="
				+ fuelTankSize + ", MakeType=" + MakeType;
	}
	
}
public class VehicleTest {
	public static void main(String[] args) {
		Audi a = new Audi(20.0f,50000,20000,3,4,"Petrol","A6");
		System.out.println(a.toString());
		Ford f= new Ford(25.5f,2000000,10000,3,5,"Diesel","Endeavour");
		System.out.println(f.toString());
		Bajaj b = new Bajaj(28.7f,50000,1,4,"Air","Alloys",15,"Pulsar");
		System.out.println(b.toString());
		TVS t = new TVS(30.0f,30000,2,5,"Liquid","Spokes",12,"Apache");
		System.out.println(t.toString());
	}

}
