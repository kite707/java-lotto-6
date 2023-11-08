package lotto.view.input;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    protected String inputValue() {
        return Console.readLine();
    }

    protected void printMessage(String message) {
        System.out.println(message);
    }

}
