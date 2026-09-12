
public class Program {

	public static void main(String[] args) {
		//methods are not allocated memory only members have
		Base obj=new Base();  //obj->reference of base class pointing to an object base
		obj.display();
		
		Derived obj1=new Derived();
		obj1.show();
		obj.num1=4;
		System.out.println(obj.num1);
		
		Base obj2 =new Base();
		Derived data=new Derived();
		obj2=data;
		System.out.println(obj2);
		
		Base obj4=null;
		data=(Derived)obj4;
		System.out.println(data);
		
		data=(Derived)obj2;
		System.out.println(data);
		data.num3=8;
		System.out.println(data.num3);
		
		DerivedMost obj5=new DerivedMost();
		obj5.showw();
		
		Base obj6=new Derived(); //upcasting why->bcoz of generalized
		obj6.num3=9;
		System.out.println(obj6.num3);
		
		
		
	}

}
