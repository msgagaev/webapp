package main;

import ru.javawebinar.webapp.model.ContactType;

import java.util.EnumMap;
import java.util.Map;

/**
 * GKislin
 * 12.04.2016
 */
public class Main5 {
    public static void main(String[] args) {
        Map<ContactType, String> map = new EnumMap<ContactType, String>(ContactType.class) {
            int i;

            {
                put(ContactType.HOME_PAGE, "homePage");
                print();
            }

            void print() {

            }
        };

        map.put(ContactType.PHONE, "1122");
        System.out.println(map);
    }
}
