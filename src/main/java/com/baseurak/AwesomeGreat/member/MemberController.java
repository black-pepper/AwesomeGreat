package com.baseurak.AwesomeGreat.member;
import com.baseurak.AwesomeGreat.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    MemberRepository memberRepository = ac.getBean("memberRepository", MemberRepository.class);

    private String redirect(String route){
        return "<meta http-equiv=\"refresh\" content=\"0;url=" + route + "\">";
    }

    @GetMapping("/join")
    public List<Member> addForm(Member member){
        return memberRepository.findAll();
    }

    @PostMapping("/join")
    public String save(Member member, BindingResult bindingResult) {
        System.out.println(member.getId());
        if (bindingResult.hasErrors()) {
            return redirect("/join");
        }

        memberRepository.save(member);
        return redirect("/main");
    }
}
