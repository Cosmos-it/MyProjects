import java.util.GregorianCalendar;

public class RandomDateOfBirth {

    public static void main(String[] args) {

        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(2010, 2015);

        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        System.out.println(gc.get(gc.YEAR) + "-" + gc.get(gc.MONTH) + "-" + gc.get(gc.DAY_OF_MONTH));

    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}