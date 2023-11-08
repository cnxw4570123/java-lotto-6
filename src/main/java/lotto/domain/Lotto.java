package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import lotto.constant.Condition;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto() {
        this.numbers = Randoms.pickUniqueNumbersInRange(Condition.MIN_DRAW_NUMBER, Condition.MAX_DRAW_NUMBER,
                Condition.SIX_WINNING_NUMBERS);
        sortNumbersAscending();
    }

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
        sortNumbersAscending();
    }

    private void validate(List<Integer> numbers) {
        Procedure.DRAW_WINNING_NUMBERS.checkPossibleError(numbers);
    }

    // TODO: 추가 기능 구현
    private void sortNumbersAscending(){
        this.numbers.sort(Integer::compareTo);
    }

}
