package ru.dynamica.library.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.dynamica.library.model.dto.BookDto;
import ru.dynamica.library.model.entity.BookEntity;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {
    BookDto authorEnityToAuthorDto(BookEntity authorEntity);

    BookEntity authorDtoToAuthorEnity(BookDto authorDto);
}