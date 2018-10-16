package me.sumithpuri.github.kathmandu.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri

 * GitHub URL 			https://github.com/sumithpuri
 * Blog Post URL		http://www.techilashots.com/2015/05/java-se-5-whats-new-part-0104.html	
 * Blog Short URL		https://goo.gl/xWQkpw
 * Package Prefix 		me.sumithpuri.github.kathmandu
 * Project Codename		kathmandu
 * Contact E-Mail		code@sumithpuri.me
 * Contact WhatsApp		+91 9591497974
 *
 *
 * Permission is hereby  granted,  free  of  charge, to  any person  obtaining a  copy of  this  software and associated 
 * documentation files (the "Software"), to deal in the  Software without  restriction, including without limitation the 
 * rights to use, copy, modify, merge, publish, distribute, sub-license and/or sell copies of the Software and to permit 
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  all copies or substantial portions of the 
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS  OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE 
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES  OR  OTHER  LIABILITY, WHETHER IN AN ACTION  OF  CONTRACT, TORT OR 
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
public class jdk5_Generics {

	List<String> genericList = new ArrayList<String>();

	public static void main(String[] args) {
	
		demonstrate();
	}
	
	public static void demonstrate() {
		
		jdk5_Generics jGenerics = new jdk5_Generics();
		
		// generic for type safety
		List<String> jGenericsList = jGenerics.genericList;
		jGenericsList.add("Sumith");
		jGenericsList.add("Kumar");
		jGenericsList.add("Puri");
		
		for (String str : jGenericsList) {
			System.out.println(str);
		}
		
		// generic variables - class and method generic templates
		List<? extends Vehicle> jGenericObjList = new ArrayList();
		Vehicle car = new Car();
		RentVehicle<Vehicle> rentVehicle = new RentCar<Car>();
		rentVehicle.rentOut(car);
	}
}

class Vehicle {
	
	Integer regn;
	String type;

	public Integer getRegn() {
		return regn;
	}

	public void setRegn(Integer regn) {
		this.regn = regn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

class Car extends Vehicle {
}

interface RentVehicle<T extends Vehicle> {
	public void rentOut(T vehicle);
}

class RentCar<Car> implements RentVehicle {
	
	public void rentOut(Vehicle vehicle) {
	
		System.out.println("Rent Vehicle => Rent Car");
	}
}