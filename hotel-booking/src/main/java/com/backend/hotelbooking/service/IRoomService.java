package com.backend.hotelbooking.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.backend.hotelbooking.model.Room;

public interface IRoomService {

    Room addRoom(MultipartFile photo, String roomType, BigDecimal roomPrice);

    Optional<Room> getRoomByID(Long id);

}
