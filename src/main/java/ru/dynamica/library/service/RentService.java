package ru.dynamica.library.service;

import ru.dynamica.library.model.dto.RentDto;

import java.util.List;

public interface RentService {
    List<RentDto> getRents();

    RentDto addRent(RentDto newRent);
}
