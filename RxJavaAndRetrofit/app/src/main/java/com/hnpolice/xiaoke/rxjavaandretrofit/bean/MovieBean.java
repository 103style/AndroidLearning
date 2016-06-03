package com.hnpolice.xiaoke.rxjavaandretrofit.bean;

import java.util.List;

/**
 * create by luoxiaoke on 2016/6/2 11:10.
 * use for 电影实体类
 */
public class MovieBean {

    /**
     * count : 10
     * start : 0
     * total : 250
     * subjects : [{"rating":{"max":10,"average":9.6,"stars":"50","min":0},"genres":["犯罪","剧情"],"title":"肖申克的救赎","casts":[{"alt":"https://movie.douban.com/celebrity/1054521/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/17525.jpg","large":"https://img3.doubanio.com/img/celebrity/large/17525.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/17525.jpg"},"name":"蒂姆·罗宾斯","id":"1054521"},{"alt":"https://movie.douban.com/celebrity/1054534/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/34642.jpg","large":"https://img3.doubanio.com/img/celebrity/large/34642.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/34642.jpg"},"name":"摩根·弗里曼","id":"1054534"},{"alt":"https://movie.douban.com/celebrity/1012520/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/118.jpg","large":"https://img1.doubanio.com/img/celebrity/large/118.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/118.jpg"},"name":"艾伦·佩吉","id":"1012520"}],"collect_count":827588,"original_title":"Inception","subtype":"movie","directors":[{"alt":"https://movie.douban.com/celebrity/1054524/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/673.jpg","large":"https://img3.doubanio.com/img/celebrity/large/673.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/673.jpg"},"name":"克里斯托弗·诺兰","id":"1054524"}],"year":"2010","images":{"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p513344864.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p513344864.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p513344864.jpg"},"alt":"https://movie.douban.com/subject/3541415/","id":"3541415"}]
     * title : 豆瓣电影Top250
     */

    public int count;
    public int start;
    public int total;
    public String title;
    /**
     * rating : {"max":10,"average":9.6,"stars":"50","min":0}
     * genres : ["犯罪","剧情"]
     * title : 肖申克的救赎
     * casts : [{"alt":"https://movie.douban.com/celebrity/1054521/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/17525.jpg","large":"https://img3.doubanio.com/img/celebrity/large/17525.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/17525.jpg"},"name":"蒂姆·罗宾斯","id":"1054521"},{"alt":"https://movie.douban.com/celebrity/1054534/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/34642.jpg","large":"https://img3.doubanio.com/img/celebrity/large/34642.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/34642.jpg"},"name":"摩根·弗里曼","id":"1054534"},{"alt":"https://movie.douban.com/celebrity/1041179/","avatars":{"small":"https://img1.doubanio.com/img/celebrity/small/5837.jpg","large":"https://img1.doubanio.com/img/celebrity/large/5837.jpg","medium":"https://img1.doubanio.com/img/celebrity/medium/5837.jpg"},"name":"鲍勃·冈顿","id":"1041179"}]
     * collect_count : 929578
     * original_title : The Shawshank Redemption
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1047973/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/230.jpg","large":"https://img3.doubanio.com/img/celebrity/large/230.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/230.jpg"},"name":"弗兰克·德拉邦特","id":"1047973"}]
     * year : 1994
     * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p480747492.jpg","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p480747492.jpg","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p480747492.jpg"}
     * alt : https://movie.douban.com/subject/1292052/
     * id : 1292052
     */

    public List<SubjectsEntity> subjects;

    public static class SubjectsEntity {
        /**
         * max : 10
         * average : 9.6
         * stars : 50
         * min : 0
         */

        public RatingEntity rating;
        public String title;
        public int collect_count;
        public String original_title;
        public String subtype;
        public String year;
        /**
         * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p480747492.jpg
         * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p480747492.jpg
         * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p480747492.jpg
         */

        public ImagesEntity images;
        public String alt;
        public String id;
        public List<String> genres;
        /**
         * alt : https://movie.douban.com/celebrity/1054521/
         * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/17525.jpg","large":"https://img3.doubanio.com/img/celebrity/large/17525.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/17525.jpg"}
         * name : 蒂姆·罗宾斯
         * id : 1054521
         */

