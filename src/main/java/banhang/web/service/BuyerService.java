package banhang.web.service;

import banhang.web.model.Buyer;
import banhang.web.repository.IBuyerRepo;
import banhang.web.service.impl.IBuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BuyerService implements IBuyerService {
    @Autowired
    IBuyerRepo iBuyerRepo;
    @Override
    public Buyer addBuyer(Buyer buyer) {
        return null;
    }

    @Override
    public Buyer updateBuyer(Buyer buyer) {
        return null;
    }

    @Override
    public Optional<Buyer> getBuyerById(Long id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Buyer> getBuyerByAll(Long id) {
        return null;
    }

    @Override
    public void deleteBuyer(Long id) {

    }
}
