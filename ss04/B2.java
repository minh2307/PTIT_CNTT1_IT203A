package ss04;

public class B2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa Toán lớp 12, kệ: A1-102, tình trạng mới";

        if(description.contains("kệ")){
            int start = description.indexOf("kệ:") + "kệ:".length();
            int end = description.indexOf(",",start);
            String shelfcode = "";
            if (end != -1) {
                shelfcode = description.substring(start,end).trim();
            }

            System.out.printf("Vị trí tìm thấy: %s\n", shelfcode);
            System.out.printf("Mô tả mới: %s ", description);
        }



    }
}
