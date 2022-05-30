package ru.kostyanetskiy.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kostyanetskiy.it.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
