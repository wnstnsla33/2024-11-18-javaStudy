import java.util.ArrayList;
import java.util.Arrays;

public class prac {
	public static void main(String[] args) {
		Solution s= new Solution();
		System.out.println(s.solution("dccdc"));
		
		
	}

}
class Solution
{
    public int solution(String s)
    {
    	ArrayList<Character> list = new ArrayList<>();
    	for(int i =0;i<s.length();i++) {
    		list.add(s.charAt(i));
    	}
    	boolean flag = true;
    	while(flag) {
    		flag = false;
    		for(int i =0;i<list.size()-1;i++) {
    		if(list.get(i)==list.get(i+1)) {
    			list.remove(i);
    			list.remove(i);
    			flag = true;
    			break;
    		}
    		}
    	}
    	int answer = 0;
    	if(list.isEmpty())answer=1;
    	
        return answer;
    }
}