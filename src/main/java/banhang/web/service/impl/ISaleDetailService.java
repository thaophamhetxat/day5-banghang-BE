package banhang.web.service.impl;

import banhang.web.model.SaleDetail;

import java.util.Optional;

public interface ISaleDetailService {
    public SaleDetail addSaleDetail(SaleDetail saleDetail);

    public SaleDetail updateSaleDetail(SaleDetail saleDetail);

    public Optional<SaleDetail> getSaleDetailById(Long id);

    public Iterable<SaleDetail> getSaleDetailByAll(Long id);

    public void deleteSaleDetail(Long id);
}
