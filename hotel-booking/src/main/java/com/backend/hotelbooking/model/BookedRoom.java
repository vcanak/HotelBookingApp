package com.backend.hotelbooking.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "booked_rooms")
public class BookedRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @Column(name = "check_in_date")
    private LocalDateTime checkInDate;
    @Column(name = "check_out_date")
    private LocalDateTime checkOutDate;
    @Column(name = "customer_full_name")
    private String customerFullName;
    @Column(name = "customer_emails")
    private String customerEmail;
    @Column(name = "num_of_adults")
    private int numOfAdults;
    @Column(name = "num_of_kids")
    private int numOfKids;
    @Column(name = "num_of_total_customer")
    private int totalNumOfCustomer;
    @Column(name = "booking_confirmation_code")
    private String bookingConfirmationCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;



    public BookedRoom() {
    }



    private void getTotalNumOfCustomers(){
        this.totalNumOfCustomer = this.numOfAdults + this.numOfKids;
    };

    public Long getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public BookedRoom(Long bookingId, LocalDateTime checkInDate, LocalDateTime checkOutDate, String customerFullName, String customerEmail, int numOfAdults, int numOfKids, int totalNumOfCustomer, String bookingConfirmationCode, Room room) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.customerFullName = customerFullName;
        this.customerEmail = customerEmail;
        this.numOfAdults = numOfAdults;
        this.numOfKids = numOfKids;
        this.totalNumOfCustomer = totalNumOfCustomer;
        this.bookingConfirmationCode = bookingConfirmationCode;
        this.room = room;
    }

    public LocalDateTime getCheckInDate() {
        return this.checkInDate;
    }

    public void setCheckInDate(LocalDateTime checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDateTime getCheckOutDate() {
        return this.checkOutDate;
    }

    public void setCheckOutDate(LocalDateTime checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getCustomerFullName() {
        return this.customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getNumOfAdults() {
        return this.numOfAdults;
    }

    public void setNumOfAdults(int numOfAdults) {
        this.numOfAdults = numOfAdults;
        getTotalNumOfCustomers();
    }

    public int getNumOfKids() {
        return this.numOfKids;
    }

    public void setNumOfKids(int numOfKids) {
        this.numOfKids = numOfKids;
        getTotalNumOfCustomers();
    }

    public int getTotalNumOfCustomer() {
        return this.totalNumOfCustomer;
    }

    public String getBookingConfirmationCode() {
        return this.bookingConfirmationCode;
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
        this.bookingConfirmationCode = bookingConfirmationCode;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }



}
