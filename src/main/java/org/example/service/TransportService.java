package org.example.service;

import org.example.entities.Transport;


public interface TransportService {

     Transport getTransportById(int id) ;
    void DeleteTranspById(int id);
    void  saveTrans(Transport transport);
    Transport updateTrans(int id,Transport transport);
}
