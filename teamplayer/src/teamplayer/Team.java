package teamplayer;

public class Team {
	int teamid;
	String teamname;
	String coach;


	public Team() {
		// TODO Auto-generated constructor stub
	}


	public Team(int teamid, String teamname, String coach) {
		
		this.teamid = teamid;
		this.teamname = teamname;
		this.coach = coach;
	}
	public void printvalues() {
		System.out.println(teamid);
		System.out.println(teamname);
		System.out.println(coach);
		
	}
	

}
