package com.duelsimulator;

public class MonsterCard implements Card {

    private String name;
    private String effect;
    private String pendulumEffect;

    private int level;
    private int rank;
    private int link;
    private int pendulum;


    public String getPendulumEffect() {
        return pendulumEffect;
    }

    public void setPendulumEffect(String pendulumEffect) {
        this.pendulumEffect = pendulumEffect;
    }
    
    public int getPendulum() {
        return pendulum;
    }

    public void setPendulum(int pendulum) {
        this.pendulum = pendulum;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getLink() {
        return link;
    }

    public void setLink(int link) {
        this.link = link;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEffect() {
        return effect;
    }

    @Override
    public void setEffect(String effect) {
        this.effect = effect;
    }

    
}
