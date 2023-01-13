public class Encode {
    public static String encode(String s) {
        String[] words = s.split(" ");
        String firstWord = words[0];
        String secondWord = words[1];
        String thirdWord = words[2];
        String fourthWord = words[3];
        String fifthWord = words[4];
        String sixthWord = words[5];
        String seventhWord = words[6];
        String eighthWord = words[7];
        String ninthWord = words[8];

        String firstWordEncoded = firstWord.replaceAll("[aeiouAEIOU]", "%");
        String secondWordEncoded = secondWord.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "#");
        String thirdWordEncoded = thirdWord.toUpperCase();
        String fourthWordEncoded = fourthWord.replaceAll("[aeiouAEIOU]", "%");
        String fifthWordEncoded = fifthWord.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "#");
        String sixthWordEncoded = sixthWord.toUpperCase();
        String seventhWordEncoded = seventhWord.replaceAll("[aeiouAEIOU]", "%");
        String eighthWordEncoded = eighthWord.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "#");
        String ninthWordEncoded = ninthWord.toUpperCase();

        return (firstWordEncoded + " " + secondWordEncoded + " " + thirdWordEncoded + " " + fourthWordEncoded + " "
                + fifthWordEncoded + " " + sixthWordEncoded + " " + seventhWordEncoded + " " + eighthWordEncoded + " "
                + ninthWordEncoded).replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String s = "Where are you? Meet me near the clock tower";
        System.out.println(encode(s));

        String str2 = "Where are you? Meet me near the clock tower";
        String str3[] = str2.split(" ");
        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }

    }
}
