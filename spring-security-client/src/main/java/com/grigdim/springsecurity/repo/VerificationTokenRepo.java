package com.grigdim.springsecurity.repo;

import com.grigdim.springsecurity.entity.PasswordResetToken;
import com.grigdim.springsecurity.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepo extends JpaRepository<VerificationToken, Long> {
    VerificationToken findByToken(String token);
}
