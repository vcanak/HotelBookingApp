package com.backend.hotelbooking.dto;

import java.time.LocalDateTime;
import java.util.Objects;


public class BookedRoomDto {


    private Long bookingId;
    private LocalDateTime checkInDate;
    private LocalDateTime checkOutDate;
    private String customerFullName;
    private String customerEmail;
    private int numOfAdults;
    private int numOfKids;
    private int totalNumOfCustomer;
    private String bookingConfirmationCode;
    private RoomDto room;


    public BookedRoomDto() {
    }


    public BookedRoomDto(Long bookingId, LocalDateTime checkInDate, LocalDateTime checkOutDate, String bookingConfirmationCode) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }

    public BookedRoomDto(Long bookingId, LocalDateTime checkInDate, LocalDateTime checkOutDate, String customerFullName, String customerEmail, int numOfAdults, int numOfKids, int totalNumOfCustomer, String bookingConfirmationCode, RoomDto room) {
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


    public Long getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
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
    }

    public int getNumOfKids() {
        return this.numOfKids;
    }

    public void setNumOfKids(int numOfKids) {
        this.numOfKids = numOfKids;
    }

    public int getTotalNumOfCustomer() {
        return this.totalNumOfCustomer;
    }

    public void setTotalNumOfCustomer(int totalNumOfCustomer) {
        this.totalNumOfCustomer = totalNumOfCustomer;
    }

    public String getBookingConfirmationCode() {
        return this.bookingConfirmationCode;
    }

    public void setBookingConfirmationCode(String bookingConfirmationCode) {
        this.bookingConfirmationCode = bookingConfirmationCode;
    }

    public RoomDto getRoom() {
        return this.room;
    }

    public void setRoom(RoomDto room) {
        this.room = room;
    }


    @Override
    public String toString() {
        return "{" +
            " bookingId='" + getBookingId() + "'" +
            ", checkInDate='" + getCheckInDate() + "'" +
            ", checkOutDate='" + getCheckOutDate() + "'" +
            ", customerFullName='" + getCustomerFullName() + "'" +
            ", customerEmail='" + getCustomerEmail() + "'" +
            ", numOfAdults='" + getNumOfAdults() + "'" +
            ", numOfKids='" + getNumOfKids() + "'" +
            ", totalNumOfCustomer='" + getTotalNumOfCustomer() + "'" +
            ", bookingConfirmationCode='" + getBookingConfirmationCode() + "'" +
            ", room='" + getRoom() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BookedRoomDto)) {
            return false;
        }
        BookedRoomDto bookedRoomDto = (BookedRoomDto) o;
        return Objects.equals(bookingId, bookedRoomDto.bookingId) && Objects.equals(checkInDate, bookedRoomDto.checkInDate) && Objects.equals(checkOutDate, bookedRoomDto.checkOutDate) && Objects.equals(customerFullName, bookedRoomDto.customerFullName) && Objects.equals(customerEmail, bookedRoomDto.customerEmail) && numOfAdults == bookedRoomDto.numOfAdults && numOfKids == bookedRoomDto.numOfKids && totalNumOfCustomer == bookedRoomDto.totalNumOfCustomer && Objects.equals(bookingConfirmationCode, bookedRoomDto.bookingConfirmationCode) && Objects.equals(room, bookedRoomDto.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, checkInDate, checkOutDate, customerFullName, customerEmail, numOfAdults, numOfKids, totalNumOfCustomer, bookingConfirmationCode, room);
    }


}
