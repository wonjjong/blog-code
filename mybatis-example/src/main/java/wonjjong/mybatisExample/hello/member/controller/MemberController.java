package wonjjong.mybatisExample.hello.member.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import wonjjong.mybatisExample.hello.member.service.MemberService;
import wonjjong.mybatisExample.hello.member.vo.MemberInfoVO;

import java.util.List;


@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
@Slf4j
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/memberList")
    public List<MemberInfoVO> memberList() {
        return memberService.selectTotalMemberList();
    }

    @GetMapping("/memberListByName")
    public List<MemberInfoVO> findMemberByName(@RequestParam("name") String name){
        log.info("test");
        return memberService.findMemberByName(name);
    }

    @GetMapping("/memberList/{id}")
    //parameterType은 생략 가능
    public MemberInfoVO findMemberById(@PathVariable Integer id) {
        return memberService.findMemberById(id);
    }

    @GetMapping("/memberListTotCnt")
    public int getMemberListTotCnt() {
        return memberService.getMemberListTotCnt();
    }

}
