package com.GestionParc.Gestion_Parc.Repository;

import com.GestionParc.Gestion_Parc.Entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model,Long> {

    Model findByIdModel(Long id);
}
