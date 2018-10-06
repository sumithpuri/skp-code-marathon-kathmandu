package me.sumithpuri.github.kathmandu.main;

import me.sumithpuri.github.kathmandu.autoboxing.jdk5_Autoboxing;
import me.sumithpuri.github.kathmandu.enhancedfor.jdk5_EnhancedFor;
import me.sumithpuri.github.kathmandu.enums.jdk5_Enum;
import me.sumithpuri.github.kathmandu.generics.jdk5_Generics;
import me.sumithpuri.github.kathmandu.staticimport.jdk5_StaticImport;
import me.sumithpuri.github.kathmandu.varargs.jdk5_Varargs;

/**
 * MIT License
 *
 * Copyright (c) 2018-19,	Sumith Kumar Puri
 *
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

/* 
 * You may run this main class to run all the Demo Code  of  the  Kathmandu  Project. It demonstrates the most important 
 * changes in Java 5.
 */
public class jdk5_Kathmandu {

	public static void main(String[] args) {
		
		System.out.println("Copyright (c) 2018-19,	Sumith Kumar Puri");
		System.out.println();
		System.out.println("Project Codename      Kathmandu");
		System.out.println("Project Description   Java 5 Companion Code Samples");
		System.out.println("Technical Blog        http://www.techilashots.com");
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("[01. Enhanced For]");
		enhancedFor();
		System.out.println("------------------------------------------------------------");
		System.out.println("[02. Enum]");
		enums();
		System.out.println("------------------------------------------------------------");
		System.out.println("[03. Generics]");
		generics();
		System.out.println("------------------------------------------------------------");
		System.out.println("[04. Static Import]");
		staticImport();
		System.out.println("------------------------------------------------------------");
		System.out.println("[05. Varargs]");
		varargs();
		System.out.println("------------------------------------------------------------");
		System.out.println("[06. Autoboxing]");
		autoboxing();
		System.out.println("~Nothing to Demonstrate. Refer Code for Example~");
		System.out.println("------------------------------------------------------------");
	}
	
	
	private static void enhancedFor() {
		
		jdk5_EnhancedFor enhancedFor = new jdk5_EnhancedFor();
		enhancedFor.demonstrate();
	}
	
	private static void enums() {
		
		jdk5_Enum enums = new jdk5_Enum();
		enums.demonstrate();
	}
	
	private static void generics() {
		
		jdk5_Generics generics = new jdk5_Generics();
		generics.demonstrate();
	}
	
	private static void staticImport() {
		
		jdk5_StaticImport staticImports = new jdk5_StaticImport();
		staticImports.demonstrate();
	}
	
	private static void varargs() {
		
		jdk5_Varargs varargs = new jdk5_Varargs();
		varargs.demonstrate();
	}
	
	private static void autoboxing() {
		
		jdk5_Autoboxing autoboxing = new jdk5_Autoboxing();
		autoboxing.demonstrate();
	}
}
