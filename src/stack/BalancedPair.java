package stack;

public class BalancedPair {

	
	public static void main(String[] args) {
		Stack<Character> st = new Stack<Character>();
		
		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c =='('){
				st.push(c);
			}else if(c == ')'){
				st.pop();
			}
			
			
		}
		System.out.println("BALANCED===>>>  "+st.isEmpty());
	}


}
