package wonjjong.mybatisExample.hello.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import wonjjong.mybatisExample.hello.member.repository.MemberRepository;
import wonjjong.mybatisExample.hello.member.vo.MemberInfoVO;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<MemberInfoVO> selectTotalMemberList() {
        return memberRepository.selectTotalMemberList();
    }

    public List<MemberInfoVO> findMemberByName(String name) {
        return memberRepository.findMemberByName(name);
    }
}