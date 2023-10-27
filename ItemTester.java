package assign07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTester {

    // Tests for Tool
    @Test
    public void testToolToString() {
        Tool myTool = new Tool("Gun", 120);
        assertEquals("Tool: Gun - power = " + 120, myTool.toString());
    }

    @Test
    public void testCompareToolToToolLessThan() {
        Tool myToolLesser = new Tool("Hammer", 12);
        Tool myToolGreater = new Tool("Sword", 24);
        assertEquals(-1, myToolLesser.compareTo(myToolGreater));
    }

    @Test
    public void testCompareToolToToolGreaterThan(){
        Tool myToolGreater = new Tool("Cannon", 1230);
        Tool myToolLesser = new Tool("Knife", 3);
        assertEquals(1, myToolGreater.compareTo(myToolLesser));
    }

    @Test
    public void testCompareToolToToolEqual(){
        Tool myTool1 = new Tool("Axe", 43);
        Tool myTool2 = new Tool("Pickaxe", 43);
        assertEquals(0, myTool1.compareTo(myTool2));
    }

    @Test
    public void testCompareToolToArmor(){
        Tool myTool = new Tool("Sword", 30);
        Armor myArmor = new Armor("Silver Plate", 43, 9);
        assertEquals(1, myTool.compareTo(myArmor));
    }

    @Test
    public void testCompareToolToMagic(){
        Tool myTool = new Tool("Hammer", 123);
        Magic myMagic = new Magic("Fire", 43, 23);
        assertEquals(1, myTool.compareTo(myMagic));
    }

    //Tests for Armor
    @Test
    public void testArmorToString() {
       Armor myArmor = new Armor("Chest Plate", 90, 10);
       assertEquals("Armor: Chest Plate - defense = 90, condition = 10", myArmor.toString());
    }

    @Test
    public void testCompareArmorToArmorLessThan() {
       Armor myArmorLesser = new Armor("Helmet", 30, 0);
       Armor myArmorGreater = new Armor("Boots", 2, 3);
       assertEquals(-1, myArmorLesser.compareTo(myArmorGreater));
    }

    @Test
    public void testCompareArmorToArmorGreaterThan(){
        Armor myArmorGreater = new Armor("Arm Guards", 34, 1);
        Armor myArmorLesser = new Armor("Mouth Piece", 3, 11);
        assertEquals(1, myArmorGreater.compareTo(myArmorLesser));
    }

    @Test
    public void testCompareArmorToArmorEqual(){
        Armor myArmor1 = new Armor("Knight Suit", 69, 420);
        Armor myArmor2 = new Armor("Gucci pants", 420, 69);
        assertEquals(0, myArmor1.compareTo(myArmor2));
    }

    @Test
    public void testCompareArmorToTool(){
        Tool myTool = new Tool("Steel Sword", 30);
        Armor myArmor = new Armor("Golden Plate", 43, 9);
        assertEquals(-1, myArmor.compareTo(myTool));
    }

    @Test
    public void testCompareArmorToMagic(){
        Armor myArmor = new Armor("Wizard Hat", 123 ,45);
        Magic myMagic = new Magic("Fire", 43, 23);
        assertEquals(1, myArmor.compareTo(myMagic));
    }

    // Tests for Magic
    @Test
    public void testMagicToString() {
        Magic myMagic = new Magic("Fireball", 88, 12);
        assertEquals("Magic: Fireball - power = 88, cost = 12", myMagic.toString());
    }

    @Test
    public void testCompareMagicToMagicLessThan() {
        Magic myMagicGreater = new Magic("Freeze", 100, 10);
        Magic myMagicLesser = new Magic("Lightning", 9, 8);
        assertEquals(-1, myMagicLesser.compareTo(myMagicGreater));

    }

    @Test
    public void testCompareMagicToMagicGreaterThan(){
        Magic myMagicLesser = new Magic("Lock", 3, 2);
        Magic myMagicGreater = new Magic("Explosion", 10, 5);
        assertEquals(1, myMagicGreater.compareTo(myMagicLesser));
    }

    @Test
    public void testCompareMagicToMagicEqual(){
        Magic myMagic1 = new Magic("Spike", 12, 4);
        Magic myMagic2 = new Magic("Whip", 24, 8);
        assertEquals(0, myMagic1.compareTo(myMagic2));
    }

    @Test
    public void testCompareMagicToTool(){
        Tool myTool = new Tool("Steel Sword", 30);
        Magic myMagic = new Magic("Flame", 12, 3);
        assertEquals(-1, myMagic.compareTo(myTool));
    }

    @Test
    public void testCompareMagicToArmor(){
        Armor myArmor = new Armor("Wizard Hat", 123 ,45);
        Magic myMagic = new Magic("Fire", 43, 23);
        assertEquals(-1, myMagic.compareTo(myArmor));
    }


}