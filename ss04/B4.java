package ss04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B4 {

    public static void validateCard(String cardId) {

        Pattern pPrefix = Pattern.compile("^TV");
        Matcher mPrefix = pPrefix.matcher(cardId);

        if (!mPrefix.find()) {
            System.out.println("Thiếu tiền tố TV");
            return;
        }

        Pattern pYear = Pattern.compile("^TV\\d{4}");
        Matcher mYear = pYear.matcher(cardId);

        if (!mYear.find()) {
            System.out.println("Năm không hợp lệ");
            return;
        }

        Pattern pFull = Pattern.compile("^TV\\d{9}$");
        Matcher mFull = pFull.matcher(cardId);

        if (!mFull.matches()) {
            System.out.println("Định dạng mã thẻ không hợp lệ");
            return;
        }

        System.out.println("Mã hợp lệ");
    }

    public static void main(String[] args) {
        validateCard("AB202312345");
        validateCard("TV20A312345");
        validateCard("TV2023123");
        validateCard("TV202312345");
    }
}
