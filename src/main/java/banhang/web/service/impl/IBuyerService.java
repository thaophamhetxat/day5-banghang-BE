package banhang.web.service.impl;

import banhang.web.model.Buyer;

import java.util.Optional;

public interface IBuyerService {
    public Buyer addBuyer(Buyer buyer);

    public Buyer updateBuyer(Buyer buyer);

    public Optional<Buyer> getBuyerById(Long id);

    public Iterable<Buyer> getBuyerByAll(Long id);

    public void deleteBuyer(Long id);
}
