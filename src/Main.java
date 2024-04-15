public class Main {
    public static void main(String[] args) {
        Author Ellison = new Author("Harlan", "Ellison");
        Author Bulgakov = new Author("Михаил", "Булгаков");

        Book TheEssentialEllison = new Book("The Essential Ellison", Ellison, 1987);
        Book SobSerdse = new Book("Собачье сердце", Bulgakov, 1925);

        SobSerdse.setYearOfPublication(1987);

        System.out.println(TheEssentialEllison.toString() + " написана автором " + Ellison.toString());
        System.out.println(SobSerdse.toString() + " написана автором " + Bulgakov.toString());
    }

}


