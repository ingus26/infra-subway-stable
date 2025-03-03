package nextstep.subway.map.application;

import nextstep.subway.line.application.LineService;
import nextstep.subway.line.domain.Line;
import nextstep.subway.map.domain.SubwayPath;
import nextstep.subway.map.dto.PathResponse;
import nextstep.subway.map.dto.PathResponseAssembler;
import nextstep.subway.station.application.StationService;
import nextstep.subway.station.domain.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MapService {
    private LineService lineService;
    private StationService stationService;
    private PathService pathService;

    @Autowired
    public MapService(LineService lineService, StationService stationService, PathService pathService) {
        this.lineService = lineService;
        this.stationService = stationService;
        this.pathService = pathService;
    }

    @Cacheable(value = "path")
    public PathResponse findPath(Long source, Long target) {
        System.out.println("findPath");

        List<Line> lines = lineService.findLines();
        System.out.println("lines : " + lines.toString());
        Station sourceStation = stationService.findById(source);
        System.out.println("sourceStation : " + sourceStation.toString());
        Station targetStation = stationService.findById(target);
        System.out.println("targetStation : " + targetStation.toString());
        SubwayPath subwayPath = pathService.findPath(lines, sourceStation, targetStation);

        return PathResponseAssembler.assemble(subwayPath);
    }
}
