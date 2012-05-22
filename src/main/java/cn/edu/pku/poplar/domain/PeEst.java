package cn.edu.pku.poplar.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class PeEst {

    private String gene_id;

    private Integer ssr_nr;

    private String ssr_type;

    private String ssr;

    private Integer seqSize;

    private Integer seqStart;

    private Integer seqEnd;
}
