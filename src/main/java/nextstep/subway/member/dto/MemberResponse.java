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
public class MemberResponse {
    private Long id;
    private String email;
    private Integer age;

    public static MemberResponse of(Member member) {
        return new MemberResponse(member.getId(), member.getEmail(), member.getAge());
    }
}
