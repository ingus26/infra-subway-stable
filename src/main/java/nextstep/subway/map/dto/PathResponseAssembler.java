package nextstep.subway.map.dto;

import lombok.AllArgsConstructor;
import nextstep.subway.map.domain.SubwayPath;
import nextstep.subway.station.dto.StationResponse;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class PathResponseAssembler {

    public static PathResponse assemble(SubwayPath subwayPath) {
        List<StationResponse> stationResponses = subwayPath.getStations().stream()
                .map(StationResponse::of)
                .collect(Collectors.toList());

        int distance = subwayPath.calculateDistance();

        return PathResponse.builder().stations(stationResponses).distance(distance).build();
    }
}
