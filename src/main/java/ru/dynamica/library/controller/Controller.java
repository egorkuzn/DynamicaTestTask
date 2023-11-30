package ru.dynamica.library.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dynamica.library.model.dto.common.BookDto;
import ru.dynamica.library.model.dto.response.ApiResponseDto;
import ru.dynamica.library.service.BookRentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/vi")
public class Controller {
    private final BookRentService bookRentService;

    @Operation(summary = "Вывод списка книг")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Список книг выведен")
    })
    @GetMapping("/books")
    public ResponseEntity<List<BookDto>> getBooks() {
        List<BookDto> response = bookRentService.getBooks();
        return ResponseEntity.ok(response);
    }
}
