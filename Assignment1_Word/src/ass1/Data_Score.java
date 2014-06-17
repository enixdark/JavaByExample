package ass1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *  Data_Score class cung cấp thông tin về danh sách các thứ hạng của những người tham gia chơi
 *  
 */
public class Data_Score {
	private static List<Data_Score> Data = null;
	private Date Date_play;
	private int score;
	
	public Date getDate_play() {
		return Date_play;
	}

	public int getScore() {
		return score;
	}
	
	// TODO Auto-generated constructor stub
	private Data_Score(Date Date_play,int score){		
		this.Date_play = Date_play;
		this.score = score;
	}
	
	public static Data_Score Create_data(Date Date_play,int score){
		Data_Score data = new Data_Score(Date_play, score);
		GetData().add(data);
		return data;
	}
	
	public static List<Data_Score> GetData(){
		if(Data_Score.Data == null){
			Data_Score.Data = new ArrayList<Data_Score>();
		}
		return Data_Score.Data;
	}
	
	public static List<Data_Score> GetDataSort(final String type){
		List<Data_Score> sub = GetData();
		Collections.sort(sub,new Comparator<Data_Score>() {

			@Override
			public int compare(Data_Score o1, Data_Score o2) {
				// TODO Auto-generated method stub
				if(type.equalsIgnoreCase("score"))
					return o1.getScore() > o2.getScore() ? 1 : 0;
				else
					return o1.getDate_play().compareTo(o2.getDate_play());
				

			}
			
		});
		return sub;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return String.format("Date :%s , Score : %d",this.getDate_play(),this.getScore());
	}

	

	

}
