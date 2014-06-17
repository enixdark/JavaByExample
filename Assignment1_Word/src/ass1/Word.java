package ass1;

public class Word {
	private String Word;
	private String Guess_request;
	private int Point;
	public Word(String Word, String Guess_request, int Point) {
		this.setWord(Word);
		this.setGuess_request(Guess_request);
		this.setPoint(Point);
	}
	public String getWord() {
		return Word;
	}
	public void setWord(String word) {
		Word = word;
	}
	public String getGuess_request() {
		return Guess_request;
	}
	public void setGuess_request(String guess_request) {
		Guess_request = guess_request;
	}
	public int getPoint() {
		return Point;
	}
	public void setPoint(int point) {
		Point = point;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String out = String.format("word : %s {description : %s ," +
								   "point : %d}",this.getWord(),
								   this.getGuess_request(),
								   this.getPoint());
		return out;
	}
}
