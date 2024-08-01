import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    Character cs;
    Character cf;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if       (c >= 'a' && c <= 'm') {c += 13;}
            else if  (c >= 'A' && c <= 'M') {c += 13;}
            else if  (c >= 'n' && c <= 'z') {c -= 13;}
            else if  (c >= 'N' && c <= 'Z') {c -= 13;}
            System.out.println(c);
            sb.append(c);
        }
        return sb.toString();
       // return "testing";

    }

    public String encrypt(String text) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            if       (c >= 'a' && c <= 'm') {c += 13;}
//            else if  (c >= 'A' && c <= 'M') {c += 13;}
//            else if  (c >= 'n' && c <= 'z') {c -= 13;}
//            else if  (c >= 'N' && c <= 'Z') {c -= 13;}
//            System.out.println(c);
//            sb.append(c);
//        }
//        return sb.toString();
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {

        StringBuilder stringBuilder = new StringBuilder();
        String firstHalf = s.substring(s.indexOf(c));
        String secondHalf = s.substring(0,s.indexOf(c) );
        return stringBuilder.append(firstHalf).append(secondHalf).toString();
    }

}
