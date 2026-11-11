package com.mecerintered.springboot;

import java.util.List;

public class SoftwareDevelopers {
    private int ID;
    private String name;
    private String email;
    private List<String> Techstack;
    private String password;
    private String role;

    public SoftwareDevelopers() {

    }

    public SoftwareDevelopers(List<String> techstack, String email, String name, int ID, String password, String role) {
        Techstack = techstack;
        this.email = email;
        this.name = name;
        this.ID = ID;
        this.role = role;
        this.password = password;

    }

    public String getRole() {return role;}

    public void setRole(String role) {this.role = role;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public List<String> getTechstack() {return Techstack;}

    public void setTechstack(List<String> techstack) {Techstack = techstack;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getID() {return ID;}

    public void setID(int ID) {this.ID = ID;}
}
