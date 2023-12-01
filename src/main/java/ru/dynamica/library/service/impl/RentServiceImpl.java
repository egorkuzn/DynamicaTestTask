package ru.dynamica.library.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamica.library.mapper.RentMapper;
import ru.dynamica.library.model.dto.RentDto;
import ru.dynamica.library.repository.RentRepository;
import ru.dynamica.library.service.RentService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RentServiceImpl implements RentService {
    private final RentRepository rentRepository;
    private final RentMapper rentMapper;

    @Override
    public List<RentDto> getRents() {
        return rentRepository.findAll()
                .stream()
                .map(rentMapper::rentEnityToRentDto)
                .collect(Collectors.toList());
    }

    @Override
    public RentDto addRent(RentDto newRent) {
        rentRepository.save(rentMapper.rentDtoToRentEnity(newRent));
        return newRent;
    }
}
