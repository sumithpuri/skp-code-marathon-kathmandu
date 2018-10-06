/**
 * 
 */
package me.sumithpuri.github.kathmandu;

/**
 * @author sumithpuri
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