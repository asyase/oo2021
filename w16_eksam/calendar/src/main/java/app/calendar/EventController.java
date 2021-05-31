package app.calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class EventController {

    @Autowired
    EventRepository eventRepository;


    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/events")
    public String events(Model model) {
        List<Event> events = eventRepository.findAllMondays();
        model.addAttribute("countMo", events.size());
        model.addAttribute("mondays", events);


        model.addAttribute("tuesdays", eventRepository.findAllTuesdays());
        model.addAttribute("wednesdays", eventRepository.findAllWednesdays());
        model.addAttribute("thursdays", eventRepository.findAllThursdays());
        model.addAttribute("fridays", eventRepository.findAllFridays());
        model.addAttribute("saturdays", eventRepository.findAllSaturdays());
        return "events";
    }

    @PostMapping("/add")
    public String add(@RequestParam String event, @RequestParam String start, @RequestParam String end, @RequestParam String room, @RequestParam String day, Model model) {

        Event e = new Event(event, start, end, room, day);
        eventRepository.save(e);

        model.addAttribute("mondays", eventRepository.findAllMondays());
        model.addAttribute("tuesdays", eventRepository.findAllTuesdays());
        model.addAttribute("wednesdays", eventRepository.findAllWednesdays());
        model.addAttribute("thursdays", eventRepository.findAllThursdays());
        model.addAttribute("fridays", eventRepository.findAllFridays());
        model.addAttribute("saturdays", eventRepository.findAllSaturdays());
        return "redirect:/events";
    }

    @PostMapping("/todoDelete/{id}")
    public String delete(@PathVariable long id, Model model) {
        eventRepository.deleteById(id);
        model.addAttribute("mondays", eventRepository.findAllMondays());
        model.addAttribute("tuesdays", eventRepository.findAllTuesdays());
        model.addAttribute("wednesdays", eventRepository.findAllWednesdays());
        model.addAttribute("thursdays", eventRepository.findAllThursdays());
        model.addAttribute("fridays", eventRepository.findAllFridays());
        model.addAttribute("saturdays", eventRepository.findAllSaturdays());
        return "redirect:/events";
    }

}
