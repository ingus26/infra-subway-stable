package study.unit;

import nextstep.subway.line.domain.Line;
import nextstep.subway.station.domain.Station;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("단위 테스트")
public class UnitTest {
    @DisplayName("단위 테스트 1")
    @Test
    void update() {
        // given
        String newName = "구분당선";

        Station upStation = Station.builder().name("강남역").build();
        Station downStation = Station.builder().name("광교역").build();
        Line line = new Line("신분당선", "RED", upStation, downStation, 10);
        Line newLine = Line.builder().name(newName).color("GREEN").build();

        // when
        line.update(newLine);

        // then
        assertThat(line.getName()).isEqualTo(newName);
    }
}
