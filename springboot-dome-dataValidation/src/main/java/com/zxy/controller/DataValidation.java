package com.zxy.controller;

import com.zxy.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class DataValidation {

    @RequestMapping("/data")
    public String validationInfo(@Valid User user, BindingResult result){
        List<ObjectError> errorList = result.getAllErrors();
        System.out.println(result.getErrorCount());
        for (ObjectError objectError : errorList) {
            System.out.println(objectError.getDefaultMessage());
            return objectError.getDefaultMessage();
        }
        return "success";
    }
}
