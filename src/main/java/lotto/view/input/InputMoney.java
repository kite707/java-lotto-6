package lotto.view.input;

import lotto.exception.InvalidNumericInputException;
import lotto.exception.MoneyDivisionException;
import lotto.exception.ZeroMoneyException;

public class InputMoney extends InputView {
    private static final String MONEY_MESSAGE = "구입금액을 입력해 주세요.";
    private static final Integer MONEY_UNIT = 1000;

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
        boolean isValidated = false;
        isValidated = validateIsNumber(inputValue);
        isValidated = validateDivision(Integer.parseInt(inputValue));
        isValidated = validateZeroMoney(Integer.parseInt(inputValue));
        return isValidated;
    }

    private boolean validateIsNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            throw new InvalidNumericInputException();
        }
    }

    private boolean validateDivision(int input) {
        if (input % MONEY_UNIT != 0) {
            throw new MoneyDivisionException();
        }
        return true;
    }

    private boolean validateZeroMoney(int input) {
        if (input == 0) {
            throw new ZeroMoneyException();
        }
        return true;
    }

}
