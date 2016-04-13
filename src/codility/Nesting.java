package codility;

import java.util.Deque;
import java.util.LinkedList;


public class Nesting {
    public int solution (String S){
        int result=0;
        Deque<Character> nestingString=new LinkedList<Character>();

        for (int i = 0; i <S.length() ; i++) {
            if (S.charAt(i)=='('){
                nestingString.push(S.charAt(i));
            }else{
                if(!nestingString.isEmpty()&&nestingString.peek()=='('){
                    nestingString.pop();
                }else {
                    return result;
                }
            }

        }
        result = nestingString.size()==0? 1:0;
        return result;
    }
}
