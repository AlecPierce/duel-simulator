package com.duelsimulator;

public interface Card {
    public String getName();

    public void setName(String name);

    public String getEffect();

    public void setEffect(String effect);
}

/*	- Duel Monster Card
		Name
		Level/Rank/Link
		Type of Card
			§ Monster
			§ Spell
			§ Trap
        Effect*/