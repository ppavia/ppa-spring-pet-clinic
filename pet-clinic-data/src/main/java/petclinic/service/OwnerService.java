package petclinic.service;

import petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner fingById(Long id);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
