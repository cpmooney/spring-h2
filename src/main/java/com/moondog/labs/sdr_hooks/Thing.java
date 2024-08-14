package com.moondog.labs.sdr_hooks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "things")
public class Thing {
    @Id
    @UuidGenerator
    public UUID id;

    public String color;
    public String shape;
}
