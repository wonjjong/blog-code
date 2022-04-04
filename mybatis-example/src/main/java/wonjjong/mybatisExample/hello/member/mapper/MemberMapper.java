package wonjjong.mybatisExample.hello.member.mapper;

import wonjjong.mybatisExample.hello.member.vo.MemberInfoVO;

import java.util.List;

public interface MemberMapper {
    public List<MemberInfoVO> selectTotalMemberList();
}
