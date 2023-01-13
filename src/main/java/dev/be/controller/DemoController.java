package dev.be.controller;


import dev.be.Member;
import dev.be.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${override.value}")
    private String value;
    @Autowired MemberRepository memberRepository;
    @GetMapping("/demo")
    public String demo() {
        return "demo " + value;
    }
    @GetMapping("/member")
    public void saveMember() {
        Member member = new Member();
        member.setUuid("hello");
        memberRepository.save(member);
    }
}