package lotto.exception;

public class LottoNumberRangeException extends IllegalArgumentException {
    private static final String ERROR_MESSAGE = "[ERROR] 로또번호는 1-45 사이여야 합니다.";

    public LottoNumberRangeException() {
        super(ERROR_MESSAGE);
    }


}
