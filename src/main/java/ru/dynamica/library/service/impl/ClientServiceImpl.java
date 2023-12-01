package ru.dynamica.library.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamica.library.exception.NotFoundException;
import ru.dynamica.library.mapper.ClientMapper;
import ru.dynamica.library.model.dto.ClientDto;
import ru.dynamica.library.model.entity.ClientEntity;
import ru.dynamica.library.repository.ClientRepository;
import ru.dynamica.library.service.ClientService;

import java.text.DateFormat;
import java.text.ParseException;
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
        ClientEntity clientEntity = clientRepository.findById(id).orElseThrow(() -> new NotFoundException("Книга не найдена"));
        updateByAttribute(clientEntity, attribute, newValue);
        clientRepository.save(clientEntity);
        return clientMapper.authorEnityToAuthorDto(clientEntity);
    }

    @Override
    public List<ClientDto> getClients() {
        return clientRepository.findAll()
                .stream()
                .map(clientMapper::authorEnityToAuthorDto)
                .collect(Collectors.toList());
    }

    /**
     * Я знаю, что это можно было сделать через рефлекшн, но уже пофиг.
     *
     * Внутри используется <code>DateFormat</code>.
     * Поэтому для этой задачи нужны дополнительные данные.
     */
    private void updateByAttribute(
            ClientEntity clientEntity,
            String attribute,
            String newValue
    ) {
        switch (attribute) {
            case "name":
                clientEntity.setName(newValue);
                break;
            case "surname":
                clientEntity.setSurname(newValue);
                break;
            case "fathername":
                clientEntity.setFathername(newValue);
                break;
            case "birthday":
                DateFormat df = DateFormat.getDateInstance();
                try {
                    clientEntity.setBirthday(df.parse(newValue));
                } catch (ParseException e) {
                    throw new NotFoundException("Входной формат даты некорректный. Не получилось спарсить.");
                }
                break;
            default:
                throw new NotFoundException("Поле для обновления не найдено");
        }
    }

    private ClientEntity findClientById(String newValue) {
        return clientRepository.findById(
                Long.parseLong(newValue)
        ).orElseThrow(() ->
                new NotFoundException("Автор в репозитории не найден" +
                        " по такому id, поэтому не получилось обновить книгу")
        );
    }
}
