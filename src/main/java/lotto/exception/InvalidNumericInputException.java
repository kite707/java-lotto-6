package lotto.exception;

public class InvalidNumericInputException extends IllegalArgumentException {
    private static final String ERROR_MESSAGE = "[ERROR] 숫자를 입력해 주세요.";

    public InvalidNumericInputException() {
        super(ERROR_MESSAGE);
    }
}
