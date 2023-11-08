# 로또

## 기능 목록

- [ ] 입력받은 금액을 바탕으로 발행할 로또의 수를 계산한다. 1000으로 나누어 떨어지지 않으면 에러를 발생시킨다. LottoManagement/getLottoCount()
- [ ] 입력받은 금액을 바탕으로 여러장의 로또를 발행한다. LottoManagement/generateLotto()
    - [ ] 1-45사이의 중복되지 않는 수 6개를 생성한다. Numbergenerator/createRandomNumbers()
- [ ] 발행한 로또와 입력받은 로또를 비교한다.- Lotto/compare()
    - [ ] 몇 개의 숫자가 같은지 알 수 있다. - Judgement/correctCount()
    - [ ] 보너스 볼이 일치하는 알 수 있다.- Judgement/correctBonusBall()
- [ ] 로또들의 총 상금을 계산한다. - LottoManagement/getTotalPrize()
    - [ ] 로또의 당첨 등수를 토대로 상금을 계산한다. Lotto/getPrize()
        - 1등: 6개 번호 일치 / 2,000,000,000원
        - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
        - 3등: 5개 번호 일치 / 1,500,000원
        - 4등: 4개 번호 일치 / 50,000원
        - 5등: 3개 번호 일치 / 5,000원
- [ ] 수익률을 계산한다. LottoManagement/getRateOfReturn()

### view

- [ ] 사용자로부터 값을 입력받는다.
    - [x] 구입 금액 입력 받기 InputMoney
    - [x] 보너스 번호 입력 받기 InputBonusNumber
    - [ ] 로또 번호 입력 받기 InputLottoNumber
- [ ] 사용자에게 값을 출력해준다.
    - [ ] 로또 번호들 출력 OutputLottosNumber
    - [ ] 당첨 통계 출력 OutputLottoPrize
    - [ ] 로또 구매 개수 출력 OutputBuyNumber
    - [ ] 총 수익률 출력 OutputRateOfReturn

## 기능 요구 사항

로또 게임 기능을 구현해야 한다. 로또 게임은 아래와 같은 규칙으로 진행된다.

- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
    - 1등: 6개 번호 일치 / 2,000,000,000원
    - 2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
    - 3등: 5개 번호 일치 / 1,500,000원
    - 4등: 4개 번호 일치 / 50,000원
    - 5등: 3개 번호 일치 / 5,000원
      로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.
      로또 1장의 가격은 1,000원이다.
      당첨 번호와 보너스 번호를 입력받는다.
      사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
      사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
      Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.