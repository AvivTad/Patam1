package Model;

public abstract class Player {
	 private int id;
	 private String name;
	 private int score;
	    
	 public Player(int id, String name) {
	     this.id = id;
	     this.name = name;
	     this.score = 0;
	 }
	    
	 public int getId() {
		    return id;
		}

		public void setId(int id) {
		    this.id = id;
		}

		public String getName() {
		    return name;
		}

		public void setName(String name) {
		    this.name = name;
		}

		public int getScore() {
		    return score;
		}

		public void setScore(int score) {
		    this.score = score;
		}
}
