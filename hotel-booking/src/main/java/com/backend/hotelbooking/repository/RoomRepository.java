package com.backend.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.hotelbooking.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

}
