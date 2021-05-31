package app.calendar;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EventRepository extends CrudRepository<Event, Long> {

    @Query("FROM Event WHERE mo=true ORDER BY start ASC")
    List<Event> findAllMondays();

    @Query("FROM Event WHERE tu=true ORDER BY start ASC")
    List<Event> findAllTuesdays();

    @Query("FROM Event WHERE we=true ORDER BY start ASC")
    List<Event> findAllWednesdays();

    @Query("FROM Event WHERE th=true ORDER BY start ASC")
    List<Event> findAllThursdays();

    @Query("FROM Event WHERE fr=true ORDER BY start ASC")
    List<Event> findAllFridays();

    @Query("FROM Event WHERE sa=true ORDER BY start ASC")
    List<Event> findAllSaturdays();

    @Query("FROM Event ORDER BY room ASC")
    List<Event> findAllOrderByRoomAsc();
}