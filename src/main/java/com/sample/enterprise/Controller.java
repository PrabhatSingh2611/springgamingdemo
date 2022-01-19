package com.sample.enterprise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


//Sending response in right format
@RestController
public class Controller {
    @Autowired
    private BusinessService businessService;


    //"/sum" =>100
    @GetMapping("/sum")
    public long displaySum() {
        return businessService.claculateSum();
    }
}


//Business Logic
@Component
class BusinessService {

    @Autowired
    private DataService dataService;

    public long claculateSum() {
        List<Integer> data = dataService.retrieveData();
        return data.stream().reduce(Integer::sum).get();
    }
}


//Getting data
@Component
class DataService {
    public List<Integer> retrieveData() {
        return Arrays.asList(10, 20, 30, 40, 50, 60);
    }
}


