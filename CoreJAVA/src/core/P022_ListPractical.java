package core;

import java.util.ArrayList;
import java.util.List;

class Laptop{
	private int id;
	private int ram;
	private String model;
	private double price;
	Laptop(int id,int ram,String model,double price){
		this.id = id;
		this.ram = ram;
		this.model = model;
		this.price= price;
	}
	@Override
	public String toString() {
		return "id : "+id+" ram : "+ram+" model : "+model+" price : "+price;
	}
}
public class P022_ListPractical {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(1,8, "dell", 300000);
		Laptop l2 = new Laptop(2,12, "hp", 300000);
		Laptop l3 = new Laptop(3,14, "lenovo", 300000);
		Laptop l4 = new Laptop(4,16, "microsoft", 300000);
		Laptop l5 = new Laptop(5,20, "mac", 300000);
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		list.add(l5);
		System.out.println(list);
		for(Laptop l:list) {
			System.out.println(l);
		}
	}
}
