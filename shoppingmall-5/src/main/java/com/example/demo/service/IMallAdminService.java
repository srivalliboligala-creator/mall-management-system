package com.example.demo.service;


import com.example.demo.entity.MallAdmin;
import java.util.List;

public interface IMallAdminService {
    MallAdmin addMallAdmin(MallAdmin admin);
    MallAdmin updateMallAdmin(MallAdmin admin);
    void deleteMallAdmin(Long id);
    MallAdmin searchMallAdmin(Long id);
    List<MallAdmin> getAllMallAdmin();
}
