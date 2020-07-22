package POJOMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddDetailsOfEmployee {
    public static void main(String[] args) {

        Map<Integer, EmployeePersonalDetails> map = new HashMap<>();


        //step 1:create a list of type employeePersonalDetails
        List<EmployeePersonalDetails> employeePersonalDetails = new ArrayList<EmployeePersonalDetails>();
        //step 3 : add the 30 employees to the employee details list


        for (int i = 1; i <= 30; i++) {

            //add details to the map
            map.put(i, new EmployeePersonalDetails(
                    "Prathap_" + i,
                    i * 10,
                    "CTS_" + i
            ));
        }


//        for (Map.Entry<Integer,EmployeePersonalDetails> emp:map.entrySet()){
//            System.out.println(emp.getValue().getEmpName());
//            System.out.println(emp.getValue().getPhoneNumber());
//            System.out.println(emp.getValue().getCompany());
//        }


        System.out.println(map.get(2));

    }
}
