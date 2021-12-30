package platform.services;

import platform.dto.EndpointDTO;
import platform.dto.MemberDTO;

import java.util.List;

/**
 * @author Alex Giazitzis
 */
public interface WebService {
    List<MemberDTO> getMembers();
    List<EndpointDTO> getEndpoints();
}
