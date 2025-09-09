package org.example;


    public class HelloBean {
        public HelloBean(String inject){
                this.message = inject;
        }
        private String message;

        public void setMessage(String message) {
            this.message = message;
        }

        public void sayHello() {
            System.out.println(message);
        }
    }


