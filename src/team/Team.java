package team;
import java.util.ArrayList;

public class Team {
    private String name;
    private int maxSize = 16;
    private ArrayList<Player> players = new ArrayList<Player>();
    
    public Team(String name){
        this.name = name;}
    
    public String getName(){
        return this.name;}
    
    public void addPlayer(Player player){
        if(this.getSize()<maxSize){
            this.players.add(player);}
        else{}}
    
    public void printPlayers(){
        int size = players.size();
        
        for(int i=0;i<size;i++){
            System.out.println(players.get(i));}}
    
    public void setMaxSize(int max){
        this.maxSize = max;}
    
    public int getSize(){
        return players.size();}
    
    public int goals(){
        int goals=0;
        for(int i=0; i<this.getSize();i++){
            goals =goals + players.get(i).getGoals();}
        return goals;}
    
}
