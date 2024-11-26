package com.senai.eli.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.eli.Model.Gt;

@Repository
public interface GtRepository extends JpaRepository<Gt, Long> {

}