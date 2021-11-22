package banhang.web.service.impl;

import banhang.web.model.BillOfSale;

import java.util.Optional;

public interface IBillOfSaleService {
    public BillOfSale addBillOfSale(BillOfSale billOfSale);

    public BillOfSale updateBillOfSale(BillOfSale billOfSale);

    public Optional<BillOfSale> getBillOfSaleById(Long id);

    public Iterable<BillOfSale> getBillOfSaleByAll(Long id);

    public void deleteBillOfSale(Long id);
}
