package ss04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B6 {
    public static void main(String[] args) {

        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc không đáng đọc";

        String[] blackList = {"ngu ngốc", "ngu", "xấu", "tệ"};

        String regex = "(" + String.join("|", blackList) + ")";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(review);

        StringBuilder sb = new StringBuilder(review);

        while (matcher.find()) {
            String badWord = matcher.group();
            String stars = "*".repeat(badWord.length());

            sb.replace(matcher.start(), matcher.end(), stars);

            matcher = pattern.matcher(sb.toString());
        }

        String result = sb.toString();

        if (result.length() > 200) {
            int cutIndex = 200;
            while (cutIndex > 0 && result.charAt(cutIndex) != ' ') {
                cutIndex--;
            }
            result = result.substring(0, cutIndex) + "...";
        }

        System.out.println("Đánh giá sau xử lý:");
        System.out.println(result);
    }
}
