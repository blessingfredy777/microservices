package com.easybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass //setting this class as superclass when extended by other classes
@Getter @Setter  @ToString
public class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false) // for letting the compiler know that during update, this data must not be altered
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false) // for letting the compiler know that on inserting new values, this column must not be updated
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    private String updatedBy;

}
