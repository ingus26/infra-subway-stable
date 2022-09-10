package nextstep.subway.station.dto;

import lombok.*;
import nextstep.subway.station.domain.Station;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Setter
public class StationRequest {
    private String name;

    public Station toStation() {
        return Station.builder().name(name).build();
    }
}
