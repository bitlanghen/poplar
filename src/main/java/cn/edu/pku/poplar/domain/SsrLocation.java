package cn.edu.pku.poplar.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

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

    public static TypedQuery<SsrLocation> findSsrLocationsByBean(SsrLocation ssrLocation) {
        if(ssrLocation == null) {
            throw new IllegalArgumentException("The ssrLocation must not be null");
        }
        StringBuilder hql = new StringBuilder("SELECT o FROM SsrLocation AS o");
        StringBuilder andClause = new StringBuilder();
        andClause.append(getAndClauseHql("cdsOrUtr", ssrLocation.getCdsOrUtr()));
        andClause.append(getAndClauseHql("locationGene", ssrLocation.getLocationGene()));
        andClause.append(getAndClauseHql("locationInScaffold", ssrLocation.getLocationInScaffold()));
        andClause.append(getAndClauseHql("pacId", ssrLocation.getPacId()));
        andClause.append(getAndClauseHql("scaffold", ssrLocation.getScaffold()));
        andClause.append(getAndClauseHql("seqOfScaffold", ssrLocation.getSeqOfScaffold()));
        andClause.append(getAndClauseHql("ssr", ssrLocation.getSsr()));
        andClause.append(getAndClauseHql("strand", ssrLocation.getStrand()));
        andClause.append(getAndClauseHql("uniGeneId", ssrLocation.getUniGeneId()));
        if(andClause.length() > 0) {
            int andIndex = andClause.indexOf("and");
            andClause.replace(andIndex, andIndex + 3, "where");
            hql.append(andClause.toString());
        }
        EntityManager em = SsrLocation.entityManager();
        TypedQuery<SsrLocation> q = em.createQuery(hql.toString(), SsrLocation.class);
        return q;
    }

    private static String getAndClauseHql(String fieldName, String filedValue) {
        if(filedValue == null || filedValue.trim().equals("")) {
            return "";
        } else {
            return " and " + fieldName + " = '" + filedValue + "'";
        }
    }
}
