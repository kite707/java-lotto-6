package lotto.exception;

public class MoneyDivisionException extends IllegalArgumentException {
    private static final String ERROR_MESSAGE = "[ERROR] 1000원으로 나눠지는 값을 입력해주세요.";

    public MoneyDivisionException() {
        super(ERROR_MESSAGE);
    }
}
