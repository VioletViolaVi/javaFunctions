public class Functions {
    public static void printOut() {
        System.out.println("printOut() function has been invoked!");
    }

    public static void printName(String fName, String lName) {
        System.out.println("My name is " + fName + " " + lName + ".");
    }

    public static void printAge(int age) {
        System.out.println("I'm " + age + " years old.");
    }

    public static void printAddress(String address) {
        System.out.println("My address is " + address);
    }
    public static String combineAddress(String line1, String line2, String line3) {
        return line1 + " " + line2 + " " + line3;
    }

    public static void main(String[] args) {
        printOut();
        printName("Nene", "Leakes");
        printAge(57);
        printAddress(combineAddress("444 Hotting Lane", "Yotsville", "6TY WQ3"));
    }
}
