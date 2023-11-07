
## controller

---

### LottoController

---
#### 필드

- `private final InputView`
  - 입력을 받기 위한 UI
- `private final OutputView`
  - 로또 번호 출력 및 당첨 통계를 위한 UI 
- `private final LottoService`
  - 로또를 구매하고, 당첨 번호를 입력 받는 등의 게임 로직을 수행


--- 
#### 메소드

- 

## service

---
#### 메소드


## domain

--- 

### `class` Lotto

---
#### 필드

- `private List<Integer> `

---

### `enum` ErrorType

나올 수 있는 에러 상태와 검증 로직을 가지는 상수 
---
#### 상수
- NOT_A_NUMBER
  - Msg : "(은)는 숫자여야 합니다."
  - test(String input)
    - input을 받아 숫자로 변환한다.
    - 변환할 수 없으면 NumberFormatException이 발생하면 `true`를 반환한다.
    - 모두 바꿀 수 있으면 error가 아니므로 `false`를 반환한다.
    
- NOT_IN_THOUSANDS
  - Msg : "(은)는 1000원 단위여야 합니다."
  - test(String input)
    - input을 받아 숫자로 변환하고 1000원 단위인지 확인한다.
    - 1000원 단위가 아니면 `true`를 반환한다.
    - 1000원 단위면 `false`를 반환한다.
    
- OUT_OF_RANGE
  - Msg : "(은)는 1부터 45 사이의 수여야 합니다."
  - test(String input)
    - input을 받아 숫자로 변환한 뒤 각 수가 1 ~ 45 사이의 수인지 확인한다.
    - 하나의 숫자라도 1 ~ 45의 범위에 있으면 `true`를 반환한다.
    - 모두 1 ~ 45의 범위에 있으면 `false`를 반환한다.
    
- LENGTH_NOT_MATCH
  - Msg : "(은)는 6자리여야 합니다."
  - test(String input)
    - input을 ',' 기준으로 나눠 길이가 6자리인지 확인한다.
    - 6자리가 아니면 `true`를 반환한다.
    - 6자리면 `false`를 반환한다.
    
- DUPLICATED_NUMBER
  - Msg : "(은)는 중복된 수 입니다."
  - test(String input)
    - input을 `,`로 나눠 각 문자열을 숫자로 변환한다.
    - 숫자가 중복되면 `true`를 하나도 중복이 없으면 `false`를 반환한다.
    
- NOT_AN_ERROR
  - Msg : "정상"
  - null
    - 모든 에러에 해당하지 않으면 NOT_AN_ERROR를 내뱉는다.

#### 필드
- `private String errorMsg`
  - 에러 메시지
- `private Predicate<String> errorCheck`
  - 해당 에러가 맞는지 확인하는 함수형 인터페이스

#### 메소드
- `public String getErrorMsg()`
  - 에러 메시지를 반환한다.

### `enum` Procedure

---

## view

---

### InputView

---
#### 필드

- `private final String purchaseMessage`
  - "구입금액을 입력해 주세요."
- `private final String winningNumberMessage`
  - "당첨 번호를 입력해 주세요."
- `private final String bonusNumberMessage`
  - "보너스 번호를 입력해 주세요."

---
#### 메소드
- `public String inputPurchaseAmount()`
  - purchaseMessage를 출력하고 `Console.readLine()`으로 한 줄을 읽어온다.
- `public String drawWinningString()`
  - winningNumberMessage를 출력하고 `Console.readLine()`으로 한 줄을 읽어온다.
- `public String drawBonusString()`
  - bonusNumberMessage를 출력하고 `Console.readLine()`으로 한 줄을 읽어온다.
---

### OutputView
