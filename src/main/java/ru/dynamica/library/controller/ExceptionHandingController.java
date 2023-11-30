package ru.dynamica.library.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.dynamica.library.exception.NotFoundException;
import ru.dynamica.library.model.dto.ApiError;
import ru.dynamica.library.model.dto.ApiResponseDto;

import javax.servlet.http.HttpServletRequest;

public class ExceptionHandingController {
    /**
     * Согласовывается обычно api, скопировал из старого проекта
     */
    private static final int NOT_FOUND_ERROR_CODE = 4;

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiResponseDto<Void>> handleNotFoundException(HttpServletRequest request, Exception exception) {
        return getApiErrorResponse(NOT_FOUND_ERROR_CODE, exception.getMessage());
    }

    private ResponseEntity<ApiResponseDto<Void>> getApiErrorResponse(int errorCode, String errorMessage) {
        ApiError apiErrorResponse = ApiError.builder()
                .code(errorCode)
                .message(errorMessage)
                .build();

        return ResponseEntity.ok(
                ApiResponseDto.<Void>builder()
                        .error(apiErrorResponse)
                        .build());
    }

}
