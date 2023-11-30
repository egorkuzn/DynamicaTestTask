package ru.dynamica.library.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamica.library.mapper.ClientMapper;
import ru.dynamica.library.model.dto.ClientDto;
import ru.dynamica.library.repository.ClientRepository;
import ru.dynamica.library.service.ClientService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public ClientDto addClient(ClientDto newClient) {
        clientRepository.save(clientMapper.authorDtoToAuthorEnity(newClient));
        return newClient;
    }

    @Override
    public ClientDto updateClient(Long id,
                                  String attribute,
                                  String newValue) {
        // TODO: написать обновление клиентов
        return null;
    }

    @Override
    public List<ClientDto> getClients() {
        return clientRepository.findAll()
                .stream()
                .map(clientMapper::authorEnityToAuthorDto)
                .collect(Collectors.toList());
    }
}
