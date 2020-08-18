import java.util.List;
import java.util.ArrayList;

public class DataBase {

    public static List<CustomerDTO> customerList =new ArrayList();

    static {
        customerList.add(new CustomerDTO("001","Kamal","Panadura",1000));
        customerList.add(new CustomerDTO("002","Daham","Kaluthara",2000));
        customerList.add(new CustomerDTO("003","Numal","Galle",3000));
        customerList.add(new CustomerDTO("004","Bandara","Colombo",4000));
        customerList.add(new CustomerDTO("005","Vasantha","Kandy",5000));
    }
}
