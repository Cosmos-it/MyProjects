
import java.time.LocalDate;
import java.util.Random;

public class RandomDates {
	private LocalDate mindate;
	private LocalDate maxdate;
	private Random random;

	public RandomDates(LocalDate min, LocalDate max) {
		this.mindate = min;
		this.maxdate = max;
		this.random = new Random();
	}

	public LocalDate nextDate(){
		int minDay = (int)this.mindate.toEpochDay();
		int maxDay = (int)this.maxdate.toEpochDay();
		long randomday =  minDay + random.nextInt(maxDay - minDay);
		return LocalDate.ofEpochDay(randomday);
	}

	@Override
	public String toString() {
		return " " + maxdate + " " + mindate;
	}

}
