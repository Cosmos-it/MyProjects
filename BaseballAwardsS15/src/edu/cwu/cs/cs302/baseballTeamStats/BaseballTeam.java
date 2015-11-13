package edu.cwu.cs.cs302.baseballTeamStats;

public class BaseballTeam implements IBaseballTeam {
	
	// fields
	
	private int wins;
	private int losses;
	private int runs;
	private int hits;
	private int tPlay;
	private int dPlay;
	private int homers;
	private String name;

	public void setWins(int wins) {
		this.wins = wins;
	}
	@Override
	public int getWins() {
		return this.wins;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}
	@Override
	public int getLosses() {
		return this.losses;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}

	@Override
	public int getRuns() {
		return this.runs;
	}


	public void setHits(int hits) {
		this.hits = hits;
	}
	@Override
	public int getHits() {
		return this.hits;
	}
	
	public void setdPlay(int dPlay) {
		this.dPlay = dPlay;
	}

	@Override
	public int getdPlays() {
		return this.dPlay;
	}

	public void settPlay(int tPlay) {
		this.tPlay = tPlay;
	}
	@Override
	public int gettPlays() {
		return this.tPlay;
	}

	public void setHomers(int homers) {
		this.homers = homers;
	}
	@Override
	public int getHomers() {
		return this.homers;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return this.wins  + " " + this.losses + " " +  this.hits + "" +  this.dPlay+  "" + this.tPlay + " " + this.name;
	}

}
