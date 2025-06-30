package com.service.userstore.mcs_motor_transferencia.controller;

import com.service.userstore.mcs_motor_transferencia.builder.ResponseUserDtoMockBuilder;
import com.service.userstore.mcs_motor_transferencia.common.Response;
import com.service.userstore.mcs_motor_transferencia.dto.ResponseUserDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/service")
@AllArgsConstructor
@Slf4j
public class ControllerUserStore {

    @GetMapping("/{username}")
    public ResponseEntity<Response<ResponseUserDto>> getGroupUser(@PathVariable String username) {
        log.info("**** Request username ****.: {}", username);
        // Build ResponseUserDto
        return new ResponseEntity<>(Response.<ResponseUserDto>builder().data(ResponseUserDtoMockBuilder.buildMock(username)).code(200).message("ok").build(), HttpStatus.OK);
    }
}
