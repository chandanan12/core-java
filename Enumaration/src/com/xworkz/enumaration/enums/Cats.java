package com.xworkz.enumaration.enums;

public enum Cats {
    TOBBY("sleeping"), SNOWSHOE("make a sound"), RAGDOLL("eating"), BOMBAY("dance"), BENGAL("coo"), CORNISHREX("sleep"), PERSIAN("walk"), SOMALI("nouse"), TOYGER("different_color"), CRMRIC("koo");
    String behaviour;

    Cats(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getBehaviour() {
        return behaviour;
    }
}


