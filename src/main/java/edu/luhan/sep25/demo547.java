package edu.luhan.sep25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class demo547 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(new News("零基础快速学会java韩顺平基础课程集合遍历集，合家庭作业"));
        list.add(new News("本套Java课程为三个阶段，涵盖了Java基础的方方面面。"));

        System.out.println("the full list is " + list);
        //排序
        //ListIterator i = list.listIterator();
        //while(i.hasPrevious()){
          //  Object o = i.previous();
        //}

        //通用的倒序方法
        for (int i = list.size()-1; i >=0 ; i--) {
            //System.out.println("normal is " + list.get(i));
            // start to truncate
            News news =(News)list.get(i);
            System.out.println(processTitle(news.getTitle()));

        };


    }

    //写一个专门处理标题的方法
    public static String processTitle(String title){
        if (title == null){
            return null;
        }

        if (title.length()>15){
            return title.substring(0,15)+"...";
        } else{
            return title;
        }
    }


    static class News {
        private String title;
        private String content;

        public News(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return "News{" +
                    "title='" + title + '\'' +
                    '}';
        }
    }
}
