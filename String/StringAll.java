public class StringAll {
    public static void main(String[] args) {
        String Data = "Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc. In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph.";
        String a = new String();
        System.out.println(a.hashCode());

        String b = new String("Sarvesh Kumar");
        System.out.println(b);
        System.out.println(b.hashCode());
        System.out.println(b.concat(Data));
        System.out.println(b.compareTo(Data));
        System.out.println(b.compareToIgnoreCase("r"));
        System.out.println(b.length());
        System.out.println(Data.length());
        System.out.println(Data.substring(5, 50));
        System.out.println(Data.trim());
        // System.out.println(Data.repeat(4));
        System.out.println(Data.replace('s', 'a'));
        System.out.println(Data.replaceAll("d", "a"));
        System.out.println(Data.toUpperCase());
        System.out.println(Data.toLowerCase());

        // Reverse the String Using loop: Letter By Letter; in single character.
        String b1 = "SarvesH KumaR"; // Taking any String value with Referene
        String rev = " "; // Taking any blank String with Reference which is used to store the Value after
                          // Reverse
        for (int i = b1.length() - 1; i >= 0; i--) // we use the length method to calculate the length of the String,
                                                   // and uss for loop to reverse from last index(so we subtract by 1)
                                                   // and Uses i >=0 to starting point is 0 and decreasing the value
        {
            rev += b1.charAt(i); // now use rev string to store the reverse value of first string with character
                                 // and call i;
        }
        System.out.println(rev); // lastly print the value

        // Reverse the String Using loop with array: Word By Word;
        String c = "Sarvesh Kumar is my name"; // Taking any String value with Referene
        String re[] = c.split(" "); // taking a array to split and Store the Value in himself of the first string
                                    // after reverse;
        System.out.println(c); // just print
        for (int i = re.length - 1; i >= 0; i--) {
            System.out.print(re[i] + " ");
        }
        System.out.println();
        String gg = new String();
        System.out.println(gg); // give blank space
        StringAll al = new StringAll();
        System.out.println(al); // give the hash value
    }
}
