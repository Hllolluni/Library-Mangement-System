/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author Admin
 */
import java.util.List;
import BLL.Library;

public interface LibraryInterface {
    void create(Library l) throws CrudFormException;
    void edit(Library l) throws CrudFormException;
    void delete(Library l) throws CrudFormException;
    List <Library> findAll() throws CrudFormException;
    Library findByID(Integer ID) throws CrudFormException;
}
