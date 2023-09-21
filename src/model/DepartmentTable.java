/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import departmentDB.Department;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author PAktobchawa
 */
public class DepartmentTable {
        public static void insertDepartment(Department dept) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("departmentPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(dept);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
        public static void updateDepartment(Department dept) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("departmentPU");
        EntityManager em = emf.createEntityManager();
        Department fromDb = em.find(Department.class, dept.getDepartmentid());
        fromDb.setName(dept.getName());
      
        em.getTransaction().begin();
        try {
            em.persist(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static void removeDepartment(Department dept) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("departmentPU");
        EntityManager em = emf.createEntityManager();
        Department fromDb = em.find(Department.class, dept.getDepartmentid());
        em.getTransaction().begin();
        try {
            em.remove(fromDb);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    public static Department findDepartmentById(Integer id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("departmentPU");
        EntityManager em = emf.createEntityManager();
        Department emp = em.find(Department.class, id);
        em.close();
        return emp;
    }
    public static List<Department> findAllDepartment() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("departmentPU");
        EntityManager em = emf.createEntityManager();
        List<Department> deptList = (List<Department>) em.createNamedQuery("Department.findAll").getResultList();
        em.close();
        return deptList;
    }
    public static List<Department> findDepartmentByName(String name) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("departmentPU");
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Employee.findByName");
        query.setParameter("name", name);
        List<Department> empList = (List<Department>) query.getResultList();
        em.close();
        return empList;
    }
}
