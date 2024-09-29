package F;

import java.util.*;


public class Equation {
	public static void giaiPTbac1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap a: ");
		double a = input.nextDouble();
		System.out.println("Nhap b: ");
		double b = input.nextDouble();
	if(a == 0) {
		if(b==0) {
			System.out.println("PT vo so nghiem");
		}else {
			System.out.println("PT vo nghiem");
		}
	}else {
		double x = -b/a;
		System.out.println("PT co nghiem: " + x);
	}
	}
	public static void giaihePTbac1() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap a11: ");
		double a11 = input.nextDouble();
		System.out.println("Nhap a12: ");
		double a12 = input.nextDouble();
		System.out.println("Nhap a21: ");
		double a21 = input.nextDouble();
		System.out.println("Nhap a22: ");
		double a22 = input.nextDouble();
		System.out.println("Nhap b1: ");
		double b1 = input.nextDouble();
		System.out.println("Nhap b2: ");
		double b2 = input.nextDouble();
		double D = a11 * a22 - a21 * a12;
	    double D1 = b1 * a22 - b2 * a12;
	    double D2 = a11 * b2 - a21 * b1;
	    if(D == 0) {
	    	if(D1 == 0 && D2 == 0) {
	    		System.out.println("He PT vo so nghiem");
	    	} else {
	    		System.out.println("He PT vo nghiem");
	    	}
	    }else {
	    	double x1 = D1/D;
	    	double x2 = D2/D;
	    	System.out.println("Nghiem cua he PT la" + x1 + "va" + x2);
	    }
	}
	public static void giaiPTbac2() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap a: ");
		double a = input.nextDouble();
		System.out.println("Nhap b: ");
		double b = input.nextDouble();
		System.out.println("Nhap c: ");
		double c = input.nextDouble();
		 if (a == 0) {
	            System.out.println("Day la PT bac 1");
	            giaiPTbac1();
	        } else {
	            double delta = b * b - 4 * a * c;
	            if (delta < 0) {
	                System.out.println("PT vo nghiem");
	            } else if (delta == 0) {
	                double x = -b / (2 * a);
	                System.out.println("PT co nghiem kep: " + x);
	            } else {
	                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	                System.out.println("PT co 2 nghiem phan biet: " + x1 + "va " + x2);
	            }
	        }
	    }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Lua chon: ");
			System.out.println("1.Giai pt bac nhat 1 an");
			System.out.println("2.Giai he pt bac nhat");
			System.out.println("3.Giai he pt bac hai 1 an");
			System.out.println("4.Thoat");
			
		int choice = input.nextInt();
		switch(choice) {
			case 1:
				giaiPTbac1();
				break;
			case 2:
				giaihePTbac1();
				break;
			case 3:
				giaiPTbac2();
				break;
			case 4:
				return;
			default:
				System.out.println("Error");	
			}	
		}
	}

}
