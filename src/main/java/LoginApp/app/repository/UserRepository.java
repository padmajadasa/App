package LoginApp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import LoginApp.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
