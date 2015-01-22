public class Main {

	public static void main(String[] args) {
		String a = "  java  ";
		String b = "j,a,v,a";
		String c = "java";
		String d = "java3";

		System.out.println(c.charAt(0));

		if(c.compareTo(d) > 0) {
			System.out.println("La cadena c va despues alfabeticamente que d");
		} else {
			System.out.println("La cadena c va antes alfabeticamente que d");
		}

		System.out.println(c.contains("a"));
		System.out.println(c.endsWith("a"));
		System.out.println(c.startsWith("j"));
		System.out.println(c.equals(d));
		System.out.println(c.indexOf("a"));
		System.out.println(c.lastIndexOf("a"));
		System.out.println(c.length());
		System.out.println(c.replace('a', 'e'));
		System.out.println(c.substring(0,3));
		System.out.println(a.trim());
		System.out.println(b.split(","));
	}

}