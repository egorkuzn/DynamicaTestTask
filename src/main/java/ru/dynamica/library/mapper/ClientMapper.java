package ru.dynamica.library.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.dynamica.library.model.dto.ClientDto;
import ru.dynamica.library.model.entity.ClientEntity;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClientMapper {
    ClientDto authorEnityToAuthorDto(ClientEntity authorEntity);

    ClientEntity authorDtoToAuthorEnity(ClientDto authorDto);
}
