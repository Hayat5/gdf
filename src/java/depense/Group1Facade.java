/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depense;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Imadbourji
 */
@Stateless
public class Group1Facade extends AbstractFacade<Group1> {
    @PersistenceContext(unitName = "gdfPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Group1Facade() {
        super(Group1.class);
    }
    
}
