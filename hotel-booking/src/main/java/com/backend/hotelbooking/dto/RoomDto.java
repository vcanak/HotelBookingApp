package com.backend.hotelbooking.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import org.apache.tomcat.util.codec.binary.Base64;


public class RoomDto {

    private Long id;
    private String roomType;
    private BigDecimal price;
    private boolean isBooked;
    private String photo;

    private List<BookedRoomDto> bookings;


    public RoomDto() {
    }


    public RoomDto(Long id, String roomType, BigDecimal price) {
        this.id = id;
        this.roomType = roomType;
        this.price = price;
    }
    public RoomDto(Long id, String roomType, BigDecimal price, byte[] photoInBytes) {
        this.id = id;
        this.roomType = roomType;
        this.price = price;
        this.photo = photoInBytes != null ? Base64.encodeBase64String(photoInBytes): null;
    }


    public RoomDto(Long id, String roomType, BigDecimal price, boolean isBooked, byte[] photoInBytes, List<BookedRoomDto> bookings) {
        this.id = id;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = isBooked;
        this.photo = photoInBytes != null ? Base64.encodeBase64String(photoInBytes): null;
        this.bookings = bookings;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isIsBooked() {
        return this.isBooked;
    }

    public boolean getIsBooked() {
        return this.isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<BookedRoomDto> getBookings() {
        return this.bookings;
    }

    public void setBookings(List<BookedRoomDto> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", roomType='" + getRoomType() + "'" +
            ", price='" + getPrice() + "'" +
            ", isBooked='" + isIsBooked() + "'" +
            ", photo='" + getPhoto() + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RoomDto)) {
            return false;
        }
        RoomDto roomDto = (RoomDto) o;
        return Objects.equals(id, roomDto.id) && Objects.equals(roomType, roomDto.roomType) && Objects.equals(price, roomDto.price) && isBooked == roomDto.isBooked && Objects.equals(photo, roomDto.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomType, price, isBooked, photo);
    }


}
