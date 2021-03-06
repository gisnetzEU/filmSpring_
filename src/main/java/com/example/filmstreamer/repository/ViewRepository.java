package com.example.filmstreamer.repository;

import com.example.filmstreamer.model.View;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface ViewRepository extends CrudRepository<View, UUID> {

}