package ru.dynamica.library.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dynamica.library.model.dto.LibraryDto;
import ru.dynamica.library.service.LibraryService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/")
@Api(value = "api/v1/", tags = "API библиотеки")
public class LibraryController {
    private final LibraryService libraryService;

    @PostMapping
    @ApiOperation("Добавление клиента")
    public ResponseEntity<LibraryDto> getLibraryInfo() {
        LibraryDto response = libraryService.getLibraryInfo();
        return ResponseEntity.ok(response);
    }
}
