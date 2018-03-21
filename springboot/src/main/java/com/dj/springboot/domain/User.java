package com.dj.springboot.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

    @Component
    @ConfigurationProperties(prefix="cn.dj.user")
    public class User {

        private String name;

        private Integer age;

        private Integer sex;

        private Integer classroom;

        private String pwd;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getSex() {
            return sex;
        }

        public void setSex(Integer sex) {
            this.sex = sex;
        }

        public Integer getClassroom() {
            return classroom;
        }

        public void setClassroom(Integer classroom) {
            this.classroom = classroom;
        }

        public String getPwd() {
            return pwd;
        }

        public void setPwd(String pwd) {
            this.pwd = pwd;
        }
    }

