// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package cn.edu.pku.poplar.domain;

import cn.edu.pku.poplar.domain.Transferbility;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Transferbility_Roo_Jpa_Entity {
    
    declare @type: Transferbility: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Transferbility.id;
    
    @Version
    @Column(name = "version")
    private Integer Transferbility.version;
    
    public Long Transferbility.getId() {
        return this.id;
    }
    
    public void Transferbility.setId(Long id) {
        this.id = id;
    }
    
    public Integer Transferbility.getVersion() {
        return this.version;
    }
    
    public void Transferbility.setVersion(Integer version) {
        this.version = version;
    }
    
}