package Task1;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        var cats = Cat.makeCats(10);
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getBreed));
        Printer.print(cats);

        cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));
        Printer.print(cats);

        cats.removeIf(cat -> cat.getColor() == Cat.Color.GINGER);
        Printer.print(cats);

    }
}
