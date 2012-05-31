package cn.edu.pku.poplar.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findPicsByReferNameLike", "findPicsByForwardPrimerLike", "findPicsByReversePrimerLike" })
public class Pic {

    private String referName;

    private String forwardPrimer;

    private String reversePrimer;

    private String picRepeat;

    private int templateNum;

    private float pic;

    private float he;

    private float na;

    private String alleleSizeRange;
}
