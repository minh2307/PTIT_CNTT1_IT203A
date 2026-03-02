package src.ss15.b3;

import javax.security.auth.login.AccountLockedException;
import java.util.Stack;

public class MedicationProcessChecker {
    public Stack<String> stack;

    public MedicationProcessChecker() {
        stack = new Stack<>();
    }

    public boolean checkProcess(String[] actions) {
        reset();

        for (int i = 0; i < actions.length; i++) {
            String action = actions[i];

            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("Medication");
                System.out.println("PUSH -> Phát thuốc");

            } else if (action.equalsIgnoreCase("POP")) {

                if (stack.isEmpty()) {
                    System.out.println("Lỗi tại bước " + (i + 1) +
                            ": POP khi Stack đang rỗng!");
                    return false;
                }

                stack.pop();
                System.out.println("POP -> Hoàn tất phát thuốc");

            } else {
                System.out.println("Lệnh không hợp lệ tại bước " + (i + 1));
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Kết thúc ca trực nhưng vẫn còn thuốc chưa hoàn tất!");
            return false;
        }

        System.out.println("Quy trình hợp lệ.");
        return true;
    }

    void reset() {
        stack.clear();
    }

    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] case1 = {"PUSH", "PUSH", "POP", "POP"};
        String[] case2 = {"PUSH", "POP", "POP"};
        String[] case3 = {"PUSH", "PUSH", "POP"};

        System.out.println("Case 1:");
        checker.checkProcess(case1);

        System.out.println("\nCase 2:");
        checker.checkProcess(case2);

        System.out.println("\nCase 3:");
        checker.checkProcess(case3);
    }
}
