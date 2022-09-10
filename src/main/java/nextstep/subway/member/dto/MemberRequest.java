package nextstep.subway.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nextstep.subway.member.domain.Member;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MemberRequest {
    private String email;
    private String password;
    private Integer age;

    public Member toMember() {
        return new Member(email, password, age);
    }
}
