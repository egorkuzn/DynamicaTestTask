package ru.dynamica.library.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.dynamica.library.model.dto.AuthorDto;
import ru.dynamica.library.model.entity.AuthorEntity;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorMapper {
    AuthorDto authorEnityToAuthorDto(AuthorEntity authorEntity);

    AuthorEntity authorDtoToAuthorEnity(AuthorDto authorDto);
}
