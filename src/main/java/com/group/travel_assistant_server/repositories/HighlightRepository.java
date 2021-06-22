package com.group.travel_assistant_server.repositories;
import com.group.travel_assistant_server.entities.Highlight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HighlightRepository extends JpaRepository<Highlight, Integer>
{
    List<Highlight> findAllByUsername(String username);
    List<Highlight> findAll();
}
