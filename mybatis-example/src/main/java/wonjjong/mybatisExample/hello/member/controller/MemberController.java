package wonjjong.mybatisExample.hello.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wonjjong.mybatisExample.hello.member.service.MemberService;
import wonjjong.mybatisExample.hello.member.vo.MemberInfoVO;
import java.util.List;


@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/memberList")
    public List<MemberInfoVO> memberList() {
        return memberService.selectTotalMemberList();
    }
}
