import java.util.regex.*;

public class AllRegexMethodsExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";
        String patternStr = "fox";

        // Compile the pattern
        Pattern pattern = Pattern.compile(patternStr);

        // Using Pattern methods
        String regexPattern = pattern.pattern();
        int patternFlags = pattern.flags();
        System.out.println("Regex Pattern: " + regexPattern);
        System.out.println("Pattern Flags: " + patternFlags);

        // Create a matcher for the input text
        Matcher matcher = pattern.matcher(text);

        // Using Matcher methods
        if (matcher.matches()) {
            System.out.println("Input matches the pattern.");
        } else {
            System.out.println("Input does not match the pattern.");
        }

        // Using Matcher find() method
        while (matcher.find()) {
            System.out.println("Found '" + matcher.group() + "' at index " + matcher.start());
        }

        // Using Matcher group(), start(), and end() methods
        matcher.reset();
        while (matcher.find()) {
            System.out.println("Found '" + matcher.group() + "' from index " +
                               matcher.start() + " to " + (matcher.end() - 1));
        }

        // Using Matcher replaceFirst() method
        String replacedText = matcher.replaceFirst("cat");
        System.out.println("After replaceFirst(): " + replacedText);

        // Using Matcher replaceAll() method
        String replacedAllText = matcher.replaceAll("dog");
        System.out.println("After replaceAll(): " + replacedAllText);

        // Using Matcher appendReplacement() and appendTail() methods
        StringBuffer sb = new StringBuffer();
        matcher.reset();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "elephant");
        }
        matcher.appendTail(sb);
        System.out.println("After appendReplacement() and appendTail(): " + sb.toString());

        // Using Pattern asPredicate() method
        Pattern digitPattern = Pattern.compile("\\d");
        String testString = "abc 123 xyz 456";
        String[] words = testString.split(" ");
        for (String word : words) {
            if (digitPattern.asPredicate().test(word)) {
                System.out.println("Contains digit: " + word);
            }
        }
    }
}


