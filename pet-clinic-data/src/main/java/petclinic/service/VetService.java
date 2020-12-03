package petclinic.service;

import petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet fingById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}
