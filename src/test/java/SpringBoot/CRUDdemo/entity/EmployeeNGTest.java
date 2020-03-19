/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringBoot.CRUDdemo.entity;

import SpringBoot.SpringDataJPA.entity.Employee;
import static org.testng.Assert.*;

/**
 *
 * @author Aditya Kshettri
 */
public class EmployeeNGTest {
    
    public EmployeeNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getId method, of class Employee.
     */
    @org.testng.annotations.Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = new Employee();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Employee.
     */
    @org.testng.annotations.Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Employee instance = new Employee();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Employee.
     */
    @org.testng.annotations.Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @org.testng.annotations.Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Employee instance = new Employee();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Employee.
     */
    @org.testng.annotations.Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @org.testng.annotations.Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Employee instance = new Employee();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Employee.
     */
    @org.testng.annotations.Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Employee.
     */
    @org.testng.annotations.Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Employee instance = new Employee();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Employee.
     */
    @org.testng.annotations.Test
    public void testToString() {
        System.out.println("toString");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
