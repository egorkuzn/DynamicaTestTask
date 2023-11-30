package ru.dynamica.library.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dynamica.library.model.dto.RentDto;
import ru.dynamica.library.service.RentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/rent")
@Api(value = "api/v1/rent", tags = "API аренды")
public class RentController {
    private final RentService rentService;

    @GetMapping
    @ApiOperation("Получение списка взятых книг")
    public ResponseEntity<List<RentDto>> getRents() {
        List<RentDto> response = rentService.getRents();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    @ApiOperation("Взятие книги клиентом библиотеки")
    public ResponseEntity<RentDto> addRent(@RequestBody RentDto newRent) {
        RentDto response = rentService.addRent(newRent);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping
    @ApiOperation("Возврат книги в библиотеку")
    public ResponseEntity<RentDto> removeRent(@RequestBody RentDto rent) {
        RentDto response = rentService.addRent(rent);
        return ResponseEntity.ok(response);
    }
}
