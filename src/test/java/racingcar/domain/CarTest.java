package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.Car;

class CarTest {

    @DisplayName("자동차는 전진 또는 멈출 수 있다.")
    @ParameterizedTest
    @ValueSource(strings = {"true", "false"})
    void canMoveRacingCar(boolean canMove) {
        Car car = new Car(() -> canMove);
        car.tryMove();
        assertThat(car.getPosition()).isEqualTo(canMove ? 1 : 0);
    }
}