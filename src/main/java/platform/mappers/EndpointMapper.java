package platform.mappers;

import org.mapstruct.Mapper;
import platform.dto.EndpointDTO;
import platform.entities.Endpoint;

import java.util.List;

/**
 * @author Alex Giazitzis
 */
@Mapper
public interface EndpointMapper {

    EndpointDTO getDto(Endpoint endpoint);

    List<EndpointDTO> getListDto(List<Endpoint> endpointList);
}
