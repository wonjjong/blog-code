package wonjjong.mybatisExample.hello.member.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import wonjjong.mybatisExample.hello.member.mapper.MemberMapper;
import wonjjong.mybatisExample.hello.member.vo.MemberInfoVO;

import java.util.List;

@Repository
public class MemberRepository {

    @Autowired
    private SqlSession sqlSession;

    @Autowired
    private MemberMapper memberMapper;

    public List<MemberInfoVO> selectTotalMemberList() {
        return memberMapper.selectTotalMemberList();
    }

    public List<MemberInfoVO> findMemberByName(String name) {
        return memberMapper.findMemberByName(name);
    }
}