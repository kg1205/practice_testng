package Practice_testng;

import java.util.ArrayList;
import java.util.List;

public class logicinterview {

	public static void main(String[] args) {
		List<Integer> cards=new ArrayList<Integer>();
		cards.add(1);
		cards.add(2);
		cards.add(3);
		Integer x1=0;
		for(int i=0;i<cards.size();i++) {
			cards.remove(0);
			x1=cards.get(0);
			cards.remove(0);
			cards.add(x1);
			
		}
		System.out.println(cards);
	}

}
