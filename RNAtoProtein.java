public class RNAtoProtein {

    static String toProtein(String rna) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rna.length() - 2; i+=3) {
            String trio = rna.substring(i, i+3);

            switch (trio) {

                case "AUU":
                case "AUC":
                case "AUA":
                    sb.append("I");
                    break;

                case "AUG":
                    sb.append("M");
                    break;

                case "ACU":
                case "ACC":
                case "ACA":
                case "ACG":
                    sb.append("T");
                    break;

                case "AAU":
                case "AAC":
                    sb.append("N");
                    break;

                case "AAA":
                case "AAG":
                    sb.append("K");
                    break;

                case "AGU":
                case "AGC":
                    sb.append("S");
                    break;

                case "AGA":
                case "AGG":
                    sb.append("R");
                    break;

                case "GUU":
                case "GUC":
                case "GUA":
                case "GUG":
                    sb.append("V");
                    break;

                case "GCU":
                case "GCC":
                case "GCA":
                case "GCG":
                    sb.append("A");
                    break;

                case "GAU":
                case "GAC":
                    sb.append("D");
                    break;

                case "GAA":
                case "GAG":
                    sb.append("E");
                    break;

                case "GGU":
                case "GGC":
                case "GGA":
                case "GGG":
                    sb.append("G");
                    break;

                case "UUU":
                case "UUC":
                    sb.append("F");
                    break;

                case "UUA":
                case "UUG":
                    sb.append("L");
                    break;

                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    sb.append("S");
                    break;

                case "UAU":
                case "UAC":
                    sb.append("Y");
                    break;

                case "UAA":
                case "UAG":
                case "UGA":
                    sb.append(".");
                    break;

                case "UGU":
                case "UGC":
                    sb.append("C");
                    break;

                case "UGG":
                    sb.append("W");
                    break;

                case "CUU":
                case "CUC":
                case "CUA":
                case "CUG":
                    sb.append("L");
                    break;

                case "CCU":
                case "CCC":
                case "CCA":
                case "CCG":
                    sb.append("P");
                    break;

                case "CAU":
                case "CAC":
                    sb.append("H");
                    break;

                case "CAA":
                case "CAG":
                    sb.append("Q");
                    break;

                case "CGU":
                case "CGC":
                case "CGA":
                case "CGG":
                    sb.append("R");
                    break;
                default:
            }
        }
        if(rna.length()%3 != 0) {
            sb.append(".");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "AGCUGGGAAACGUAGGCCUA";
        String s2 = "UAAAGAGAAGCCAGC";

        System.out.println("RNA:" + "\n" + s1 + "\nProtein:" + "\n" + toProtein(s1));
        System.out.println("RNA:" + "\n" + s2 + "\nProtein:" + "\n" + toProtein(s2));
    }
}
