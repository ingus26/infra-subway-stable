package nextstep.subway.map.domain;

import lombok.*;
import nextstep.subway.station.domain.Station;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SubwayPath {
    private List<SectionEdge> sectionEdges;
    private List<Station> stations;

    public int calculateDistance() {
        return sectionEdges.stream().mapToInt(it -> it.getSection().getDistance()).sum();
    }
}
