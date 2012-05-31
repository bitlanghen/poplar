package cn.edu.pku.poplar.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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

    private int isTested;

    public static TypedQuery<Pic> findPicsByTop3(String reversePrimer, String forwardPrimer, String referName) {
        StringBuilder hql = new StringBuilder("SELECT o FROM Pic AS o");
        StringBuilder andClause = new StringBuilder();
        andClause.append(HqlUtils.getAndClauseHql("reversePrimer", reversePrimer));
        andClause.append(HqlUtils.getAndClauseHql("forwardPrimer", forwardPrimer));
        andClause.append(HqlUtils.getAndClauseHql("referName", referName));
        HqlUtils.updateFirstAndToWhere(andClause);
        hql.append(andClause.toString());
        EntityManager em = Pic.entityManager();
        TypedQuery<Pic> q = em.createQuery(hql.toString(), Pic.class);
        return q;
    }
    
    public String getTests() {
        if(this.isTested == 1) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
