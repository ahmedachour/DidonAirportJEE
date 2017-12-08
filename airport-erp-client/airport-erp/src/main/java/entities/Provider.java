package entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Provider
 *
 */
@Entity
@Table(name = "t_provider")
public class Provider implements Serializable {

	
	private Integer id;
	private String managerName;
	private String companyName;
	private String email;
	private String password;
	private Integer phoneInteger;
	private static final long serialVersionUID = 1L;
	
	private List<Meal> meals;

	public Provider() {
		super();
	}  
	
	
	
	public Provider(String managerName, String companyName, String email,
			String password, Integer phoneInteger) {
		super();
		this.managerName = managerName;
		this.companyName = companyName;
		this.email = email;
		this.password = password;
		this.phoneInteger = phoneInteger;
	}



	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getManagerName() {
		return this.managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}   
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}   
	
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public Integer getPhoneInteger() {
		return this.phoneInteger;
	}

	public void setPhoneInteger(Integer phoneInteger) {
		this.phoneInteger = phoneInteger;
	}


	@OneToMany(mappedBy = "provider", cascade = CascadeType.MERGE )
	public List<Meal> getMeals() {
		return meals;
	}

	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}
	
	public void linkMealsToThisProvider(List<Meal> meals) {
		this.meals = meals;
		for (Meal m : meals) {
			m.setProvider(this);
		}
	}
   
}
