package game.hero;

public class Main {
    public static void main(String[] args) {

        String s = "Java";
        String s1 = new String("I study Java!");
        System.out.println(s1);
        String s2 = String.valueOf(s1);
        System.out.println(s2);
        System.out.println(s2.charAt(12));
        System.out.println(s2.contains("Java"));
        String s3 = s2.replace("a","o");
        System.out.println(s3);
        System.out.println(s2.substring(8,12));

        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toLowerCase());



    }

}
