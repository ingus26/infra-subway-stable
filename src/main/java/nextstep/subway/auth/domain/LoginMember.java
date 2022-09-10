package nextstep.subway.auth.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LoginMember {
    private Long id;
    private String email;
    private Integer age;
}
