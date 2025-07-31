public class Strings {
  public static void main(String[] args) {
    String name = "John Doe";

    System.out.println(name.toLowerCase());
    System.out.println(name.getClass());
    System.out.println(name.strip());
    System.out.println(name.isEmpty());
    System.out.println(name.length());
    System.out.println(name.charAt(0));
    System.out.println(name.indexOf("Doe"));
    System.out.println(name.substring(0, 4));
    // System.out.println(name.replace("John", "Jane"));
    System.out.println(name.contains("Doe"));
    System.out.println(name.startsWith("John"));
    System.out.println(name.endsWith("Doe"));
    System.out.println(name.equals("John Doe"));
    System.out.println(name.equalsIgnoreCase("john doe"));
    System.out.println(name.compareTo("John Doe"));
    System.out.println(name.compareToIgnoreCase("john doe"));
    System.out.println(name.toUpperCase());
    System.out.println(name.trim());
    System.out.println(name.split(" "));
    System.out.println(name.concat(" Smith"));
    // System.out.println(name.replaceAll("John", "Jane"));
    // System.out.println(name.replaceFirst("John", "Jane"));
    System.out.println(name.lastIndexOf("Doe"));
    // System.out.println(name.codePointAt(0));
    // System.out.println(name.codePointBefore(0));

    String name2 = new String("sujal");
    System.out.println(name2);
  }
}
