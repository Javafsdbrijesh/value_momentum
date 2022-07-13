package com.javafsd.userservice.vo;

import com.javafsd.userservice.entity.User;

public class ResponseTemplateView {
        private User user;
        private DepartmentView departmentView;
        /**
         * @return the user
         */
        public User getUser() {
            return user;
        }
        /**
         * @param user the user to set
         */
        public void setUser(User user) {
            this.user = user;
        }
        /**
         * @return the departmentView
         */
        public DepartmentView getDepartmentView() {
            return departmentView;
        }
        /**
         * @param departmentView the departmentView to set
         */
        public void setDepartmentView(DepartmentView departmentView) {
            this.departmentView = departmentView;
        }
        public ResponseTemplateView() {

        }
        @Override
        public String toString() {
            return "ResponseTemplateView [user=" + user + ", departmentView=" + departmentView + "]";
        }

}