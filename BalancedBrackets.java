import java.util.LinkedList;

public class BalancedBrackets {

    public static String isBalanced(String s) {
        LinkedList<Character> st=new LinkedList<>();
        int n = s.length();
        if(n%2 != 0)
        {
            return "NO";
        }
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                st.add(s.charAt(i));
            }
            else if(s.charAt(i) == ')')
            {
                if(st.size()==0)
                {
                    return "NO";
                }
                else if(st.peekLast() == '(')
                {
                    st.removeLast();
                }
                else
                {
                    return "NO";
                }
            }
            else if(s.charAt(i)=='}')
            {
                if(st.size()==0)
                {
                    return "NO";
                }
                 else if(st.peekLast()=='{')
                {
                    st.removeLast();
                }
                else
                {
                    return "NO";
                }
            }
            else if(s.charAt(i)==']')
            {
                if(st.size()==0)
                {
                    return "NO";
                }
                else if(st.peekLast()=='[')
                {
                    st.removeLast();
                }
                else
                {
                    return "NO";
                }
            }
        }
        if(st.size()!=0)
        {
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {

        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "{{[[(())]]}}";

        System.out.println(isBalanced(s1));
        System.out.println(isBalanced(s2));
        System.out.println(isBalanced(s3));
    }
}
