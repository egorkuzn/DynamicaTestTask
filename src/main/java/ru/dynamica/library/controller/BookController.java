package ru.dynamica.library.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dynamica.library.model.dto.BookDto;
import ru.dynamica.library.service.BookService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/book")
@Api(value = "api/v1/book", tags = "API книг")
public class BookController {
    private final BookService bookService;

    @GetMapping
    @ApiOperation("Получение списка книг")
    public ResponseEntity<List<BookDto>> getBooks() {
        List<BookDto> response = bookService.getBooks();
        return ResponseEntity.ok(response);
    }

    @PostMapping
    @ApiOperation("Добавление книги")
    public ResponseEntity<BookDto> addBook(@RequestBody BookDto newBook) {
        BookDto response = bookService.addBook(newBook);
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/${id}")
    @ApiOperation("Редактирование информации о книге")
    public ResponseEntity<BookDto> updateBook(
            @PathVariable Long id,
            @RequestParam String attribute,
            @RequestParam String newValue
    ) {
        BookDto response = bookService.updateBook(id, attribute, newValue);
        return ResponseEntity.ok(response);
    }
}
