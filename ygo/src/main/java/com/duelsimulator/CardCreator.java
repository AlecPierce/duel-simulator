package com.duelsimulator;

public class CardCreator {

    public static Card CreateMonsterCard(String name, int level, int rank, int link, int pendulum, String cardType, String effect, String pendulumEffect) {
        MonsterCard monsterCard = new MonsterCard();
        monsterCard.setName(name);
        monsterCard.setLevel(level);
        monsterCard.setLink(link);
        monsterCard.setPendulum(pendulum);
        monsterCard.setRank(rank);
        monsterCard.setEffect(effect);
        monsterCard.setPendulumEffect(pendulumEffect);

        return monsterCard;
    }

    public static Card CreateSpellCard(String name, String cardType, String effect) {
        Card spellCard = new SpellCard();
        spellCard.setName(name);
        spellCard.setEffect(effect);

        return spellCard;
    }

    public static Card CreateTrapCard(String name, String cardType, String effect) {
        TrapCard trapCard = new TrapCard();
        trapCard.setName(name);
        trapCard.setEffect(effect);

        return trapCard;
    }
}
