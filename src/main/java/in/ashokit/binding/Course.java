package in.ashokit.binding;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="Course_dtls")


public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "cid")
	private Integer cid;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "name")
	private String name;
	
	public Course(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public Course() {
		
	}
	
	public String getName() { return name; }
	public Double getPrice() { return price; }
	public Integer getCid() { return cid; }
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
