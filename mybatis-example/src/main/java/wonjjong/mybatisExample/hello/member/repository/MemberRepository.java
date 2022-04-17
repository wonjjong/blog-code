package wonjjong.mybatisExample.hello.member.repository;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import wonjjong.mybatisExample.hello.member.mapper.MemberMapper;
import wonjjong.mybatisExample.hello.member.vo.MemberInfoVO;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final SqlSession sqlSession;

    private final MemberMapper memberMapper;

    public List<MemberInfoVO> selectTotalMemberList() {
        return memberMapper.selectTotalMemberList();
    }

    public List<MemberInfoVO> findMemberByName(String name) {
        return memberMapper.findMemberByName(name);
    }

    public MemberInfoVO findMemberById(Integer id) {
        return memberMapper.findMemberById(id);
    }

    public int getMemberListTotCnt() {
        return memberMapper.getMemberListTotCnt();
    }
}