    package com.xch.interview.pojo;

    import org.bson.types.ObjectId;
    import org.springframework.data.annotation.Id;
    import org.springframework.data.mongodb.core.mapping.Document;

    import java.util.Objects;

    /**
     * @ClassName: MeightTopic
     * @author: xiongconghui
     * @date: 2023-05-09 21:08
     **/
    @Document(collection = "eighttopic")
    public class MeightTopic {


        /**
         * Mongodb中八股文题目文章内容
         */
        private String topicId;

        private String articleText;


        public MeightTopic() {
        }



        public String getArticleText() {
            return articleText;
        }

        public void setArticleText(String articleText) {
            this.articleText = articleText;
        }

        @Override
        public String toString() {
            return "MeightTopic{" +
                    ", articleText='" + articleText + '\'' +
                    '}';
        }

        public String getTopicId() {
            return topicId;
        }

        public void setTopicId(String topicId) {
            this.topicId = topicId;
        }
    }
