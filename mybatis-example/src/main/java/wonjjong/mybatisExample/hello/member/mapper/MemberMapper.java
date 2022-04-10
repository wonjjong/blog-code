package wonjjong.mybatisExample.hello.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import wonjjong.mybatisExample.hello.member.vo.MemberInfoVO;

import java.util.List;

@Mapper
public interface MemberMapper {
   List<MemberInfoVO> selectTotalMemberList();
   List<MemberInfoVO> findMemberByName(String name);

}
