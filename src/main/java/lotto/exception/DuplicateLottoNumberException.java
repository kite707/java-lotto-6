package lotto.exception;

public class DuplicateLottoNumberException extends IllegalArgumentException {
    private static final String ERROR_MESSAGE = "[ERROR] 입력된 로또 번호에 중복되는 값이 있습니다.";

    public DuplicateLottoNumberException() {
        super(ERROR_MESSAGE);
    }
}