        public List<CastsEntity> casts;
        /**
         * alt : https://movie.douban.com/celebrity/1047973/
         * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/230.jpg","large":"https://img3.doubanio.com/img/celebrity/large/230.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/230.jpg"}
         * name : 弗兰克·德拉邦特
         * id : 1047973
         */

        public List<DirectorsEntity> directors;

        public static class RatingEntity {
            public int max;
            public double average;
            public String stars;
            public int min;

            @Override
            public String toString() {
                final StringBuffer sb = new StringBuffer("RatingEntity{");
                sb.append("max=").append(max);
                sb.append(", average=").append(average);
                sb.append(", stars='").append(stars).append('\'');
                sb.append(", min=").append(min);
                sb.append('}');
                return sb.toString();
            }
        }

        public static class ImagesEntity {
            public String small;
            public String large;
            public String medium;

            @Override
            public String toString() {
                final StringBuffer sb = new StringBuffer("ImagesEntity{");
                sb.append("small='").append(small).append('\'');
                sb.append(", large='").append(large).append('\'');
                sb.append(", medium='").append(medium).append('\'');
                sb.append('}');
                return sb.toString();
            }
        }

        public static class CastsEntity {
            public String alt;
            /**
             * small : https://img3.doubanio.com/img/celebrity/small/17525.jpg
             * large : https://img3.doubanio.com/img/celebrity/large/17525.jpg
             * medium : https://img3.doubanio.com/img/celebrity/medium/17525.jpg
             */

            public AvatarsEntity avatars;
            public String name;
            public String id;



            public static class AvatarsEntity {
                public String small;
                public String large;
                public String medium;

                @Override
                public String toString() {
                    final StringBuffer sb = new StringBuffer("AvatarsEntity{");
                    sb.append("small='").append(small).append('\'');
                    sb.append(", large='").append(large).append('\'');
                    sb.append(", medium='").append(medium).append('\'');
                    sb.append('}');
                    return sb.toString();
                }
            }

            @Override
            public String toString() {
                final StringBuffer sb = new StringBuffer("CastsEntity{");
                sb.append("alt='").append(alt).append('\'');
                sb.append(", avatars=").append(avatars);
                sb.append(", name='").append(name).append('\'');
                sb.append(", id='").append(id).append('\'');
                sb.append('}');
                return sb.toString();
            }
        }

        public static class DirectorsEntity {
            public String alt;
            /**
             * small : https://img3.doubanio.com/img/celebrity/small/230.jpg
             * large : https://img3.doubanio.com/img/celebrity/large/230.jpg
             * medium : https://img3.doubanio.com/img/celebrity/medium/230.jpg
             */

            public AvatarsEntity avatars;
            public String name;
            public String id;

            public static class AvatarsEntity {
                public String small;
                public String large;
                public String medium;

                @Override
                public String toString() {
                    final StringBuffer sb = new StringBuffer("AvatarsEntity{");
                    sb.append("small='").append(small).append('\'');
                    sb.append(", large='").append(large).append('\'');
                    sb.append(", medium='").append(medium).append('\'');
                    sb.append('}');
                    return sb.toString();
                }
            }

            @Override
            public String toString() {
                final StringBuffer sb = new StringBuffer("DirectorsEntity{");
                sb.append("alt='").append(alt).append('\'');
                sb.append(", avatars=").append(avatars);
                sb.append(", name='").append(name).append('\'');
                sb.append(", id='").append(id).append('\'');
                sb.append('}');
                return sb.toString();
            }
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("SubjectsEntity{");
            sb.append("rating=").append(rating);
            sb.append(", title='").append(title).append('\'');
            sb.append(", collect_count=").append(collect_count);
            sb.append(", original_title='").append(original_title).append('\'');
            sb.append(", subtype='").append(subtype).append('\'');
            sb.append(", year='").append(year).append('\'');
            sb.append(", images=").append(images);
            sb.append(", alt='").append(alt).append('\'');
            sb.append(", id='").append(id).append('\'');
            sb.append(", genres=").append(genres);
            sb.append(", casts=").append(casts);
            sb.append(", directors=").append(directors);
            sb.append('}');
            return sb.toString();
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MovieBean{");
        sb.append("count=").append(count);
        sb.append(", start=").append(start);
        sb.append(", total=").append(total);
        sb.append(", title='").append(title).append('\'');
        sb.append(", subjects=").append(subjects);
        sb.append('}');
        return sb.toString();
    }
}
