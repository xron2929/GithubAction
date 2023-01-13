package dev.be.githubaction;

import dev.be.Member;
import dev.be.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class GithubActionApplicationTests {
    @Autowired MemberRepository memberRepository;
    // 나중에 테스트 자동화 할 생각임 지금은 properties 다중화 연동 시도해보고
    //
    @Test
    void contextLoads() {
    }
    @Test
    void saveTest() {
        Member member = new Member();
        member.setUuid("hello");
        memberRepository.save(member);
        assertThat(member).isNotNull();
        System.out.println("member = " + member);
        Member member1 = memberRepository.findById(member.getId()).get();
        System.out.println("member1 = " + member1);
        assertThat(member1).isEqualTo(member);
    }

}
