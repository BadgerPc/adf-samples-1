/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model;
import java.sql.SQLException;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.domain.Number;
import test.model.common.EmployeeList;
import test.model.common.EmployeeListRow;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---------------------------------------------------------------------

public class TestModuleImpl extends ApplicationModuleImpl implements test.model.common.TestModule  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }

  /*
   * Return an array of rows that are marked as selected
   * by returning the filtered set based on having the "Selected"
   * attribute equal to Boolean.TRUE
   */
  public Row[] getSelectedEmployees() {
    return getEmployeeList().getFilteredRows("Selected",Boolean.TRUE);
  }
  /**
   * Reset the transient selected flag by calling an
   * encapsulated method on my EmployeeList view object
   */
  public void resetSelection() {
    getEmployeeList().resetSelection();
  }
  /**
   * Mark the employees whose empno key values get passed in
   * as being "Selected". Here we're using an encapsulated
   * method on the view object to perform the marking of
   * the selected attribute as "true".
   * @param empnos
   */
  public void markEmpnosSelected(String[] empnos) {
    if (empnos != null) {
      EmployeeList voEmps = (EmployeeList)getEmployeeList();
      for (int z = 0, numEmps = empnos.length; z < numEmps; z++) {
        voEmps.markEmployeeAsSelectedUsingString(empnos[z]);
      }
    }    
  }
  /**
   * 
   *  Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test.model", "TestModuleLocal");
  }

  /**
   * 
   *  Container's getter for EmployeeList
   */
  public EmployeeListImpl getEmployeeList() {
    return (EmployeeListImpl)findViewObject("EmployeeList");
  }
}