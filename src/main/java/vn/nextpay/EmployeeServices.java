package vn.nextpay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//import java.util.UUID;

@Service
public class EmployeeServices {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<EmployeeResponse> getAllEmployee(){
        List<EmployeeResponse> responses = new ArrayList<>();
        List<EmployeeEntity> employees = employeeRepo.findAll();
        for(EmployeeEntity e: employees){
            EmployeeResponse response = new EmployeeResponse();
            response.setId(e.getId());
            response.setName(e.getName());
            response.setPhoneNumber(e.getPhoneNumber());
            response.setEmail(e.getEmail());

            responses.add(response);
        }
        return responses;
    }

    public EmployeeResponse getEmployeeDetail(Long employeeId) {
        Optional<EmployeeEntity> optionalEmployee = employeeRepo.findById(employeeId);
        if (optionalEmployee.isEmpty()) throw new RuntimeException("Employee not found");
        EmployeeEntity employee = optionalEmployee.get();
// tao ra 1 response moi
        EmployeeResponse response = new EmployeeResponse();
        response.setId(employee.getId());
        response.setName(employee.getName());
        response.setPhoneNumber(employee.getPhoneNumber());
        response.setEmail(employee.getEmail());

        return response;
    }

    public EmployeeResponse createEmployee(CreateEmployeeReq request) {
        EmployeeEntity entity = new EmployeeEntity();
        entity.setName(request.getName());
        entity.setEmail(request.getEmail());
        entity.setPhoneNumber(request.getPhone());
        // send request kiem tra database xem dang co bao nhieu nguoi -> them moi
        long employeeQuantity = employeeRepo.count();
        //entity.setId(employeeQuantity + 1);
        entity = employeeRepo.save(entity);
        // ham employeeRepo.save(...) se tra ve dung entity vua dc luu trong DB

        EmployeeResponse response = new EmployeeResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setPhoneNumber(entity.getPhoneNumber());
        response.setEmail(entity.getEmail());

        return response;
    }

    public EmployeeResponse updateEmployee(UpdateEmployeeReq request) {
        //b1: lay ra employee theo ID
        //b2: update thong tin theo thong tin dau vao.
        //b3: tra ve response theo nhg gi update.
        Optional<EmployeeEntity> optionalEmployee = employeeRepo.findById(request.getId());
        if (optionalEmployee.isEmpty()) throw new RuntimeException("Employee not found");
        EmployeeEntity employee = optionalEmployee.get();
        //update thong tin = lenh set.
        employee.setName(request.getName());
        employee.setPhoneNumber(request.getPhone());
        employee.setEmail(request.getEmail());

        employee = employeeRepo.save(employee);
        EmployeeResponse response = new EmployeeResponse();
        response.setId(employee.getId());
        response.setName(employee.getName());
        response.setPhoneNumber(employee.getPhoneNumber());
        response.setEmail(employee.getEmail());

        return response;

    }

    public boolean deleteEmployee(DeleteEmployeeReq request) {
//        Optional<EmployeeEntity> optionalEmployee = employeeRepo.findById(request.getId());
//        if (optionalEmployee.isEmpty()) throw new RuntimeException("Employee not found");
//        EmployeeEntity employee = optionalEmployee.get();
//        employeeRepo.delete(employee);

        employeeRepo.deleteById(request.getId());
        return true;
    }
}
