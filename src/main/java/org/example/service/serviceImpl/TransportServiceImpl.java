package org.example.service.serviceImpl;

import org.example.entities.Transport;
import org.example.repositories.TransportRepo;
import org.example.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TransportServiceImpl implements TransportService {
    @Autowired
    private TransportRepo transportRepo;


    @Override
    public Transport getTransportById(int id) {
      return   transportRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public void DeleteTranspById(int id) {
        transportRepo.deleteById(id);

    }

    @Override
    public void saveTrans(Transport transport) {
        transportRepo.save(transport);

    }

    @Override
    public Transport updateTrans(int id, Transport transport) {
        Transport currentTransp = transportRepo.findById(id).orElseThrow(RuntimeException::new);
        currentTransp.setLocalisation(transport.getLocalisation());
        currentTransp.setDurée(transport.getDurée());
        currentTransp.setNbDePlaces(transport.getNbDePlaces());
        currentTransp = transportRepo.save(transport);

        return currentTransp;

    }
}
