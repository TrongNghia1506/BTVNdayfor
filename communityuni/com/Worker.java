package communityuni.com;

import java.util.Scanner;

public class Worker extends Person{
	private String Position;
	private int NumberProduct;
	
	public Worker() {
		super();
	}
	
	public Worker(String Position, int NumberProduct)
	{
		this.Position = Position;
		this.NumberProduct = NumberProduct;
	}
	
	public Worker(String Id, String Name, int Age, String Address, String Position, int NumberProduct) {
		super(Id, Name, Age, Address);
		this.Position = Position;
		this.NumberProduct = NumberProduct;
	}
	
	public Worker(String Id, String Name, int Age, String Address)
	{
		super(Id, Name, Age, Address);
	}
	
	public String getPosition() {
		return Position;
	}
	
	public void setPosition(String Position) {
		this.Position = Position;
	}
	
	public int getNumberProduct() {
		return NumberProduct;
	}
	
	public void setNumberProduct(int NumberProduct) {
		this.NumberProduct = NumberProduct;
	}
	
	public void input(Scanner scanner, int index) {
		System.out.println("----Nhap vao cong nhan thu" + (index + 1) + "----");
		System.out.println("Nhap vao ma: ");
		this.setID(scanner.nextLine());
		System.out.println("Nhap vao ten: ");
		this.setName(scanner.nextLine());
		System.out.println("Nhap vao dia chi: ");
		this.setAddress(scanner.nextLine());
		System.out.println("Nhap vao chuc vu: ");
		this.setPosition(scanner.nextLine());
		System.out.println("Nhap vao tuoi: ");
		this.setAge(scanner.nextInt());
		System.out.println("Nhap vao so luong san phan: ");
		NumberProduct = scanner.nextInt();
	}
	
	float Money() {
		return this.NumberProduct * 120;
	}
	
	public void output(int index) {
		System.out.println("Cong nhan thu " + (index + 1) + ":");
		System.out.println("Ma cong nhan: "+ this.getID());
		System.out.println("Ten: "+ this.getName());
		System.out.println("Tuoi: "+ this.getAge());
		System.out.println("Dia chi: "+ this.getAddress());
		System.out.println("Chuc vu: "+ this.getPosition());
		System.out.println("So luong san pham: "+ this.getNumberProduct());
		System.out.println("Luong: " + this.Money());
	}
	
	
}
