package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    private Duck5 ducky;

    @Override
    public String toString() {
        return ", в зайце утка " + ducky.toString();
    }

    @Autowired
    public void setDucky(Duck5 ducky) {
        this.ducky = ducky;
    }
}