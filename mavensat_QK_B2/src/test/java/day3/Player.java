package day3;

public class Player implements Comparable<Player> {
	String cnt;
	String name;
	int score;
	
	public Player(String cnt, String name, int score ) {
		this.cnt = cnt;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player [cnt=" + cnt + ", name=" + name + ", score=" + score + "]" + "\n";
	}

	@Override
	public int compareTo(Player pl) {
		// TODO Auto-generated method stub
		//return (  p2.score - this.score ); // descending order
		return (this.name.compareTo(pl.name));
		
	}}