package edu.cwu.cs.cs302.baseballTeamStats;

public interface IBaseballAwards {

	enum Award{CHAMPIONS, LOSERS, TIRED, LUMBERJACK, OUTOFPARK, DOUBLETIME, TRIPLETIME};
	
	public IBaseballTeam getAward(Award a); 
}
