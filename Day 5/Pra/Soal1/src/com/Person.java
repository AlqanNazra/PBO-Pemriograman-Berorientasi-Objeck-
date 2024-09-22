package com;

public class Person {

        private String[] nama;
        private String[] id;
    
        public Person(String[] nama,String[] id)
        {
            this.nama = nama;
            this.id = id;
        }
    
        public String[] getnama()
        {
            return nama;
        }
    
        public void setnama(String[] nama){
            this.nama = nama;
        }
    
        public String[] getid()
        {
            return id;
        }
    
        public void setid(String[] id){
            this.id = id;
        }
    
}
