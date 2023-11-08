package lotto.exception;

public class ZeroMoneyException extends IllegalArgumentException {
    private static final String ERROR_MESSAGE = "[ERROR] 0원 이상의 돈을 입력해주세요.";

    public ZeroMoneyException() {
        super(ERROR_MESSAGE);
    }
}
