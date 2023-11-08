package lotto.controller;

import lotto.view.input.InputBonusNumber;
import lotto.view.input.InputMoney;

public class LottoController {
    public void start() {
        int money = getMoney();
        getBonusNumer();
    }

    private Integer getBonusNumer() {
        InputBonusNumber inputBonusNumber = new InputBonusNumber();
        int bonusNumber = inputBonusNumber.getCorrectValue();
        return bonusNumber;
    }

    private Integer getMoney() {
        InputMoney inputMoney = new InputMoney();
        int money = inputMoney.getCorrectValue();
        return money;
    }
}
