package banhang.web.service;

import banhang.web.repository.ISaleDetailRepo;
import banhang.web.service.impl.ISaleDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SaleDetail implements ISaleDetailService {
    @Autowired
    ISaleDetailRepo iSaleDetailRepo;

    @Override
    public banhang.web.model.SaleDetail addSaleDetail(banhang.web.model.SaleDetail saleDetail) {
        return null;
    }

    @Override
    public banhang.web.model.SaleDetail updateSaleDetail(banhang.web.model.SaleDetail saleDetail) {
        return null;
    }

    @Override
    public Optional<banhang.web.model.SaleDetail> getSaleDetailById(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<banhang.web.model.SaleDetail> getSaleDetailByAll(Long id) {
        return null;
    }

    @Override
    public void deleteSaleDetail(Long id) {

    }
}
