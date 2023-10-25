package example.batch.step;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void write(List<? extends String> messages) throws Exception {
        for(String msg : messages){
            System.out.println("#Writer Step: " + msg);
        }
    }

}