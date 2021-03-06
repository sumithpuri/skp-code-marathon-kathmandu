package me.sumithpuri.github.kathmandu.varargs;

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
public class jdk5_Varargs {
	
	public void getData(String... values) {
	
		for (String string : values) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		
		demonstrate();
	}
	
	public static void demonstrate() {
		
		jdk5_Varargs varargs = new jdk5_Varargs();
		varargs.getData("Apple", "Banana", "Cucumber", "Radish");
		String[] vargs = new String[] { "Radia", "Cloud", "Hewlett", "Packard" };
		varargs.getData(vargs);
	}
} 
