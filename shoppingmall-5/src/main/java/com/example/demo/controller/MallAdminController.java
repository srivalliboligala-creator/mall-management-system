package com.example.demo.controller;

import com.example.demo.entity.MallAdmin;
import com.example.demo.service.IMallAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/malladmin")
public class MallAdminController {

    @Autowired
    private IMallAdminService service;

    @PostMapping
    public MallAdmin add(@RequestBody MallAdmin admin) {
        return service.addMallAdmin(admin);
    }

    @GetMapping("/{id}")
    public MallAdmin get(@PathVariable Long id) {
        return service.searchMallAdmin(id);
    }

    @GetMapping
    public List<MallAdmin> getAll() {
        return service.getAllMallAdmin();
    }

    @PutMapping
    public MallAdmin update(@RequestBody MallAdmin admin) {
        return service.updateMallAdmin(admin);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteMallAdmin(id);
    }
}