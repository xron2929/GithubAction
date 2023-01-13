package dev.be.githubaction;

import dev.be.Member;
import dev.be.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

// @ActiveProfiles("localtest")
@ActiveProfiles("test")
@SpringBootTest
public class GithubActionLocalTests {
    @Autowired
    MemberRepository memberRepository;
    @Test
    void contextLoads() {
        System.out.println("memberRepository = " + memberRepository);
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
    }
/*
    @Test
    void newExceptionTest() {
        throw new RuntimeException("일부러 에러 발생하고 단위 테스트");
    }

 */

}
