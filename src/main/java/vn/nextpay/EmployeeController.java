package vn.nextpay;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    //GET, POST, PUT, DELETE
    // GET: Lay ra du lieu
    // POST: Create du lieu = create
    // PUT: Update du lieu = update
    // DELETE: Xoa du lieu = delete

    @Autowired
    private EmployeeServices employeeServices;
// API lay data danh sach nv
    @GetMapping("/get-all-employee")
    @ApiOperation(value = "API lấy thông tin toàn bộ nhân viên")
    public List<EmployeeResponse> getAllEmployee(){
        return employeeServices.getAllEmployee();
    }
// API lấy thông tin 1 nhân viên (GET)
    @GetMapping("/get-detail")
    @ApiOperation(value = "API lấy thông tin 1 nhân viên")
    public EmployeeResponse getEmployeeDetail(@RequestParam(value = "id") Long employeeId){
        return employeeServices.getEmployeeDetail(employeeId);
    }
//API thêm thông tin của một nhân viên (CREATE)
    @PostMapping("/create")
    @ApiOperation(value = "API tạo thêm 1 nhân viên")
    public EmployeeResponse createEmployee(@RequestBody CreateEmployeeReq request){
        return employeeServices.createEmployee(request);
        // repository.save(...): check id: neu chua co --> create
        // neu co roi --> update
    }
//API update thông tin của một nhân viên có sẵn (UPDATE)
    @PostMapping("/update")
    @ApiOperation(value = "API bổ sung thông tin 1 nhân viên")
    public EmployeeResponse updateEmployeeReq(@RequestBody UpdateEmployeeReq request){
        return employeeServices.updateEmployee(request);
        //tra ve thong tin dung voi EmployeeResponse
    }
// API xoá thông tin của 1 nhân viên (DELETE)
// ko trả về thông tin của người bị xoá
    @PostMapping("/delete")
    @ApiOperation(value = "API xoá thông tin 1 nhân viên")
    public boolean deleteEmployeeReq(@RequestBody DeleteEmployeeReq request){
        return employeeServices.deleteEmployee(request);
    }
}

