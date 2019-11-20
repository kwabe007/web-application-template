package se.kth.sda6.skeleton.Concerts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ConcertRepositioy {

    @Repository
    public interface ConcertRepository extends JpaRepository <Concert,Long>  {

    }
}
