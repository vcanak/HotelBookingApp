package com.backend.hotelbooking.controller;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.backend.hotelbooking.dto.RoomDto;
import com.backend.hotelbooking.model.Room;
import com.backend.hotelbooking.service.IRoomService;

@RestController
@RequestMapping("/api/rooms/")
public class RoomController {

    private final IRoomService roomService;

    public RoomController(IRoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/room/{roomId}")
    public ResponseEntity<Optional<RoomDto>> getRoomById(@PathVariable Long roomId){
        Optional<Room> theRoom = roomService.getRoomByID(roomId);
        return null;
    }
    @PostMapping("new")
    public ResponseEntity<RoomDto> addRoom(@RequestParam("photo") MultipartFile photo,
           @RequestParam("roomType") String roomType,
           @RequestParam("roomPrice") BigDecimal roomPrice){

        Room room = roomService.addRoom(photo, roomType, roomPrice);
        RoomDto roomDto = new RoomDto(room.getId(), room.getRoomType(), room.getPrice());
        return ResponseEntity.ok(roomDto);
    }
}
