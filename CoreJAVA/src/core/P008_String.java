package core;

public class P008_String {
	public static void main(String[] args) {
		char c[] = {'J','A','V','A'};
		System.out.println(c);
		String name = "hello java";
		String name1 = "hello again";
		System.out.println(name.length());
		System.out.println(name.concat(name1));
		System.out.println(name);
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contains("aj"));
		String s3 = "			ja   va 			";
		System.out.println(s3.trim());
		String s4 = "    ";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
	}
}
