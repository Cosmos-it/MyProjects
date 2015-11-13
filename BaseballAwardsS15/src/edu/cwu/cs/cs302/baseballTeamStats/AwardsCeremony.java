package edu.cwu.cs.cs302.baseballTeamStats;

import java.util.List;

import edu.cwu.cs.cs302.baseballTeamStats.IBaseballAwards.Award;

public class AwardsCeremony {
	public static void main(String[] args) {

        //Read the file pass it to the database

		Database db = new Database("data/From1900.csv");
		List<Record> stats = db.getData();
		System.out.println("Num Records: " + stats.size());

		IBaseballAwards awards = new BaseballAwards(stats);
		System.out.println("Champions: "+ awards.getAward(Award.CHAMPIONS).getName() +
				" [" + awards.getAward(Award.CHAMPIONS).getWins() + " wins]");
		System.out.println("Losers: " + awards.getAward(Award.LOSERS).getName() +
				" [" + awards.getAward(Award.LOSERS).getLosses() + " loses]");
		System.out.println("Tired: " + awards.getAward(Award.TIRED).getName() +
				" [" + awards.getAward(Award.TIRED).getRuns() + " runs]");
		System.out.println("Double Time: " + awards.getAward(Award.DOUBLETIME).getName() +
				" [" + awards.getAward(Award.DOUBLETIME).getdPlays() + " doubles]");
		System.out.println("Triple Time: " + awards.getAward(Award.TRIPLETIME).getName() +
				" [" + awards.getAward(Award.TRIPLETIME).gettPlays() + " triples]");
		System.out.println("Lumberjack: " + awards.getAward(Award.LUMBERJACK).getName() + ""
				+ " [" + awards.getAward(Award.LUMBERJACK).getHits() + " hits]");
		System.out.println("Out Of The Park: " + awards.getAward(Award.OUTOFPARK).getName() +
				" [" + awards.getAward(Award.OUTOFPARK).getHomers() + " home runs]");
	}


}
