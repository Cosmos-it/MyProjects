/**
 * 
 */
package edu.cwu.cs.cs302.baseballTeamStats.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.cwu.cs.cs302.baseballTeamStats.BaseballAwards;
import edu.cwu.cs.cs302.baseballTeamStats.BaseballTeam;
import edu.cwu.cs.cs302.baseballTeamStats.IBaseballAwards;
import edu.cwu.cs.cs302.baseballTeamStats.IBaseballAwards.Award;
import edu.cwu.cs.cs302.baseballTeamStats.IBaseballTeam;
import edu.cwu.cs.cs302.baseballTeamStats.Record;

import java.util.*;

import junit.framework.Assert;
/**
 * @author Taban
 *
 */
public class BaseballTeamAwardTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void teamWithNoAwardAssigned() {

		List<Record> records = new ArrayList<Record>();
		BaseballTeam result = new BaseballTeam();

		Assert.assertNotNull(result != null);

	}

	//Few tests to figure if the correct result was returned. 


	@Test
	public void teamWithAwardAssigned() {

		//Arrange
		List<Record> records = new ArrayList<Record>();
		List<Record> records1 = new ArrayList<Record>();

		Record record1 = Record.create("2014,98,64,773,1464,304,31,155,Los Angeles Angels of Anaheim");
		Record record2 = Record.create("2014,64,98,615,1379,259,47,118,Arizona Diamondbacks");

		//Act
		records.add(record1);
		records1.add(record2);
		IBaseballAwards bb1 = new BaseballAwards(records); 
		IBaseballAwards bb2 = new BaseballAwards(records1);


		IBaseballTeam result1 = bb1.getAward(Award.CHAMPIONS);
		IBaseballTeam result2 = bb2.getAward(Award.LOSERS);


		//Assert
		assertEquals(result1, record1);
		assertEquals(result2.getLosses(), record2.getLosses());

	}

}
















