package teamplayer;

public class Player {
	private int playerid;
	private String playername;
	private Team team;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(int playerid, String playername, Team team) {
		this.playerid = playerid;
		this.playername=playername;
		this.team=team;
	}
	public void printpalyer() {
		System.out.println(playerid);
		System.out.println( playername);
		team.printvalues();

}
}