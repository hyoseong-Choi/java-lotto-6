package lotto;
import camp.nextstep.edu.missionutils.Console;
public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        int totalPrice, lottoCount;
        while (true) {
            System.out.println("구입금액을 입력해 주세요.");
            try {
                totalPrice = Integer.parseInt(Console.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] 숫자만 입력해 주세요!");
            }
        }
        lottoCount = totalPrice / 1000;
    }
}
