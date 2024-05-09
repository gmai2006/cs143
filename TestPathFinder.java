import java.util.List;

public class TestPathFinder {

    //Animal House (1978)/Daniel, Joshua (I)/Miller, Chris (III)/Farmer, Reginald/Metcalf, Mark/Elliott, Robert (II)/Sutherland, Donald (I)/Freeman, John (III)/Bacon, Kevin/Bishop, Stephen (I)/Belushi, John/Robinson, Raymone/Vernon, John (I)/Hulce, Tom/Kenney, Douglas/Dumas, Jebidiah R./McGill, Bruce/Greenough, Rick/Jessie, DeWayne/Eby, Rick/McCartin, Sean (I)/Danova, Cesare/Matheson, Tim (I)/Furst, Stephen/Widdoes, James/Daughton, James/Riegert, Peter/Simonds, Fred/Bonnheim, Bruce/Cray, Robert/Holcomb, Sarah/Vick, Helen/Grooman, Stacy/Jurgenson, Aseneth/Denning, Katherine/Lauris, Priscilla/Smith, Martha/Johnson, Sunny (II)/Weller, Mary Louise/Bloom, Verna/Belushi-Pisano, Judith/Allen, Karen (I)/Baur, Lisa/Roberts, Eliza
    //Cold Mountain (2003)/Smith, Erik (IV)/Williamson, Bruce (III)/Gleeson, Brendan/Miller, Mark Jeffrey/Stone, Hank (I)/Whitworth, Dean/Tavare, Jay/Brake, Richard/Allison, Ben/Hunnam, Charlie/Hoffman, Philip Seymour/Omilami, Afemo/Black, Lucas (II)/Boyer, William (I)/Woodcock, Leonard (II)/Law, Jude/Ribisi, Giovanni/Winstone, Ray/Murphy, Cillian/Aldredge, Tom/Rebhorn, James/White, Jack (XV)/Lee, Jamie (II)/Pemberton, Martin/Hassell, Alex/Suplee, Ethan/Bridson, John (II)/Sutherland, Donald (I)/Gammon, James (I)/Howell, Trey (I)/Damon Hendrix, J./Dixon, Chet (II)/Roberts, William (III)/Fennell, Christopher/Gleeson, Sean/Layton, Alex/Deschanel, Emily/Kidman, Nicole/Manning, Taryn/Durio, Katherine/Atkins, Eileen/Portman, Natalie/J'Han, Rasool/Baker, Kathy (I)/Mullins, Robin/Malone, Jena/Walters, Melora/Zellweger, Renée/Apgar, Jen/La Prade, Kristen Nicole
    public static void main(String[] args) {
        UndirectedGraph graph = new UndirectedGraph("movies.txt", "/");
        PathFinder pathFinder = new PathFinder(graph, "Bacon, Kevin");

        System.out.println(pathFinder.pathTo("Kidman, Nicole"));
        System.out.println(pathFinder.distanceTo("Kidman, Nicole"));

        List<String> path = pathFinder.pathTo("Kidman, Nicole");
        int distanceTo = pathFinder.distanceTo("Kidman, Nicole");
        if (path.size() != 5) {
            System.out.println("Failed:  pathTo function expected 5 but got " + path.size());
            return;
        }

        if (distanceTo != 4) {
            System.out.println("Failed:  distanceTo function expected 4 but got " + distanceTo);
            return;
        }

        System.out.println("Congrats!  You NOW reached level 2 of code WARRIOR");
    }
}
