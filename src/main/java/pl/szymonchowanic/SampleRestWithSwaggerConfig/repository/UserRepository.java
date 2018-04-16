package pl.szymonchowanic.SampleRestWithSwaggerConfig.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szymonchowanic.SampleRestWithSwaggerConfig.entity.User;



public interface UserRepository  extends JpaRepository<User, Long>{
}
