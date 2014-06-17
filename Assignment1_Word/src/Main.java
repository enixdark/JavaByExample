import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {

	private static Scanner input = new Scanner(System.in);
	
	/**
	 * Show the main menu when start program
	 */
	public static void MainMenu(){
		
		int select = 0;
		do{
		System.out.println("=================WORD GAME====================");
		System.out.println("|1.Dictinary Management                      |");
		System.out.println("|2.Player                                    |");
		System.out.println("|3.Rank                                      |");
		System.out.println("|4.Exit                                      |");
		System.out.println("==============================================");
		select = input.nextInt();
		switch (select) {
		case 1:
			ManagementMenu();
			break;
		case 2:
			PlayerMenu();
			break;
		case 3:
			RankMenu();
			break;			
		}
		}while(select!=4);
	}
	
	/**
	 *  
	 *  Cho phép thống kê số lượt chơi, thời gian và điểm chơi của mỗi lượt theo thứ tự giảm dần 
	 *  về điểm.
	 */
	private static void RankMenu() {
		// TODO Auto-generated method stub
		//lấy danh sách lượt chơi theo thứ tự giảm dần dựa vào điểm số 
		List<Data_Score> subdata = Data_Score.GetDataSort("score");
		int next = 0;
		System.out.println("=================RANK GAME====================");
		for(Data_Score data : subdata){
			next++;
			System.out.printf("|Rank %d  -> %s\n",next,data);
		}		
		System.out.println("==============================================");

	
	}
	
	/**
	 * Đăng nhập vào hệ thống vơi tư cách người chơi
	 * Khi vào chức năng này hệ thống cho phép người chơi được đoán 10 từ căn cứ vào các gợi 
	 * ý. Hệ thống sẽ tính điểm căn cứ trên việc trả lời đúng/sai.
	 */
	private static void PlayerMenu() {
		// TODO Auto-generated method stub
		String answer = "";
		int score = 0;
		//lấy danh sách các từ khóa chứa trong hệ thống
		List<String> subdic = new ArrayList<String>(Dic.GetDic().keySet());
		//trộn ngẫu nhiên các từ khóa trong danh sách ,mục đích là để ngẫu nhiên sinh ra
		//câu hỏi 
		Collections.shuffle(subdic);
		
		for(int i = 0; i < 10 ; i++){
			System.out.print(i);
			
			String keys = subdic.get(i);
			
			Word word = Dic.GetDic().get(keys);
			while(answer.isEmpty()){
				System.out.printf("desciption : %s\n",word.getGuess_request());
				answer = input.nextLine();
				score += answer.equalsIgnoreCase(keys) ? word.getPoint() : 0;
			}
			answer = "";
		}
		Data_Score.Create_data(new Date(), score);
		
		
	}
	private static void ManagementMenu() {
		// TODO Auto-generated method stub
		int select = 0;
		String word = "";
		String description = "";
		int point = 0;
		List<Integer> CRUD = Arrays.asList(2,3,4,5);
		do{
		System.out.println("=================MANAGEMENT=======================");
		System.out.println("|1.Liệt Kê                                       |");
		System.out.println("|2.Tìm Kiếm                                      |");
		System.out.println("|3.Thêm                                          |");
		System.out.println("|4.Sửa                                           |");
		System.out.println("|5.Xóa                                           |");
		System.out.println("|6.Quay Trở Lại Menu Chính                       |");
		System.out.println("==================================================");
		select = input.nextInt();
		if(CRUD.contains(select)){
			System.out.println("lựa chọn từ khóa : ");
			word = input.nextLine();
			if(!Dic.isExists(word)){
				System.out.println("nhập thông tin gợi ý hay mô tả : ");
				description = input.nextLine();
				System.out.println("nhập điểm số : ");
				point = input.nextInt();
			}
		}
		switch (select) {
		case 1:
			Dic.Total_Dic();
			break;
		case 2:
			Dic.Search_Word(word);
			break;
		case 3:
			Dic.Add_Word(word,new Word(word,description,point));
			break;	
		case 4:
			Dic.Fix_Word(word,new Word(word,description,point));
			break;
		case 5:
			Dic.Remove_Word(word);
			break;
		}
		}while(select!=6);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dic.Add_Word("U",new Word("U","1",1));
		Dic.Add_Word("A",new Word("A","2",1));
		Dic.Add_Word("C",new Word("C","2",3));
		Dic.Add_Word("D",new Word("D","3",3));
		Dic.Add_Word("T",new Word("T","3",3));
		Dic.Add_Word("G",new Word("G","6",3));
		Dic.Add_Word("H",new Word("HT","7",3));
		Dic.Add_Word("I",new Word("I","7",3));
		Dic.Add_Word("K",new Word("K","r",3));
		Dic.Add_Word("M",new Word("M","g",3));

		MainMenu();
		
	}

}
