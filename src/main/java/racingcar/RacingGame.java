package racingcar;

import java.util.List;

/**
 * n대의 자동차가 참여할 수 있다.
 * 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
 * 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
 * 자동차 경주 게임을 완료한 후 누가 우승했는지를 구할 수 있다. 우승자는 한 명 이상일 수 있다.
 */
public class RacingGame {

    private final CarGroup cars;
    private final RandomNumberGenerator numberGenerator = new CarRandomNumberGenerator();

    public RacingGame(List<Car> cars) {
        this.cars = new CarGroup(cars);
    }

    public void play(int round) {
        for (int i = 0; i < round; i++) {
            cars.move(numberGenerator);
        }
        cars.getWinners();
    }
}