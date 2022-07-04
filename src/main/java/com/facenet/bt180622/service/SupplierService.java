package com.facenet.bt180622.service;

import com.facenet.bt180622.model.Supplier;
import com.facenet.bt180622.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier>getAll(){
        return supplierRepository.findAll();
    }
    public Optional<Supplier>getSupplier(Integer id) {
        return supplierRepository.findById(id);
    }
    public Supplier addSupplier(Supplier item) {
        return supplierRepository.save(item);
    }
    public Supplier updateSupplier(Integer id, Supplier item){
        Supplier supplier = supplierRepository.findById(id).get();
        supplier.setName(item.getName());
        supplier.setAddress(item.getAddress());
        supplier.setPhoneNumber(item.getPhoneNumber());
        return supplierRepository.save(supplier);
    }
    public void deleteSupplier(Integer id) {
        Supplier supplier = supplierRepository.findById(id).get();
        supplierRepository.delete(supplier);
    }
}
