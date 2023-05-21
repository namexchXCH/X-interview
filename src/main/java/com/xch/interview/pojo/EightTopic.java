package com.xch.interview.pojo;


import java.util.Objects;

/**
 * @ClassName: EightTopic
 * @author: xiongconghui
 * @date: 2023-05-09 20:50
 **/


public class EightTopic {

    /**
     * 八股 文题目id
     */

    private String topicId;

    /**
     * 八股文题 目属于哪个模块id
     */
    private String memberId;

    /**
     * 八股文题 目类容
     */
    private String topicText;

    public EightTopic() {
    }




    @Override
    public int hashCode() {
        return Objects.hash(topicId, memberId, topicText);
    }



    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getTopicText() {
        return topicText;
    }

    public void setTopicText(String topicText) {
        this.topicText = topicText;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EightTopic that = (EightTopic) o;
        return Objects.equals(topicId, that.topicId) &&
                Objects.equals(memberId, that.memberId) &&
                Objects.equals(topicText, that.topicText);
    }

    @Override
    public String toString() {
        return "EightTopic{" +
                "topicId=" + topicId +
                ", memberId='" + memberId + '\'' +
                ", topicText='" + topicText + '\'' +
                '}';
    }
}
