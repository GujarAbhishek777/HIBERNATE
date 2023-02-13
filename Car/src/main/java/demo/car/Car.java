package demo.car;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;

@Entity
@Table
public class Car {
	@Id
	private int id;
	private String name;
	private String brand;
	private String color;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
  
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car c=new Car();
		c.setId(102);
		c.setBrand("AGX");
		c.setName("ZUBA");
		c.setColor("Silver");
		c.setPrice(500000000);
		
		//save
		//et.begin();
		//em.persist(c);
		//et.commit();
		
		//Update
		
//		et.begin();
//		em.merge(c);
//		et.commit();
		
		//find
		
//		Car c1=em.find(Car.class,101);
//		
//		if(c1!=null) {
//		System.out.println(c1);
//		}
//		else {
//			System.out.println("Id is not found");
//		}
		
		//delete
		
//		Car c2=em.find(Car.class,101);
//		
//		if(c2!=null) {
//			et.begin();
//			em.remove(c2);
//			et.commit();
//		}else {
//			System.out.println("Id not found and data not deleted");
//		}
		
		//findAll
		
		Query q=em.createQuery("select c from Car c");
		List<Car> l=q.getResultList();
		System.out.println(l);;
	}
}
