package dev.be.githubaction;

import dev.be.Member;
import dev.be.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;

// test마다 이렇게 추가해서 쓰는게 나을듯 고민하고 나온 결정임..
@ActiveProfiles("test")
@SpringBootTest
class GithubActionApplicationTests {
    @Autowired MemberRepository memberRepository;
    // 나중에 테스트 자동화 할 생각임 지금은 properties 다중화 연동 시도해보고
    //
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


}
