package banhang.web.service;

import banhang.web.model.BillOfSale;
import banhang.web.repository.IBillOfSaleRepo;
import banhang.web.service.impl.IBillOfSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BillOfSaleService implements IBillOfSaleService {
    @Autowired
    IBillOfSaleRepo iBillOfSaleRepo;

    @Override
    public BillOfSale addBillOfSale(BillOfSale billOfSale) {
        return null;
    }

    @Override
    public BillOfSale updateBillOfSale(BillOfSale billOfSale) {
        return null;
    }

    @Override
    public Optional<BillOfSale> getBillOfSaleById(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<BillOfSale> getBillOfSaleByAll(Long id) {
        return null;
    }

    @Override
    public void deleteBillOfSale(Long id) {

    }
}
