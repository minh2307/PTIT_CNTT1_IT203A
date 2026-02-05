package src.ss04;

public class B3 {
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};
        long startBuilder = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for (String t : transactions) {
            sb.append("Giao dịch: ")
                    .append(t)
                    .append("\n");
        }

        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;

        long startString = System.nanoTime();

        String s = "";
        for (String t : transactions) {
            s += "Giao dịch: " + t + "\n";
        }

        long endString = System.nanoTime();
        long timeString = endString - startString;

        System.out.println("--- BÁO CÁO MƯỢN SÁCH ---");
        System.out.println("Ngày tạo: 24/01/2026");
        System.out.print(sb);

        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeBuilder + " ns");
        System.out.println("Số thời gian thực thi đối với String (+): " + timeString + " ns");
    }
}
