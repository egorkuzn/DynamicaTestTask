package ru.dynamica.library.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import ru.dynamica.library.model.dto.RentDto;
import ru.dynamica.library.model.entity.RentEntity;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RentMapper {
    RentDto rentEnityToRentDto(RentEntity authorEntity);

    RentEntity rentDtoToRentEnity(RentDto authorDto);
}
