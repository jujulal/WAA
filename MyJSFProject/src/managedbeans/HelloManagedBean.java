package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloManagedBean {

	@ManagedProperty(value="#{name}")
	private String name; 
		
	public HelloManagedBean(){
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name; 
	}
	
	public String sayHello(){
		return null; 
	}
}
