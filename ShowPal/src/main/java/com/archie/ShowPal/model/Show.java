package com.archie.ShowPal.model;

import jakarta.persistence.Entity;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;
@Getter
@Setter
@Entity
public class Show extends BaseModel{
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Auditorium auditorium;

}
