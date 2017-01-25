
package assinment2.pkg1;

import java.util.Scanner;

class ComplexAirthmeticoperatoin
{
    Scanner sc = new Scanner(System.in);
    private double realPart;
    private double imagPart;

    public ComplexAirthmeticoperatoin(double realPart, double imagPart) {
        this.realPart += realPart;
        this.imagPart += imagPart;
    }
    public ComplexAirthmeticoperatoin() 
    {
        this.realPart = 0;
        this.imagPart = 0;
    }
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImagPart() {
        return imagPart;
    }

    public void setImagPart(double imagPart) {
        this.imagPart = imagPart;
    }
    
    public ComplexAirthmeticoperatoin add(ComplexAirthmeticoperatoin num1,ComplexAirthmeticoperatoin num2)
    {
       ComplexAirthmeticoperatoin CSum=new ComplexAirthmeticoperatoin();
       CSum.realPart=num1.realPart+num2.realPart;
       CSum.imagPart=num2.imagPart+num2.imagPart;
       return CSum;
    }
}
public class assignment3_1 

{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter real part of First complex number:");
        float C1Real=sc.nextFloat();
        System.out.print("Enter Imaginary part of First complex number:");
        float C1Imag=sc.nextFloat();
        System.out.print("Enter real part of Second complex number:");
        float C2Real=sc.nextFloat();
        System.out.print("Enter Imaginary part of Second complex number:");
        float C2Imag=sc.nextFloat();
        ComplexAirthmeticoperatoin C1 = new ComplexAirthmeticoperatoin(C1Real, C1Imag);
        ComplexAirthmeticoperatoin C2 = new ComplexAirthmeticoperatoin(C2Real, C2Imag);
        ComplexAirthmeticoperatoin C3=new ComplexAirthmeticoperatoin();
        C3=C3.add(C1,C2);
        String str="("+C1Real+"+"+C1Imag+"i),"+"("+C2Real+"+"+C2Imag+"i),";// + "+" C1Imag+"i)"+ "and ("+C2Real+"+"+C2Imag+"i"
        System.out.println("Input Complex Numbers are:"+str);
        System.out.println("Addition of above complex numbers are:" + C3.getRealPart() +"+" + C3.getImagPart()+"i");
      
    }
}
