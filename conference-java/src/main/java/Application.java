import com.pluralsight.model.Speaker;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
        Speaker speaker = service.findAll().get(0);
        System.out.println("Name: " + speaker.getFirstName() + " " + speaker.getLastName());
        System.out.println( "seedNum: " + speaker.getSeedNum());
    }
}
