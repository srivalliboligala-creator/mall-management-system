package com.example.demo.service;


import com.example.demo.entity.MallAdmin;
import com.example.demo.repository.IMallAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MallAdminServiceImpl implements IMallAdminService {

    @Autowired
    private IMallAdminRepository repository;

    @Override
    public MallAdmin addMallAdmin(MallAdmin admin) {
        return repository.save(admin);
    }

    @Override
    public MallAdmin updateMallAdmin(MallAdmin admin) {
        return repository.save(admin);
    }

    @Override
    public void deleteMallAdmin(Long id) {
        repository.deleteById(id);
    }

    @Override
    public MallAdmin searchMallAdmin(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<MallAdmin> getAllMallAdmin() {
        return repository.findAll();
    }
}