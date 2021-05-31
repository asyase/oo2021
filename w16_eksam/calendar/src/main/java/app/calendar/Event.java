package app.calendar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String event;
    private String start;
    private String end;
    private String room;
    private boolean mo = false;
    private boolean tu = false;
    private boolean we = false;
    private boolean th = false;
    private boolean fr = false;
    private boolean sa = false;


    public Event(String event, String start, String end, String room, String day) {
       // super();
        this.event = event;
        this.start = start;
        this.end = end;
        this.room = room;
        for (int i = 0; i < day.length(); i++) {
            switch(day.charAt(i)){
                case '1':
                    this.mo = true;
                    break;
                case '2':
                    this.tu = true;
                    break;
                case '3':
                    this.we = true;
                    break;
                case '4':
                    this.th = true;
                    break;
                case '5':
                    this.fr = true;
                    break;
                case '6':
                    this.sa = true;
                    break;
            }
        }
    }

}
