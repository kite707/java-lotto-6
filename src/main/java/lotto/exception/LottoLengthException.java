package lotto.exception;

public class LottoLengthException extends IllegalArgumentException {
    private static final String ERROR_MESSAGE = "[ERROR] 로또 번호는 6자리여야 합니다.";

    public LottoLengthException() {
        super(ERROR_MESSAGE);
    }
}
