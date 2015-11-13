package edu.cwu.cs.cs302.baseballTeamStats;

public class Record {

	private int year;
	private int wins;
	private int losses;
	private int runs;
	private int hits;
	private int doublePlays;
	private int triplePlays;
	private int homeRuns;
	private String name;

	public static Record create(String line) {
        
		String[] items = line.split(",");
		Record stats = new Record();
		stats.year = Integer.parseInt(items[0]);
		stats.wins = Integer.parseInt(items[1]);
		stats.losses = Integer.parseInt(items[2]);
		stats.runs = Integer.parseInt(items[3]);
		stats.hits = Integer.parseInt(items[4]);
		stats.doublePlays = Integer.parseInt(items[5]);
		stats.triplePlays = Integer.parseInt(items[6]);
		stats.homeRuns = Integer.parseInt(items[7]);
		stats.name = items[8];
		return stats;
	}

	public int getYear() {
		return year;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getRuns() {
		return runs;
	}

	public int getHits() {
		return hits;
	}

	public int getDoublePlays() {
		return doublePlays;
	}

	public int getTriplePlays() {
		return triplePlays;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public String getName() {
		return name;
	}

	
}
