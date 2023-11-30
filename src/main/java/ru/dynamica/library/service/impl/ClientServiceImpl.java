package ru.dynamica.library.service.impl;

import org.springframework.stereotype.Service;
import ru.dynamica.library.model.dto.ClientDto;
import ru.dynamica.library.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public ClientDto addClient(ClientDto newClient) {
        return null;
    }

    @Override
    public ClientDto updateClient(int id, String attribute, String newValue) {
        return null;
    }
}
