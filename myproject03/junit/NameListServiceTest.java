package com.wufujian.myproject03.junit;

import com.wufujian.myproject03.domain.Employee;
import com.wufujian.myproject03.service.NameListService;
import com.wufujian.myproject03.service.TeamException;
import org.junit.Test;

/**
 * @author:gfk
 * @create:2021/12/22
 * @Description:
 * @FileName:NameListServiceTest
 * @History:
 * @自定义内容:
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for(int i = 0;i < employees.length;i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 101;
        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
