package base;

public class MyInteger {
	private int iValue;{
	}
	public MyInteger(int iValue){
		this.iValue=iValue;
	}
	public int getiValue(){
		return iValue;
	}
	public boolean isOdd(){
		if (getiValue() % 2 !=0){
			return true;
		}
		return false;
	}
	public boolean isEven(){
		if(getiValue() % 2==0){
			return true;
		}
		return false;
	}
	
	public boolean isPrime(){
		for (int i=2; i<getiValue();i++){
			if(getiValue()%i==0)
				return false;
			
		}
		return true;
	}
	public static boolean isOdd(int ivalue){
		if (ivalue % 2 !=0){
			return true;
		}
		return false;
	}
	public static boolean isEven(int ivalue){
		if (ivalue % 2 ==0){
			return true;
		}
		return false;
	}
	public static boolean isPrime(int ivalue){
		for(int i=2;i<ivalue;i++){
			if(ivalue%i==0)
				return false;
		}
		return true;
	}
	public static boolean isOdd(MyInteger thevalue){
		return thevalue.isOdd();
		}
	public static boolean isEven(MyInteger thevalue){
		return thevalue.isEven();
		}
	public static boolean isPrime(MyInteger thevalue){
		return thevalue.isPrime();
	}
	public boolean equals(int thevalue){
		return iValue==thevalue;
	}
	public boolean equals2(MyInteger thevalue){
		return thevalue.equals(thevalue.getiValue());
	}
	
	

}
