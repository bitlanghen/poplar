package cn.edu.pku.poplar.domain;

/**
 * Created by IntelliJ IDEA.
 * User: bitlanghen
 * Date: 12-5-21
 * Time: 下午11:57
 * To change this template use File | Settings | File Templates.
 */
public class HqlUtils {
    public static String getAndClauseHql(String fieldName, String filedValue) {
        if(filedValue == null || filedValue.trim().equals("")) {
            return "";
        } else {
            return " and " + fieldName + " = '" + filedValue + "'";
        }
    }

    public static void updateFirstAndToWhere(StringBuilder andClause) {
        if(andClause != null && andClause.length() > 0) {
            int andIndex = andClause.indexOf("and");
            andClause.replace(andIndex, andIndex + 3, "where");
        }
    }
}
