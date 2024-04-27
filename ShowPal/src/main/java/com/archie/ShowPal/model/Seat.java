package com.archie.ShowPal.model;

import com.archie.ShowPal.model.constant.SeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int row;
    private int column;
    @ManyToOne
    private Auditorium auditorium;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;

}
