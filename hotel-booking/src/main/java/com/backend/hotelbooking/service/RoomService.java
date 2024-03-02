package com.backend.hotelbooking.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Optional;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.backend.hotelbooking.model.Room;
import com.backend.hotelbooking.repository.RoomRepository;


@Service
public class RoomService implements IRoomService {

    private final RoomRepository roomRepository;


    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Room addRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) {
        // TODO Auto-generated method stub

        Room room = new Room();
        room.setRoomType(roomType);
        room.setPrice(roomPrice);
        if (!photo.isEmpty()){

            try {
                byte[] photoInBytes = photo.getBytes();
                Blob blob = new SerialBlob(photoInBytes);
                room.setPhoto(blob);
            } catch (IOException|SQLException e) {
                // TODO: handle exception
               e.printStackTrace();
            }
        }

        return roomRepository.save(room);
    }

    @Override
    public Optional<Room> getRoomByID(Long id) {
        return roomRepository.findById(id);

    }

}
