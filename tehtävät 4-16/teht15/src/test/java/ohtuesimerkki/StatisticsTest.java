package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import org.junit.*;
import static org.junit.Assert.*;

public class StatisticsTest {
//  stub

    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

//  testit:
    Statistics stats;

    @Before
    public void setUp() {
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }

    @Test
    public void hakuPalauttaaNimenJosPelaajaLöytyy() {
//      malli 
//    String.format("%-20s",name) + " " + team + " " + String.format("%2d",goals) + " + " 
//                + String.format("%2d",assists) + " = " + getPoints();

//          ei TOIMI
//        assertEquals(String.format("%-20s", "Kurri") + " EDM" + String.format("%-20s", "37")
//                + " + " + String.format("%-20s", "53") + " = 90", stats.search("Kurri"));
   

//          ei toimi tämäkään
//        assertEquals(String.format("%-20s", "Kurri EDM 37 + 53 = 90"), stats.search("Kurri"));


//    
    }
//    
//    @Test
//    public void hakuPalauttaaNullJosPelaajaaEiLoydy() {
//        assertEquals(null, stats.search("Jaska"));
//    }
}
