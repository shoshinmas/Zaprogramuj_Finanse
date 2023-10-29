package com.zaprogramujzycie.finanse.user;

import com.zaprogramujzycie.finanse.security.authentication.RegisterDetailsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import java.util.List;
import java.util.Optional;

import static org.mapstruct.ReportingPolicy.ERROR;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ERROR)
public interface UserMapper {

/*
*Według mnie to jest poprawne mapowanie User-userDto
* RegistredDetailsDTO-User
* */
    @Mapping(target = "password", ignore = true)
    User toEntity(UserDTO userDTO);


    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "id", ignore = true)
    User toEntity(RegisterDetailsDTO registerDetailsDTO);
    UserDTO toDTO(User user);


    List<UserDTO> toDTOs(List<User> users);
    @Mapping(target = "password", ignore = true)
    RegisterDetailsDTO toRegisterDetailsDTO(UserDTO userDTO);
    void updateEntity(@MappingTarget Optional<User> userToUpdate, UserDTO updatedUser);//


/*
    @Mapping(target = "password", ignore = true)


    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "id", ignore = true)
    User toEntity(UserDTO user);
    User toEntity(RegisterDetailsDTO user);


    @Mapping(target = "password", ignore = true)
    void updateEntity(@MappingTarget Optional<User> userToUpdate, UserDTO updatedUser);

    UserDTO toDTO(Optional<User> user);

    List<UserDTO> toDTOs(List<User> users);
*/
}
