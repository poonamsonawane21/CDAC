
public class Complex {

    int real;
    int imaginary;

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }
    
    //function for add
    Complex sum(Complex c) {
    	return new Complex(real+c.real,imaginary+c.imaginary);
    }
    
    
    //function for sub
    Complex difference(Complex c) {
    	return new Complex(real-c.real,imaginary-c.imaginary);
    }
    //function for add
    Complex product(Complex c) {
    	int r=(real*c.real)-(imaginary*c.imaginary);
    	int i=(real*c.real)+(imaginary*c.imaginary);
    	
    	return new Complex(r,i);
    }
   
    
}