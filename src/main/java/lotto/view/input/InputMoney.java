package lotto.view.input;

import lotto.exception.InvalidNumericInputException;

public class InputMoney extends InputView {
    private static final String MONEY_MESSAGE = "구입금액을 입력해 주세요.";

    public Integer getCorrectValue() {
        boolean isCorrect = false;
        String result = "";
        while (!isCorrect) {
            try {
                result = getValue();
                isCorrect = validate(result);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return Integer.parseInt(result);
    }

    private String getValue() {
        printMessage(MONEY_MESSAGE);
        String result = inputValue();
        return result;
    }

    private boolean validate(String inputValue) {
        try {
            Integer.parseInt(inputValue);
            return true;
        } catch (NumberFormatException e) {
            throw new InvalidNumericInputException();
        }
    }
}
