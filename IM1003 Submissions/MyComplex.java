

public class MyComplex {
	private double real,imag;
	
	public MyComplex() {
		this.real = 0.0;
		this.imag = 0.0;
	}
	public MyComplex(double real,double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return this.real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return this.imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real,double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return String.format("%s+%si",this.real,this.imag);
	}
	
	public boolean isReal() {
		return (this.imag==0.0) ? true : false;
	}
	
	public boolean isImaginary() {
		return (this.real==0.0) ? true : false;
	}
	
	public boolean equals(double real,double imag) {
		return (this.real==real && this.imag==imag) ? true : false;
	}
	public boolean equals(MyComplex another) {
		return (this.real==another.getReal() && this.imag==another.getImag()) ? true : false;
	}
	
	public double magnitude() {
		return Math.sqrt(this.real*this.real + this.imag*this.imag);
	}
	
	public MyComplex addInto(MyComplex right) {
		this.real += right.getReal();
		this.imag += right.getImag();
		return this;
	}
	
	public MyComplex addNew(MyComplex right) {
		MyComplex result = new MyComplex();
		result.addInto(this);
		result.addInto(right);
		return result;
	}
}
