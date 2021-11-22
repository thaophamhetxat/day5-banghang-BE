package banhang.web.service;

import banhang.web.model.Supplier;
import banhang.web.repository.ISupplierRepo;
import banhang.web.service.impl.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SupplierService implements ISupplierService {
    @Autowired
    ISupplierRepo iSupplierRepo;
    @Override
    public Supplier addSupplier(Supplier supplier) {
        return null;
    }

    @Override
    public Supplier updateSupplier(Supplier supplier) {
        return null;
    }

    @Override
    public Optional<Supplier> getSupplierById(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Supplier> getSupplierByAll(Long id) {
        return null;
    }

    @Override
    public void deleteSupplier(Long id) {

    }
}
