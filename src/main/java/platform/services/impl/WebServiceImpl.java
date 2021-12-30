package platform.services.impl;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import platform.dto.EndpointDTO;
import platform.dto.MemberDTO;
import platform.mappers.EndpointMapper;
import platform.mappers.MemberMapper;
import platform.repos.EndpointRepository;
import platform.repos.MemberRepository;
import platform.services.WebService;

import java.util.List;

/**
 * @author Alex Giazitzis
 */
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Service
public class WebServiceImpl implements WebService {
    MemberRepository memberRepository;
    MemberMapper memberMapper;
    EndpointRepository endpointRepository;
    EndpointMapper endpointMapper;

    @Override
    public List<MemberDTO> getMembers() {
        return memberMapper.getDtoList(memberRepository.getAllBy());
    }

    @Override
    public List<EndpointDTO> getEndpoints() {
        return endpointMapper.getListDto(endpointRepository.getAllBy());
    }
}
