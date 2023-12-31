package com.bank.bankink.persistence.repository;

import com.bank.bankink.persistence.entity.CardEntity;
import com.bank.bankink.persistence.entity.InactivatedCardsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InactivatedCardsRepository extends JpaRepository<InactivatedCardsEntity, Long> {

    Optional<InactivatedCardsEntity> findByCardId(Long cardId);
}
