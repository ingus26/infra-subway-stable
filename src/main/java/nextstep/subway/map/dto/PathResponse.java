package nextstep.subway.map.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import nextstep.subway.station.dto.StationResponse;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PathResponse {
    private List<StationResponse> stations;
    private int distance;
}
