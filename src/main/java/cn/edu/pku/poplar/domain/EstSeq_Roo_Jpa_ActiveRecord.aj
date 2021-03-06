// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.edu.pku.poplar.domain;

import cn.edu.pku.poplar.domain.EstSeq;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

privileged aspect EstSeq_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager EstSeq.entityManager;
    
    public static final EntityManager EstSeq.entityManager() {
        EntityManager em = new EstSeq().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long EstSeq.countEstSeqs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM EstSeq o", Long.class).getSingleResult();
    }
    
    public static List<EstSeq> EstSeq.findAllEstSeqs() {
        return entityManager().createQuery("SELECT o FROM EstSeq o", EstSeq.class).getResultList();
    }
    
    public static EstSeq EstSeq.findEstSeq(Long id) {
        if (id == null) return null;
        return entityManager().find(EstSeq.class, id);
    }
    
    public static List<EstSeq> EstSeq.findEstSeqEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM EstSeq o", EstSeq.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void EstSeq.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void EstSeq.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            EstSeq attached = EstSeq.findEstSeq(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void EstSeq.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void EstSeq.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public EstSeq EstSeq.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        EstSeq merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
