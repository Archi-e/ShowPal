package com.archie.ShowPal.model;

import com.archie.ShowPal.model.constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Show show;
    @OneToMany
    private List<ShowSeat> showSeats;
    private double totalAmount;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;

}
