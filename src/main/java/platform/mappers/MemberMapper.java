package platform.mappers;

import org.mapstruct.Mapper;
import platform.dto.MemberDTO;
import platform.entities.Member;

import java.util.List;

/**
 * @author Alex Giazitzis
 */
@Mapper
public interface MemberMapper {

    MemberDTO getDto(Member member);

    List<MemberDTO> getDtoList(List<Member> memberList);
}
