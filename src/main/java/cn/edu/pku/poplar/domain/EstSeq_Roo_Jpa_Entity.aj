// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.edu.pku.poplar.domain;

import cn.edu.pku.poplar.domain.EstSeq;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect EstSeq_Roo_Jpa_Entity {
    
    declare @type: EstSeq: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long EstSeq.id;
    
    @Version
    @Column(name = "version")
    private Integer EstSeq.version;
    
    public Long EstSeq.getId() {
        return this.id;
    }
    
    public void EstSeq.setId(Long id) {
        this.id = id;
    }
    
    public Integer EstSeq.getVersion() {
        return this.version;
    }
    
    public void EstSeq.setVersion(Integer version) {
        this.version = version;
    }
    
}