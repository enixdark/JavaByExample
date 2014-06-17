
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Dic{
	
	private final String key_log = "45fdgdfg445t";
	private static HashMap<String, Word> Dic_List = null;
	
	
	public static HashMap<String, Word> GetDic() {
		if (Dic_List==null)
			Dic_List = new HashMap<String, Word>();
		return Dic_List;
	}
	/*
	 * hiển thị danh sách các từ có trong từ điển của hẹ thống
	 */
	public static void Total_Dic(){
		List<String> keys = new ArrayList<String>(GetDic().keySet());
		//sắp xếp các từ khóa theo thứ tự A B C
		Collections.sort(keys);
		for(String item : keys){
			Word word = GetDic().get(item);
			System.out.println(word);
		}
		
		
	}
	/*
	 * Tìm kiếm từ khóa trong từ diển của hẹ thống
	 */
	public static void Search_Word(String Key) {
		if (GetDic().containsKey(Key)){
			System.out.println("Key Exist");
			return;
		}
	}
	
	public static boolean isExists(String Key){
		return GetDic().containsKey(Key);
	}
	/*
	 * Thêm từ vào khóa trong từ diển của hê thống , nếu đã có từ khóa trong hệ thống
	 * thì đưa ra thông báo và thoát
	 */
	public static void Add_Word(String Key, Word word) {
		if (GetDic().containsKey(Key)) {
			System.out.println("Key Exist,Cannot add the key");
			return;
		}
		GetDic().put(Key, word);
	}

	/*
	 * sửa nội dung từ khóa trong từ diển của hê thống 
	 */

	public static void Fix_Word(String Key,Word word) {
		if (GetDic().containsKey(Key)) {
			GetDic().get(Key).setWord(word.getWord());
			GetDic().get(Key).setGuess_request((word.getGuess_request()));
			GetDic().get(Key).setPoint(word.getPoint());
		}
		

	}
	
	/*
	 * xóa từ khóa trong từ diển của hê thống 
	 */
	public static void Remove_Word(String Key){
		if(GetDic().containsKey(Key)){
			GetDic().remove(Key);
		}
			
	}

}
