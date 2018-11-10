package ru.itmo.webmail.model.repository;

import ru.itmo.webmail.model.domain.EmailConfirmation;

public interface EmailConfirmationRepository {
    void save(EmailConfirmation confirmation, String secret);
    EmailConfirmation findBySecret(String secret);
}
