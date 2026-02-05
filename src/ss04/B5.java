package src.ss04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B5 {
    public static void main(String[] args) {
        String text = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";
        String regex = "^(\\d{4}-\\d{2}-\\d{2})\\s\\|\\sUser:\\s(\\w+)\\s\\|\\sAction:\\s(\\w+)\\s\\|\\sBookID:\\s(\\w+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()){
            String date = matcher.group(1);
            String user = matcher.group(2);
            String action = matcher.group(3);
            String bookId = matcher.group(4);

            System.out.println("Ngày tháng: " + date);
            System.out.println("Người dùng: " + user);
            System.out.println("Hành động: " + action);
            System.out.println("Mã sách: " + bookId);
        }else {
            System.out.println("Chuôĩ không đúng định dạng");
        }


    }
}
