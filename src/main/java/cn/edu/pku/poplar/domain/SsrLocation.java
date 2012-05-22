package cn.edu.pku.poplar.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findSsrLocationsByUniGeneIdLike" })
public class SsrLocation {

    private String uniGeneId;

    private String ssr;

    private String locationInScaffold;

    private String cdsOrUtr;

    private String strand;

    private String locationGene;

    private String pacId;

    private String scaffold;

    private String seqOfScaffold;

    private Float identify;
}
