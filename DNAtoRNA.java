import java.util.Arrays;

public class DNAtoRNA {


    static public String RNA(String s) {
        String RNA = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'T') {
                RNA += "U";
            } else {
                RNA += s.charAt(i);
            }
        }
        return RNA;
    }

    public static void main(String[] args) {
        String s1 = "AGCTGGGAAACGTAGGCCTA";
        String s2 = "TTTTTTTTTTGGCGCG";
        String s3 = "CTTTGGGACTAGTAACCCATTTCGGCT";

        System.out.println("DNA:" + "\n" + s1 + "\nRNA:" + "\n" + RNA(s1));
        System.out.println("DNA:" + "\n" + s2 + "\nRNA:" + "\n" + RNA(s2));
        System.out.println("DNA:" + "\n" + s3 + "\nRNA:" + "\n" + RNA(s3));
    }
}