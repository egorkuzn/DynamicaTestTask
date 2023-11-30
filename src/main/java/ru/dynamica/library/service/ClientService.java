package ru.dynamica.library.service;

import ru.dynamica.library.model.dto.ClientDto;

public interface ClientService {
    ClientDto addClient(ClientDto newClient);

    ClientDto updateClient(int id, String attribute, String newValue);
}
