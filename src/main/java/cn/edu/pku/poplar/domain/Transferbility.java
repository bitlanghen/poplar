package cn.edu.pku.poplar.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findTransferbilitysByReferNameEquals" })
public class Transferbility {

    private String referName;

    private String populusWillsonii;

    private String populusPseudotomentosa;

    private String populusNigraVarItalica;

    private String populusNigraVarThevestina;

    private String populusTomentosa;

    private String populusTrichocarpa;

    private String populusUssuriensis;

    private String populusPrninosa;

    private String populusEuphratica;
}
