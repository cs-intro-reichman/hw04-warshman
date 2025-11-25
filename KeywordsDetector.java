public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
        // System.out.println(contains("leverage is key", keywords));
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            //if sentences[i] contains a keyword in keywords, print it
            if (contains(sentences[i].toLowerCase(), keywords)) {
                System.out.println(sentences[i]);
            } 
            
        }

        

    }

    public static boolean contains(String sentence, String[] keywords) {
        for (int i = 0; i < keywords.length; i++) {
            // Check if keyword[i] is in sentence:
            // check for every substring starting for i to (i+length-1) of keyword in the sentence. Make sure to increment i
            // keep going as long as i + keyword.length()  <= sentence.length
            String keyword = keywords[i].toLowerCase();
            int keywordLen = keyword.length();
            for (int j = 0; j < sentence.length() - keywordLen; j++) {
                if (sentence.substring(j, j + keywordLen).equals(keyword)) {
                    return true;
                }
            }
            
        }

        return false;
    }
}
