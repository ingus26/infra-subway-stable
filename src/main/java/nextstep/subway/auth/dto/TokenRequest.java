package nextstep.subway.auth.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TokenRequest {
    private String email;
    private String password;
}
