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

    public List<MemberInfoVO> selectTotalMemberList() {
        MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);

        return mapper.selectTotalMemberList();
    }
}