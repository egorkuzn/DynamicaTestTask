package ru.dynamica.library.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dynamica.library.model.dto.ClientDto;
import ru.dynamica.library.service.ClientService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/client")
@Api(value = "api/v1/client", tags = "API клиента")
public class ClientController {
    private final ClientService clientService;

    @PostMapping
    @ApiOperation("Добавление клиента")
    public ResponseEntity<ClientDto> addClient(@RequestBody ClientDto newClient) {
        ClientDto response = clientService.addClient(newClient);
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/${id}")
    @ApiOperation("Редактирование клиента")
    public ResponseEntity<ClientDto> updateClient(
            @PathVariable Long id,
            @RequestParam String attribute,
            @RequestParam String newValue
    ) {
        ClientDto response = clientService.updateClient(id, attribute, newValue);
        return ResponseEntity.ok(response);
    }
}
