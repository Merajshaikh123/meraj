package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.Factory.Factory;
import com.mindgate.pojo.Shapes;



public class ShapeMain {
	public static void main(String[] args) {
		
		Scanner st=new Scanner(System.in);
		System.out.println("1.  cirlce");
		System.out.println("2.  Triangle");
		System.out.println("3.  Square");
		
		System.out.println("enter choice");
		int choice=st.nextInt();
		
		Shapes shapes=Factory.getshape(choice);
		if(shapes !=null)
			shapes.draw();
		else
			System.out.println("invalid shape choice");
		
	}

}
