package lotto.view.input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lotto.exception.DuplicateLottoNumberException;
import lotto.exception.InvalidNumericInputException;
import lotto.exception.LottoLengthException;

public class InputLottoNumber extends InputView {
    private static final String LOTTO_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final Integer LOTTO_LENGTH = 6;


    public List<Integer> getCorrectValue() {
        boolean isCorrect = false;
        String input = "";
        while (!isCorrect) {
            try {
                input = getValue();
                isCorrect = validate(input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return convertToIntegerList(split(input));
    }

    private String getValue() {
        printMessage(LOTTO_NUMBER_MESSAGE);
        String result = inputValue();
        return result;
    }

    private boolean validate(String input) {
        List<String> split = split(input);
        validateLength(split);
        validateIsNumber(split);
        List<Integer> integerInputList = convertToIntegerList(split);
        validateDuplication(integerInputList);
        return true;
    }

    private List<String> split(String input) {
        List<String> inputList = Arrays.asList(input.split(","));
        return inputList;
    }

    private boolean validateLength(List<String> inputList) {
        if (inputList.size() != LOTTO_LENGTH) {
            throw new LottoLengthException();
        }
        return true;
    }

    private boolean validateIsNumber(List<String> inputList) {
        for (String input : inputList) {
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                throw new InvalidNumericInputException();
            }
        }
        return true;
    }

    private boolean validateDuplication(List<Integer> inputList) {
        Set<Integer> numSet = new HashSet<>(inputList);
        if (numSet.size() != inputList.size()) {
            throw new DuplicateLottoNumberException();
        }
        return true;
    }

    private List<Integer> convertToIntegerList(List<String> inputList) {
        List<Integer> integerInputList = new ArrayList<Integer>();
        for (String input : inputList) {
            integerInputList.add(Integer.parseInt(input));
        }
        return integerInputList;
    }
}
