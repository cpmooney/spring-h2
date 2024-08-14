package com.moondog.labs.sdr_hooks;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface ThingRepository extends CrudRepository<Thing, UUID> {
}
