/*
package com.petregisterofequipmentnew.front.feigns;

import com.petregisterofequipmentnew.back.dtos.AttributesDto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@Validated
public interface AttributesEndpoints {

    @GetExchange("api/v1/attributes/find-attributes-nameDevice/{nameDevice}")
    ResponseEntity<List<AttributesDto>> findAttributesByName(@PathVariable String nameDevice,
                                                             @RequestParam(value = "offset", defaultValue = "0") @Min(0) Integer offset,
                                                             @RequestParam(value = "limit", defaultValue = "10") @Min(1) @Max(100) Integer limit);

}
*/
