// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.edu.pku.poplar.domain;

import cn.edu.pku.poplar.domain.PeEst;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PeEst_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager PeEst.entityManager;
    
    public static final EntityManager PeEst.entityManager() {
        EntityManager em = new PeEst().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long PeEst.countPeEsts() {
        return entityManager().createQuery("SELECT COUNT(o) FROM PeEst o", Long.class).getSingleResult();
    }
    
    public static List<PeEst> PeEst.findAllPeEsts() {
        return entityManager().createQuery("SELECT o FROM PeEst o", PeEst.class).getResultList();
    }
    
    public static PeEst PeEst.findPeEst(Long id) {
        if (id == null) return null;
        return entityManager().find(PeEst.class, id);
    }
    
    public static List<PeEst> PeEst.findPeEstEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM PeEst o", PeEst.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void PeEst.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void PeEst.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            PeEst attached = PeEst.findPeEst(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void PeEst.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void PeEst.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public PeEst PeEst.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        PeEst merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
