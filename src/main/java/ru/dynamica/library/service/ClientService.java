package ru.dynamica.library.service;

import ru.dynamica.library.model.dto.ClientDto;

import java.util.List;

public interface ClientService {
    ClientDto addClient(ClientDto newClient);

    ClientDto updateClient(Long id, String attribute, String newValue);

    List<ClientDto> getClients();
}
