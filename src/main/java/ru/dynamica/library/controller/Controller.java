package ru.dynamica.library.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dynamica.library.model.dto.BookDto;
import ru.dynamica.library.service.BookRentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
@Api(value = "api/v1", tags = "API библиотеки")
public class Controller {
    private final BookRentService bookRentService;

    @GetMapping("/books")
    @ApiOperation("Получение списка книг")
    public ResponseEntity<List<BookDto>> getBooks() {
        List<BookDto> response = bookRentService.getBooks();
        return ResponseEntity.ok(response);
    }
}
