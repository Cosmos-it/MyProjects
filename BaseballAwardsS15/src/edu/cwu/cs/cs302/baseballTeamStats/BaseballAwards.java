package edu.cwu.cs.cs302.baseballTeamStats;

import java.util.*;


/**
 * @author Taban
 *
 * */

public class BaseballAwards implements IBaseballAwards {

	private List<Record> record;
	private Map<String, IBaseballTeam> team;


	/***@param List<Record> stats
	 * 	store the stats in a
	 * 	field variable called record
	 *
	 * 	define a new team storage
	 * 	TreeMap<String, IBaseballTeam>
	 *
	 * 	set the values
	 * 	wins
	 * 	losses
	 * 	triplePlays
	 * 	doublePlays
	 * 	homers
	 * 	name
	 * 	hits
	 *  runs
	 *
	 * The team Tree Map is available for consumption within this class.
	 *
	 *
	 * **/
	@SuppressWarnings("null")
	public BaseballAwards(List<Record> stats) {
		this.record = stats;

		this.team = new TreeMap<String, IBaseballTeam>();

		for (int i = 0; i < record.size() -1; i++ ) {
			BaseballTeam bb = new BaseballTeam();


			bb.setWins(record.get(i).getWins());
			bb.setLosses(record.get(i).getLosses());
			bb.setHits(record.get(i).getHits());
			bb.settPlay(record.get(i).getTriplePlays());
			bb.setdPlay(record.get(i).getDoublePlays());
			bb.setRuns(record.get(i).getRuns());
			bb.setHomers(record.get(i).getHomeRuns());
			bb.setName(record.get(i).getName());


			//Store them into team TreeMap
			team.put(record.get(i).getName().toString(), bb);
		}

	}


	/***
	 * 	An award is passed to the method
	 *  based on the award passed check the teams against
	 *  each other to find the correct results to return
	 *  in a one team object.
	 *
	 *  using for each loop to get the key for individual team
	 *  by name.
	 *
	 *  then returning that team name object.
	 *
	 *  in the for each loop the team Tree Map
	 *  has an access to keySet() which returns the key
	 *  that contains the value for the individual teams.
	 *
	 *
	 *
	 * */
	@Override
	public IBaseballTeam getAward(Award a) {

		IBaseballTeam currentTeam = null;

		for (String key : team.keySet()) {

			switch(a) {

			case CHAMPIONS:
				if (currentTeam == null || currentTeam.getWins() < team.get(key).getWins()) {
					currentTeam = team.get(key);
				}
				break;

			case TRIPLETIME:
				if (currentTeam == null || currentTeam.gettPlays() < team.get(key).gettPlays()) {
					currentTeam = team.get(key);
				}

				break;

			case LUMBERJACK:
				if (currentTeam == null || currentTeam.getHits() < team.get(key).getHits()) {
					currentTeam = team.get(key);
				}
				break;

			case DOUBLETIME:
				if (currentTeam == null || currentTeam.getdPlays() < team.get(key).getdPlays()) {
					currentTeam = team.get(key);
				}
				break;

			case TIRED:
				if (currentTeam == null || currentTeam.getRuns() < team.get(key).getRuns()) {
					currentTeam = team.get(key);
				}
				break;

			case LOSERS:
				if (currentTeam == null || currentTeam.getLosses() < team.get(key).getLosses()) {
					currentTeam = team.get(key);
				}
				break;

			default:
				if (currentTeam == null || team.get(key).getHomers() < team.get(key).getHomers()) {
					currentTeam = team.get(key);
				}
				break;
			}

		}
		return currentTeam;
	}

}
