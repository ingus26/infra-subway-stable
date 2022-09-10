package nextstep.subway.auth.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TokenResponse {
    private String accessToken;
}
