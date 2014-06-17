package test;
import static org.junit.Assert.*;
import ass1.*;
public class Test {
	
	public Test(){
//		Dic.Add_Word("U",new Word("U","1",1));
//		Dic.Add_Word("A",new Word("A","2",1));
//		Dic.Add_Word("C",new Word("C","2",3));
//		Dic.Add_Word("D",new Word("D","3",3));
//		Dic.Add_Word("T",new Word("T","3",3));
//		Dic.Add_Word("G",new Word("G","6",3));
//		Dic.Add_Word("H",new Word("HT","7",3));
//		Dic.Add_Word("I",new Word("I","7",3));
//		Dic.Add_Word("K",new Word("K","r",3));
//		Dic.Add_Word("M",new Word("M","g",3));
//		Dic.Add_Word("L",new Word("L","g",3));
		
	}
	@org.junit.Test
	public void testGetDic() {
		
		assertEquals("test size of data", 11, Dic.GetDic().size());
	}

	@org.junit.Test
	public void testadd_Dic() {
		Dic.Add_Word("L",new Word("L","g",3));
		assertEquals("test size of data", 11, Dic.GetDic().size());
	}
//
//	@Test
//	public void testSearch_Word() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIsExists() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testAdd_Word() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFix_Word() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testRemove_Word() {
//		fail("Not yet implemented");
//	}

}
