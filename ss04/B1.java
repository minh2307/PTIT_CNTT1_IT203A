package ss04;

public class B1 {
    public static String capitalizeWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String title = "   lập Trình JaVa    Cơ bản     ";
        String author = "nguyễn văn a";
        title = title.trim().replaceAll("\\s+", " ").toUpperCase();
        author = author.trim().replaceAll("\\s+", " ");;
        author = capitalizeWords(author);
        System.out.println(title + " - Tác giả: " + author);

    }
}
