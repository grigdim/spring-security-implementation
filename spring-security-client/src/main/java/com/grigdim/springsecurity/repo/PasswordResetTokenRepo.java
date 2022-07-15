package com.grigdim.springsecurity.repo;

import com.grigdim.springsecurity.entity.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordResetTokenRepo extends JpaRepository<PasswordResetToken,Long> {
    PasswordResetToken findByToken(String token);
}
