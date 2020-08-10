package model;

import model.common.AppModule;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jan 06 17:02:00 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }

    /**
     * Container's getter for EmployeeVO2.
     * @return EmployeeVO2
     */
    public EmployeeVOImpl getEmployeeVO2() {
        return (EmployeeVOImpl) findViewObject("EmployeeVO2");
    }

    /**
     * Container's getter for DepartmentsVO1.
     * @return DepartmentsVO1
     */
    public DepartmentsVOImpl getDepartmentsVO1() {
        return (DepartmentsVOImpl) findViewObject("DepartmentsVO1");
    }

    /**
     * Container's getter for employeeRVO1.
     * @return employeeRVO1
     */
    public employeeRVOImpl getemployeeRVO1() {
        return (employeeRVOImpl) findViewObject("employeeRVO1");
    }
    public String searchEmployee(String employeeID){
try{
            ViewObjectImpl employeeRVO1 = this.getemployeeRVO1();
            if(employeeRVO1 != null){
                employeeRVO1.setApplyViewCriteriaName("employeeRVOCriteria");
                employeeRVO1.setNamedWhereClauseParam("BindEmployeeId",employeeID);
            }
    employeeRVO1.executeQuery();
                                  
}                        
            catch (Exception e){
                
           System.out.println("Exception in searchEmployee"); 
        }return "";
    }


    /**
     * Container's getter for employeeRVO1.
     * @return employeeRVO1
     */
   
}
