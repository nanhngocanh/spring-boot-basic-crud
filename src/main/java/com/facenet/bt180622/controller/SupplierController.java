package com.facenet.bt180622.controller;

import com.facenet.bt180622.dto.SupplierDTO;
import com.facenet.bt180622.model.Supplier;
import com.facenet.bt180622.service.SupplierService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/allSupplier")
    public List<SupplierDTO> getAll(){
        List<Supplier> suppliers = supplierService.getAll();
        List<SupplierDTO> supplierDTOS = suppliers.stream().map(supplier -> modelMapper.map(supplier,SupplierDTO.class)).collect(Collectors.toList());
        return supplierDTOS;
    }
    @GetMapping("/supplier/{id}")
    public SupplierDTO getSupplier(@PathVariable("id") Integer id) {
        Optional<Supplier> supplier = supplierService.getSupplier(id);
        SupplierDTO supplierDTO = modelMapper.map(supplier,SupplierDTO.class);
        return supplierDTO;
    }
    @PostMapping("/addSupplier")
    public SupplierDTO addSupplier(@RequestBody Supplier item) {
        Supplier supplier = supplierService.addSupplier(item);
        SupplierDTO supplierDTO = modelMapper.map(supplier,SupplierDTO.class);
        return supplierDTO;
    }
    @PutMapping("/updateSupplier/{id}")
    public SupplierDTO updateSupplier(@PathVariable("id") Integer id, @RequestBody Supplier item) {
        Supplier supplier = supplierService.updateSupplier(id, item);
        SupplierDTO supplierDTO = modelMapper.map(supplier,SupplierDTO.class);
        return supplierDTO;
    }
    @DeleteMapping("/deleteSupplier/{id}")
    public String deleteSupplier(@PathVariable("id") Integer id){
        supplierService.deleteSupplier(id);
        return "deleted";
    }
}
