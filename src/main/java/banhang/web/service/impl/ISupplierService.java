package banhang.web.service.impl;

import banhang.web.model.Supplier;

import java.util.Optional;

public interface ISupplierService {
    public Supplier addSupplier(Supplier supplier);

    public Supplier updateSupplier(Supplier supplier);

    public Optional<Supplier> getSupplierById(Long id);

    public Iterable<Supplier> getSupplierByAll(Long id);

    public void deleteSupplier(Long id);
}
