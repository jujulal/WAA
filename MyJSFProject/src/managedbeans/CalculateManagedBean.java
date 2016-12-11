package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "calculate")
@RequestScoped
public class CalculateManagedBean {

	
	private String firstNumber;
	private String secondNumber;
	private String result;

	public String getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(String firstNumber) {
		this.firstNumber = firstNumber;
	}


	public String getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(String secondNumber) {
		this.secondNumber = secondNumber;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	//for adding numbers
	public String getAdd(){
		String r = "" + (new Double(this.firstNumber) + new Double(this.secondNumber)); 
		setResult(r);
		
		//System.out.println("Added numbers:" + result);
		return null;
	}

	//for subtract numbers
	public String getSubtract(){
		String r = "" + (new Double(this.firstNumber) - new Double(this.secondNumber)); 
		setResult(r);

		return null;
	}
	
	//for multiply
	public String getMultiply(){
		String r = "" + (new Double(this.firstNumber) * new Double(this.secondNumber)); 
		setResult(r);
		
		return null;
	}
	
	//for divide
	public String getDivide(){
		String r = "" + (new Double(this.firstNumber) / new Double(this.secondNumber)); 
		setResult(r);
		return null;
	}
	
}
