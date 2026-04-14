public class Main {
    public static void main(String[] args) {

        String text = "Salem 123 Alem qalai 2026";

        // Тапсырма 1: Дауысты және дауыссыз әріптер санын табу
        int vowels = 0, consonants = 0;
        String vowelLetters = "aeiouAEIOUәіүұөӘІҮҰӨ";

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelLetters.indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Дауысты: " + vowels + ", Дауыссыз: " + consonants);

        // Тапсырма 2: Бос орындарды алып тастау
        String noSpaces = text.replace(" ", "");
        System.out.println("Бос орынсыз: " + noSpaces);

        // Тапсырма 3: Ең ұзын сөз
        String[] words = text.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Ең ұзын сөз: " + longest);

        // Тапсырма 4: Таңбалар саны (бос орынсыз)
        int charCount = text.replace(" ", "").length();
        System.out.println("Таңба саны: " + charCount);

        // Тапсырма 5: Белгілі сөзден басталуын тексеру
        System.out.println("Starts with 'Salem': " + text.startsWith("Salem"));

        // Тапсырма 6: Белгілі таңбамен аяқталу
        System.out.println("Ends with '6': " + text.endsWith("6"));

        // Тапсырма 7: Кері айналдыру
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Кері жол: " + reversed);

        // Тапсырма 8: Барлық сандарды алып тастау
        String noNumbers = text.replaceAll("[0-9]", "");
        System.out.println("Сандарсыз: " + noNumbers);

        // Тапсырма 9: Дауысты әріптерді * ауыстыру
        String replacedVowels = text.replaceAll("[aeiouAEIOUәіүұөӘІҮҰӨ]", "*");
        System.out.println("Дауыстылар *: " + replacedVowels);

        // Тапсырма 10: Тек цифрлардан тұра ма?
        String onlyDigits = "123456";
        boolean isDigits = onlyDigits.matches("\\d+");
        System.out.println("Тек цифр ма: " + isDigits);
    }
}