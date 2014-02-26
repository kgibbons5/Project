/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import enterprise.web_jpa_war.entity.SalesOrder;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Katie
 */
@Stateless
public class SalesOrderFacade extends AbstractFacade<SalesOrder> {
    @PersistenceContext(unitName = "web-jpaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalesOrderFacade() {
        super(SalesOrder.class);
    }
    
}
