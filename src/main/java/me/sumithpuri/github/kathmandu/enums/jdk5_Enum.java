package me.sumithpuri.github.kathmandu.enums;

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
 * rights to use, copy, modify, merge, publish, distribute, sublicense,and/or sell copies of the Software, and to permit 
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
public class jdk5_Enum {
	
	public static enum Java {
		
		JDK5, JDK6, JDK7, JDK8
	};

	public static enum JavaVer {
		
		JDK5(5), JDK6(6), JDK7(7), JDK8(8);
		int x;

		JavaVer(int x) {
			this.x = x;
		}
	}

	public static void main(String[] args) {

		demonstrate();
	}
	
	public static void demonstrate() {
		
		Java java = Java.JDK6;
		System.out.println(Java.JDK5);
		System.out.println(java);
		System.out.println(java.ordinal() + ":" + java.name());
		
		JavaVer javaVer = JavaVer.JDK7;
		System.out.println(javaVer.x);
		System.out.println(javaVer.ordinal() + ":" + javaVer.name());
		
		String myJava = "JDK8";
		System.out.println(Java.valueOf(myJava));
		
		JavaVer javaSwitchVer = JavaVer.JDK6;

		switch (javaSwitchVer) {
		
			case JDK5: {
				System.out.println("5.0");
				break;
			}
		
			case JDK6: {
				System.out.println("6.0");
				break;
			}
			
			case JDK7: {
				System.out.println("7.0");
				break;
			}
			
			case JDK8: {
				System.out.println("8.0");
				break;
			}
		}
	}
}