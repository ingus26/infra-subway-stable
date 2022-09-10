package nextstep.subway.map.domain;

import lombok.*;
import nextstep.subway.line.domain.Section;
import org.jgrapht.graph.DefaultWeightedEdge;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SectionEdge extends DefaultWeightedEdge {
    private Section section;
    private Long lineId;

    @Override
    protected Object getSource() {
        return this.section.getUpStation();
    }

    @Override
    protected Object getTarget() {
        return this.section.getDownStation();
    }

    @Override
    protected double getWeight() {
        return this.section.getDistance();
    }
}
