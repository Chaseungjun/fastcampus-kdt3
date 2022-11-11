package org.example.overview.members.vo;

import java.util.Objects;

public class SurveyVO {

    private String sId = "";
    private String season = "";
    private String fruit = "";

    public SurveyVO() {
    }

    public SurveyVO(String season, String fruit) {
        this.season = season;
        this.fruit = fruit;
    }

    public SurveyVO(String sId, String season, String fruit) {
        this.sId = sId;
        this.season = season;
        this.fruit = fruit;
    }

    public String getsId() {
        return sId;
    }

    public String getSeason() {
        return season;
    }

    public String getFruit() {
        return fruit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurveyVO surveyVO = (SurveyVO) o;
        return sId.equals(surveyVO.sId) && season.equals(surveyVO.season) && fruit.equals(surveyVO.fruit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sId, season, fruit);
    }

    @Override
    public String toString() {
        return "SurveyVO{" +
                "uId='" + sId + '\'' +
                ", season='" + season + '\'' +
                ", fruit='" + fruit + '\'' +
                '}';
    }
}
