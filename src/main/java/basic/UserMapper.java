package basic;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "version", target = "tel")
    UserDTO entityToDto(User user);

    void mergeDtoToEntity(UserDTO userDTO, @MappingTarget User user);

    List<UserDTO> convertListEntityToDto(List<User> users);
}
