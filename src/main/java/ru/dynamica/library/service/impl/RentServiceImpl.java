package ru.dynamica.library.service.impl;

import org.springframework.stereotype.Service;
import ru.dynamica.library.model.dto.BookDto;
import ru.dynamica.library.model.dto.RentDto;
import ru.dynamica.library.service.RentService;

import java.util.Collections;
import java.util.List;

@Service
public class RentServiceImpl implements RentService {
    @Override
    public List<RentDto> getRents() {
        return null;
    }

    @Override
    public RentDto addRent(RentDto newRent) {
        return null;
    }
}
